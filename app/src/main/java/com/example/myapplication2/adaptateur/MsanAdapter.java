package com.example.myapplication2.adaptateur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication2.R;
import com.example.myapplication2.model.MsanModel;

import java.util.List;

public class MsanAdapter extends RecyclerView.Adapter<MsanAdapter.MsanViewHolder>{

    // behi l'adapter howwa eli bech yorbet les donner eli jeyiin mel web service ( exmpl mte3na : fichier json )
    // fhemt ???
    //ui  mais eli 9a3ed ta3mel fih enti msans?? el movies deja maw bech nbadloha w nbadlo les attributs ken haka
    // awel 7aja msans hiyya elista eli feha les msan
    // theni 7aja anehouma les attribut eli ta7ki 3lehom ??????
    //ye5i ama lista ta7ki 3leha fibeli ismha msan ba


    private List<MsanModel> msans; // ahayya e lista msans
    private int rowLayout;
    private Context context;


    public static class MsanViewHolder extends RecyclerView.ViewHolder {

        // behi rayen cho lehne famma class essou MsanViewHolder m3aya wala lé ??
        // behi el class hedha fih el 7ajet eli mawjoudin fel fihier xml mta3 un seul element
        // eli hiyya ken tetfaker esmha ui uilist_item_msan.xml
        // behi ken narj3ou la7dha fhemt ??? ui nbadlohom ghhadi mnadhmin , kima t7eb b
        LinearLayout msanLayout;
        TextView msanLabel;
        TextView msanDate;
        TextView msanAdress;
        TextView rating;

//fama barcha 7ajet 9a3det fihem le movies???? ey s7i7

        public MsanViewHolder(View v) {
            super(v);
            msanLayout = (LinearLayout) v.findViewById(R.id.msan_layout);
            msanLabel = (TextView) v.findViewById(R.id.label);
            msanDate = (TextView) v.findViewById(R.id.date);
            msanAdress = (TextView) v.findViewById(R.id.adresse);
            rating = (TextView) v.findViewById(R.id.rating);
        }
    }

    public MsanAdapter(List<MsanModel> msans, int rowLayout, Context context) {
        this.msans = msans;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public MsanAdapter.MsanViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MsanViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MsanViewHolder holder, final int position) {

        // a7na hne ne5dmou bel variable msans eli hiyya lista mta3 des MsanModel kima declarineha
        // elfou9 ( private List<MsanModel> msans; )
        // msans.get(position) traja3lek ka3ba msan m lista m3neha bech traja3lek objet de type MsanModel
        // w el fonction : getTitle() mahich mawjouda fel class MsanModel fhemt 3lech hiyya error ??????????????
        // fhemt ???? hani trani 3al movies, mafhemtech ?
        //movieTitle.setText(msans.get(position).getTitle()) enti tejbed fi ka3ba msan men movietitle
        // behi ahawka badalthom elkol w mazelete el erreur
        // behi 3awed a9ra hedha w rakez aman
        //chof ena taw saye m3ad nkkapti chy
        //nkamlo el partie eli mzelt w 5ali nghom 3la rasi w ghodwa nchallh bech n3awed ntaba3 el tuto w ken
        //fama 7aja n7ot note nes2lek 3leha bh haka ( ok )
        // ama nchallah tchoufou
        //ay le mrigel nchllh
        // behi chouf hedhi kahaw ( 3awed a9ra lostra hedhouma )
        //ay 3lech moch mawjoda el gettitle fil classs  msanmodeel
        // behi jab rabi el class MsanModel 3malneh m3ab3adhna

        holder.msanLabel.setText(msans.get(position).getLabel()); // hedhouma fehom des error
        holder.msanAdress.setText(msans.get(position).getAdresse()); // 5ater a7na badelna les attribut mte3na fel
        holder.msanDate.setText(msans.get(position).getDate_Mise_En_Place()); // class MsanModel fhemt?? ok
        holder.rating.setText(msans.get(position).getActive().toString());
    }

    @Override
    public int getItemCount() {
        return msans.size();
    }
}
