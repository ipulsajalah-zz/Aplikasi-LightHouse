package com.example.ebiz.lighthouse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Survei extends AppCompatActivity implements View.OnClickListener {


    int questionPerGroup = 11;

    String leftText[] = {
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
    String rightText[] = {
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

    String headerList[] = {
            "YANG MEMBUAT SAYA BERSEMANGAT :",
            "YANG PENTING UNTUK SAYA :",
            "CARA SAYA MENGAMBIL KEPUTUSAN :",
            "CARA SAYA MENJALANI HIDUP :"
    };

    int current = 0;

    Button leftOption;
    Button rightOption;
    TextView title;

    MBTISection currentSection;
    MBTISection section1 = new MBTISection();
    MBTISection section2 = new MBTISection();
    MBTISection section3 = new MBTISection();
    MBTISection section4 = new MBTISection();


    public void addLeft() {
        if (current <= 11) {
            section1.addLeft();
            Log.d("kiri :", String.valueOf(section1.getLeft()));
        } else if (current <= 22) {
            section2.addLeft();
            Log.d("kiri :", String.valueOf(section2.getLeft()));
        } else if (current <= 33) {
            section3.addLeft();
            Log.d("kiri :", String.valueOf(section3.getLeft()));
        } else if (current <= 44) {
            section4.addLeft();
            Log.d("kiri :", String.valueOf(section4.getLeft()));
        }
    }

    public void addRight() {
        if (current <= 11) {
            section1.addRight();
            Log.d("Kanan :", String.valueOf(section1.getRight()));
        } else if (current <= 22) {
            section2.addRight();
            Log.d("Kanan :", String.valueOf(section2.getRight()));
        } else if (current <= 33) {
            section3.addRight();
            Log.d("Kanan :", String.valueOf(section3.getRight()));
        } else if (current <= 44) {
            section4.addRight();
            Log.d("Kanan :", String.valueOf(section4.getRight()));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survei);
        leftOption = findViewById(R.id.leftOption);
        rightOption = findViewById(R.id.rightOption);
        title = findViewById(R.id.title);

        leftOption.setText(leftText[0]);
        rightOption.setText(rightText[0]);
        title.setText(headerList[0]);

        leftOption.setOnClickListener(this);
        rightOption.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.leftOption:
                addLeft();
                break;
            case R.id.rightOption:
                addRight();
                break;
        }

        current++;

        if (current < leftText.length) {
            // tampilkan pertanyaan berikut
            leftOption.setText(leftText[current]);
            rightOption.setText(rightText[current]);

            // saatnya ganti judul
            if (current % questionPerGroup == 0) {
                int group = (int) Math.floor(current / questionPerGroup);
                title.setText(headerList[group]);
            }
        } else { // final calculation
            MBTICalculator mbtiCalculator = new MBTICalculator();
            mbtiCalculator.setEI(section1);
            mbtiCalculator.setSN(section2);
            mbtiCalculator.setTF(section3);
            mbtiCalculator.setJP(section4);
            Log.i("survey result", mbtiCalculator.getResult());
        }
    }
}
