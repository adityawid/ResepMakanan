package com.devjurnal.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ResepModel> listResep;
    ResepAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 1. koneksi dengan recycler pada XML
        recycler = (RecyclerView) findViewById(R.id.recyclerView);

        // TODO 2. Buat Model Class
        // TODO 3. BUat Array List
        listResep = new ArrayList<>();

        // TODO 4. Set data ke ResepModel


        ResepModel resep3 = new ResepModel();
        ResepModel resep4 = new ResepModel();
        ResepModel resep5 = new ResepModel();


        // TODO 5. Masukkan data ke List
        for (int i=0; i< 20; i++) {
            ResepModel resep1 = new ResepModel();
            resep1.setJudul("Olahan Cumi Ala Resto");
//            resep1.setPoster("cumigorengtelurasin"); // https://selerasa.com/images/cumigorengtelurasin.png
            resep1.setPoster("https://selerasa.com/images/cumigorengtelurasin.png");
            resep1.setSummary("Hidangan ini akan cukup mudah untuk anda olah dan dipraktikan di rumah. Betapa tidak, resep kali ini telah kami rangkum sesederhana mungkin sehingga mampu memberikan sajian yang mudah untuk ditiru.");
            resep1.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan : 15 menit\n" +
                    "Memasak : 20 menit\n" +
                    "Total : 35 Menit\n" +
                    "\n" +
                    "Bahan-Bahan:\n" +
                    "\n" +
                    "500 gram cumi\n" +
                    "minyak goreng untuk menggoreng\n" +
                    "1/2 sendok makan air jeruk nipis\n" +
                    "3/4 sendok teh garam\n" +
                    "Bahan Pelapis:\n" +
                    "50 gram tepung terigu\n" +
                    "1/4 sendok teh garam\n" +
                    "50 gram maizena\n" +
                    "25 gram tepung sagu\n" +
                    "1/4 sendok teh merica\n" +
                    "Bahan Pencelup:\n" +
                    "\n" +
                    "150 ml air es\n" +
                    "Bahan Tumisan:\n" +
                    "\n" +
                    "4 siung bawang putih, cincang halus\n" +
                    "2 buah kuning telur, dihaluskan\n" +
                    "2 buah cabai hijau besar, dicincang halus\n" +
                    "1/4 sendok teh merica bubuk\n" +
                    "3 buah kuning telur asin, dihaluskan\n" +
                    "1 batang daun bawang, diiris halus\n" +
                    "1/2 sendok teh kecap asin\n" +
                    "2 sendok makan minyak goreng untuk menumis\n" +
                    "Persiapan Membuat Cumi Goreng Telur Asin yang Sedap:\n" +
                    "\n" +
                    "Untuk yang pertama, kita akan lakukan langkah kali ini dengan terlebih dahulu membersihkan cuminya secara merata. Hal ini akan penting sekali untuk dilakukan karena cumi perlu dalam keadaan bersih. Untuk itu, maka silahkan masukkan cumi kedalam baskom atau wadah. Untuk selanjutnya silahkan bawa ke tempat cucian untuk selanjutnya bersihkan secara merata.\n" +
                    "Ditempat cucian pastikan cumi dibersihkan dengan menggunakan air bersih secara merata. Lalu, remas-remas dengan menggunakan tangan. Untuk membersihkan bagian dalamnya secara merata.\n" +
                    "Bila sudah bersih dan selesai, silahkan ambil dan masukkan kembali kedalam baskom. Selanjutnya, buang air yang masih menggenang lalu sisihkan dalam wadah dan tiriskan.\n" +
                    "Dalam baskom, silahkan bumbui cumi dengan mengguankan air jeruk nipis. Lalu taburi dengan menggunakan garam secara merata. Kemudian aduk-aduk sampai semua bahan ini tercampur dan teraduk.\n" +
                    "Cara diatas dilakukan agar bau amis pada cumi menjadi lebih berkurang secara merata. Untuk itu, sisihkan sementara sampai meresap selama kurang lebih 15 menit.\n" +
                    "Cara Membuat Cumi Goreng Telur Asin yang Sedap:\n" +
                    "\n" +
                    "Bila bahan sajian diatas sudah dicampur dan diaduk secara merata. Selanjutnya kita akan buat cumi krispi dan digoreng.\n" +
                    "Untuk itu, kita akan buat terlebih dahulu bahan pelapis untuk membuat sajian cumi kali ini. Caranya, silahkan aduk secara merata tepung terigu bersama dengan tepung sagu, merica dan juga garam secara merata. Lalu tambahkan tepung mazeina kedalamnya. Kemudian aduk-aduk kembali sampai semua bahan tercampur secara merata.\n" +
                    "Setelah itu, lumuti cumi dengan bahan pelapis sampai semua daging cumi terbaluti dengan bumbu tersebut secara merata.\n" +
                    "Setelah itu, celupkan pada bahan celupan secara merata dan tercampur. Lalu gulingkan kembali pada bahan pelapis sampai terbaluti merata.\n" +
                    "Bila semua cumi sudah dibaluti dengan bahan pelapis secara merata. Sekarang siapkan sebuah wajan dan masukkan minyak goreng kedalamnya. Untuk kemudian tunggu samapi minyak menjadi lebih panas secara merata.\n" +
                    "Goreng cumi sampai merata dan lebih krispi kecoklatan. Setelah itu, angkat dan sisihkan sementara agar minyaknya lebih tiris.\n" +
                    "Untuk membuat bumbu telur asin kali ini, silahkan kembali panaskan secukupnya minyak dalam wajan. Tunggu sampai panas, selanjutnya masukkan bawang putih bersama dengan cabai hijau. Masak sajian ini sampai matang secara merata hingga harum.\n" +
                    "Lalu tambahkan dengan menggunakan kecap asin dan juga merica bubuk kedalamnya. Aduk-aduk sampai semua sajian ini menjadi rata secara keseluruhan.\n" +
                    "Tambahkan kuning telur asin kedalamnya dan kuning telur biasa. Lalu aduk-aduk semua bahan ini secara merata dan tambahkan cumi yang sudah anda goreng kedalamnya.\n" +
                    "Masukkan daun bawang dan masak semua sajian ini sampai cumi terbaluti dengan bumbu secara keseluruhan.");
            listResep.add(resep1);

            ResepModel resep2 = new ResepModel();
            resep2.setJudul("Dendeng Daging Sapi");
