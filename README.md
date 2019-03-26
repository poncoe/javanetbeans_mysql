# Java Netbeans + MySQL (CRUD)

Belajar membuat program Netbeans dengan bahasa Java dan terkoneksi dengan MySQL

# Tools yang harus diperlukan

- IDE Netbeans [Download](https://netbeans.org/downloads/8.0.2/)
- XAMPP Ver 5 / 7 (Mac Recommended use Ver 5) [Download](https://www.apachefriends.org/download.html)
- Library Json-Simple (Optional. Kalo mau terintegrasi dgn JSON ya di download & ditambahin librarynya) [Download](https://jar-download.com/artifacts/com.googlecode.json-simple/json-simple/1.1.1/source-code)
- Kucing Item Putih on Playstore [Download](https://play.google.com/store/apps/details?id=id.kataponcoe.kucingitemputih)
- JDK & JRE (Kalo udah di download & Install yaudah gausah)
- MYSQL JDBC Driver

# Import Library MYSQL JDBC Driver & Json-Simple ke Project

- Import Library MYSQL JDBC

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/import1.png)
![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/import2.png)

Klik Kanan pada folder Libraries dan pilih "Add Library", pilih "MYSQL JDBC Driver" dan Add Library.

- Import Library Json-Simple

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/import3.png)
![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/import4.png)

caranya sama kayak Import Library MYSQL JDBC tapi ini choose file, pastiin filenya udah ke download.

- Setelah di Import

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/import5.png)

# Mengaktifkan XAMPP

Pastiin kalian telah mengaktifkan modul MySQL Database & Apache Web Server, jadi gunanya Modul MySQL DB untuk menjalankan hal yang berkaitan dengan database MySQL, dan Apache Web Server untuk menggunakan localhost Phpmyadmin.

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/xamp1.png)

Penyebab gagal running modul MySQL Database yaitu mengganti port connection dari 3306 ke 3307, biasanya error ini paling terjadi pada pengguna Mac, Windows jarang banget. dan itu terjadi karena konflik port koneksi. cara alternatifnya mematikan wifi / enthernet.

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/xamp2.png)

# Mengakses Localhost PhpMyAdmin

kalian bisa menggunakan localhost secara offline dan tidak online, menggunakan browser yang disarankan Google Chrome, dengan cara mengetikan di address bar yaitu :

```javascript
localhost/phpmyadmin
```

dan akan muncul seperti ini 

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/phpmyadmin1.png)

dan kalian bisa membuat database di MySQL pada Localhost/PhpMyAdmin

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/phpmyadmin2.png)

# Output Program

![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/output1.png)
![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/output2.png)
![alt text](https://github.com/poncoe/javanetbeans_mysql/blob/master/screenshot/output3.png)

# Bug?

Bantu Gw untuk memperbaiki bug (jika ada) xD

