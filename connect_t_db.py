import sqlite3
connection=sqlite3.connect("C:\sqlite\e_commerce.db")
cursor= connection.cursor()
req=cursor.execute('SELECT * FROM  data_cleaned')
print(req.fetchall())
connection.close()