//            resep2.setPoster("dendengkering"); // https://selerasa.com/images/daging/dendeng-kerings.jpg
            resep2.setPoster("https://selerasa.com/images/daging/dendeng-kerings.jpg");
            resep2.setSummary("Sajian dendeng sapi kering adalah salah satu sajian makanan dari daging yang enak.\n" +
                    "Hidangan ini juga cukup praktis dibuat dan bisa diawetkan dalam lemari es untuk beberapa waktu, sehingga ketika anda ingin menyantap sajian ini suatu hari, anda dapat mengolahnya dengan cara menggoreng saja hidangan dendeng yang sudah anda buat.");
            resep2.setDetail("Waktu Memasak\n" +
                    "\n" +
                    "Persiapan: 40 menit\n" +
                    "\n" +
                    " \n" +
                    "Memasak: 180 menit\n" +
                    "\n" +
                    "Total: 240 menit\n" +
                    "\n" +
                    "Jumlah Porsi\n" +
                    "\n" +
                    "12 Porsi\n" +
                    "\n" +
                    "Bahan-Bahan yang Diperlukan Untuk Membuat Sajian Dendeng Daging Sapi Kering Enak dan Empuk\n" +
                    "\n" +
                    "Bahan Utama Membuat Dendeng Daging Sapi Kering:\n" +
                    "\n" +
                    "1 kg daging sapi\n" +
                    "Bahan dan Bumbu Dendeng Sapi Kering:\n" +
                    "\n" +
                    "8 siung bawang putih, kupas\n" +
                    "4 buah cabe merah, diulek kasar\n" +
                    "1/2  sdm asam jawa\n" +
                    "1 sdt merica bubuk\n" +
                    "2 sdm garam\n" +
                    "1/2 ons ketumbar\n" +
                    "300 gr gula merah\n" +
                    "Air kaldu dari rebusan daging\n" +
                    "1 liter air untuk merebus daging\n" +
                    "Cara Membuat Dendeng Daging Sapi Kering Enak dan Empuk\n" +
                    "\n" +
                    "Cara Mengolah Daging Sapi Sebelum Diberikan Bumbu:\n" +
                    "\n" +
                    "Hal pertama yang bisa dilakukan terlebih dahulu adalah dengan memotong-motong daging sapi yang sudah anda siapkan dengan bentuk sesuai dengan selera. Hanya saja, usahakan untuk memotong daging melawan arah serat daging agar ketika daging dimasak tidak mudah hancur, selain itu, daging yang dipotong dengan arah melawan serat akan membuat daging menjadi lebih mudah empuk.\n" +
                    "Setelah selesai memotong-motong daging, selanjutnya silahkan masukan potongan daging kedalam wadah atau mangkuk berukuran besar.\n" +
                    "Siapkan talenan atau berikan alas yang bersih dibagian bawah daging, kemudian ambil pemukul daging dan pipihkan daging dengan menggunakan pemukul hingga daging menjadi bentuk pipih.\n" +
                    "Setelah dipipihkan, masukkan kembali daging kedalam wadah atau mangkuk dan sisihkan sementara sebelum kita olah dan dibumbui dengan rempah.\n" +
                    "Cara Membuat Dendeng Daging Sapi Kering:\n" +
                    "\n" +
                    "Siapkan panci, berikan air secukupnya dan masukkan potongan daging kedalam panci tersebut kemudian masukkan bawang putih dan rebus daging hingga teksturnya menjadi lebih empuk dan hampir matang serta kuah rebusan daging menjadi menyusut lebih sedikit.\n" +
                    "Selanjutnya, silahkan haluskan semua bumbu hingga bumbu benar-benar halus secara merata.\n" +
                    "Masukkan bumbu yang telah dihaluskan tersebut kedalam wadah dan angkat daging dari rebusan kemudian lumuri smeua permukaan daging dengan bumbu halus ini. Pastikan jika semua bagian permukaan daging dibersihkan dengan baik.\n" +
                    "Setelah itu, diamkan terlebih dahulu daging selama kurang lebih 2-3 jam sampai bumbu yang dilumuri pada daging bisa meresap secara keseluruhan kedalam daging.\n" +
                    "Selesai didiamakan selama waktu yang telah ditentukan, sekarang jemur daging dibawah terik sinar matahari sampai dendeng daging menjadi benar-benar kering secara merata dan tidak ada kandungan air pada daging.\n" +
                    "Setelah daging kering dari jemuran, sekarang siapkan minyak diatas wajan yang panas dan tunggu hingga minyak panas. Kemudian goreng dendeng hingga matang, jangan dulu membalikan dendeng, biarkan terlebih dahulu hingga kering dan baru balikan.");
            listResep.add(resep2);

        }
        // TODO 6. Buat Adapter
        // TODO 7. Set Adapter
        adapter = new ResepAdapter(MainActivity.this, listResep);
        recycler.setAdapter(adapter);

        // TODO 8. Buat LayoutManager
        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        recycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

    }
}
