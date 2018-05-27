package com.example.ebiz.lighthouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Survei extends AppCompatActivity {
    String pilihanKiri1[] = {
            "Dikerjakan beramai-ramai",
            "Menyapa duluan",
            "Cerewet",
            "Semangat bila dikelilingi banyak orang",
            "Suka membuka diri",
            "Suka kumpul-kumpul",
            "Bicara dulu baru berpikir",
            "Berpartisipasi langsung",
            "Suka disorot",
            "Santai",
            "Dibicarakan dulu",
            "Yang bisa saya dengar, raba, rasakan",
            "Menemukan hal baru",
            "Praktisnya saja",
            "Berurutan dan teratur",
            "Yang biasa dikenal",
            "Rutinitas",
            "Yang penting saat ini",
            "Cara-cara lama",
            "Spesifik",
            "Detail",
            "Apa yang terjadi sekarang",
            "Berdasarkan logika",
            "Sesuai dengan standar normal",
            "Analisa dan memeriksa",
            "Obyektif",
            "Adil",
            "Mencari apa yang salah",
            "Tidak personal",
            "Yang sebenarnya",
            "Mempertahankan pendapat",
            "Dampaknya ke situasi",
            "Alasan lebih penting dari pendapat",
            "Tegas memutuskan",
            "Tepat waktu",
            "Terkontrol",
            "Tegas, cenderung kaku",
            "Lebih baik dibuat daftarnya dulu",
            "Mulai dicicil dulu",
            "Mencapai target",
            "Terstruktur",
            "Langsung diselesaikan",
            "Rapi",
            "Terencana"
    };
    String pilihanKanan1[] = {
            "Dikerjakan sendiri",
            "Menunggu disapa",
            "Pendiam",
            "Cape bila dikelilingi banyak orang",
            "Menutup diri",
            "Tidak suka rame-rame",
            "Berpikir dulu baru bicara",
            "Menonton saja dulu",
            "Di belakang layar saja",
            "Serius",
            "Direnungkan dulu",
            "Mengandalkan instink saya",
            "Menciptakan sendiri",
            "Berandai-andai",
            "Acak",
            "Sesuatu yang baru",
            "Tidak boleh sama",
            "Butuh tahu alasan",
            "Cara-cara baru",
            "Umum",
            "Gambaran besar saja",
            "Apa yang terjadi di masa depan",
            "Berdasarkan perasaan",
            "Sesuai yang saya percayai",
            "Suportif dan berdasarkan empati",
            "Subyektif",
            "Belas kasihan",
            "Tidak usah terlalu kritis",
            "Personal",
            "Ada taktiknya",
            "Jangan ribut",
            "Dampaknya ke orang banyak",
            "Pendapat lebih penting dari alasan",
            "Minta informasi dulu",
            "Santai",
            "Tiba-tiba atau dadakan",
            "Fleksibel",
            "Tidak suka membuat daftar",
            "Saat-saat terakhir saja",
            "Yang penting cara melakukannya benar",
            "Tidak sistematis",
            "Menunggu, masih ada pilihan lain",
            "Berantakan",
            "Spontan"
    };

    String header[] = {
            "YANG MEMBUAT SAYA BERSEMANGAT :",
            "YANG PENTING UNTUK SAYA :",
            "CARA SAYA MENGAMBIL KEPUTUSAN :",
            "CARA SAYA MENJALANI HIDUP :"
    };
    int h = 0;
    int i = 0;
    int tampil;
    int jmlKiri = 0;
    int jmlKanan = 0;
    public void setHeader(){
        if (i >= 0 && i <= 11){
            tampil = 0;
        }else if (i >= 12 && i <= 22){
            tampil = 1;
        }else if (i >= 23 && i <= 33){
            tampil = 2 ;
        }else if (i >= 34 &&  i <= 44){
            tampil = 3;
        }
    }

    MBTISection section1 = new MBTISection();
     MBTISection section2 = new MBTISection();
     MBTISection section3 = new MBTISection();
     MBTISection section4 = new MBTISection();
    public void addLeft(){
        if (h >= 0 && h <= 11){
            section1.addLeft1();
             Log.d("kiri 1",String.valueOf(section1.getLeft1()));
        }else if (h >= 12 && h <= 22){
            section2.addLeft2();
            Log.d("kiri 2",String.valueOf(section2.getLeft2()));
        }else if (h >= 23 && h <= 33){
            section3.addLeft3();
             Log.d("kiri 3",String.valueOf(section3.getLeft3()));
        }else if (h >= 34 &&  h <= 44){
            section4.addLeft4();
            Log.d("kiri 4",String.valueOf(section4.getLeft4()));
        }

    }
    public void addRight(){
        if (h >= 0 && h <= 11){
            section1.addRight1();
             Log.d("Kanan 1",String.valueOf(section1.getRight1()));
        }else if (h >= 12 && h <= 22){
            section2.addRight2();
             Log.d("Kanan 2",String.valueOf(section2.getRight2()));
        }else if (h >= 23 && h <= 33){
            section3.addRight3();
             Log.d("Kanan 3",String.valueOf(section3.getRight3()));
        }else if (h >= 34 &&  h <= 44){
            section4.addRight4();
             Log.d("Kanan 4",String.valueOf(section4.getRight4()));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survei);
        Button  pilihKiri = (Button) findViewById(R.id.button1);
        Button  pilihKanan = (Button) findViewById(R.id.button2);
        TextView view = (TextView) findViewById(R.id.textView1);
        pilihKiri.setText(pilihanKiri1[h++]);
        pilihKanan.setText(pilihanKanan1[i++]);
        view.setText(header[tampil]);
        
        pilihKiri.setOnClickListener(new View.OnClickListener()
        {
            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
            TextView view = (TextView) findViewById(R.id.textView1);
            @Override
            public void onClick(View v) {
                jmlKiri++;
                button1.setText(pilihanKiri1[h++]);
                button2.setText(pilihanKanan1[i++]);
                setHeader();
                addLeft();
                view.setText(header[tampil]);
            }
        });

        pilihKanan.setOnClickListener(new View.OnClickListener() {
            Button button1 = (Button) findViewById(R.id.button1);
            Button button2 = (Button) findViewById(R.id.button2);
            TextView view = (TextView) findViewById(R.id.textView1);

            @Override
            public void onClick(View v) {
                jmlKanan++;
                button1.setText(pilihanKiri1[h++]);
                button2.setText(pilihanKanan1[i++]);
                setHeader();
                addRight();
                view.setText(header[tampil]);
            }
        });
    }
}
