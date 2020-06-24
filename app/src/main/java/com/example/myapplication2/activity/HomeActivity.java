package com.example.myapplication2.activity;

import android.os.Bundle;

import com.example.myapplication2.R;
import com.example.myapplication2.adaptateur.MsanAdapter;
import com.example.myapplication2.model.MsanModel;
import com.example.myapplication2.model.MsanResponse;
import com.example.myapplication2.rest.ApiClient;
import com.example.myapplication2.rest.ApiInterface;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        // hedhi instance mel interface mte3na
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.msan_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Call<MsanResponse> call = apiService.getListMsan(API_KEY);
        Call<MsanResponse> call = apiService.getListMsan();
        // hedhiyya 2ayyet lel fonction getListMsan w bech ye5ou eresulta fi variable call
        // fhemt ??
        //ye5i lwah rja3na ne5dmo fil home
        //mich hedha eli bech ytasti mel base
        // to9ssed elhome bech ytassti mel base walla chnowa ??
        //maw 7atina feh les valeur mta3 login w password bech ytastihom
        // enajmou nzidou el code hedheka mba3ed mouch tawwa
        // a7na tawwa n7ebou njibou e llist mta3 les msan
        // mouch mohem win bech n7otouha ( ken t7eb enajmou na3mlou activite o5ra n7ottou feha hedha )
       //sda9ni c bon d5alt fi 7it nchalah mabrouk 3lia
        // behi , rakez ,

        // onResponse wa7da y3aytelha ki yejbed les donne avec succee
        // onFailure y3aytelha ki yabda famma erreur
        // fhemt ??
        //ye5i bech yzid msan jdida hedha ?
        // le le ya rayen aman bech njibou e lista mta3 les msan aman ya rayen
        //ti choof za7  "Number of Msan received: " + msan.size()); ??
        //moch 9a3ed yzid w yzid fi size zda
        // ya rayen aman lehne msan c'est list  List<MsanModel> ma3neha ki ya3mel msan.size()
        // bech traja3mlou e taille mta3 e list ya rayen
        // behi on pass
        call.enqueue(new Callback<MsanResponse>() {
            @Override
            public void onResponse(Call<MsanResponse>call, Response<MsanResponse> response) {
                List<MsanModel> msan = response.body().getResults();
                Log.d(TAG, "Number of Msan received: " + msan.size());
                recyclerView.setAdapter(new MsanAdapter(msan, R.layout.list_item_msan, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<MsanResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });

    }

} //ye5i mich interface hedhika ey 3leh ?? chbik 3malt import clas , !!!!!!!!
//

