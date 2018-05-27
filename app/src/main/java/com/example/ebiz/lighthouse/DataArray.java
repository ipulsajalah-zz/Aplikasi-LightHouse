package com.example.ebiz.lighthouse;

import android.util.Log;
import android.view.View;

public class DataArray {
   private String pilihanKiri1[] = {
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
    private String pilihanKanan1[] = {
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
    private String header[] = {
            "YANG MEMBUAT SAYA BERSEMANGAT :",
            "YANG PENTING UNTUK SAYA :",
            "CARA SAYA MENGAMBIL KEPUTUSAN :",
            "CARA SAYA MENJALANI HIDUP :"
    };
    public String PrintLeft(){
        SelectData data = new SelectData();
        if (data.getLeft() >= 0 && data.getLeft() <= 11){
         return pilihanKiri1[data.addLeft()];
        }else if (data.getLeft() >= 12 && data.getLeft() <= 22){
         return pilihanKiri1[data.addLeft()];
        }else if (data.getLeft() >= 23 && data.getLeft() <= 33){
         return pilihanKiri1[data.addLeft()];
        }else if (data.getLeft() >= 34 &&  data.getLeft() <= 44){
         return pilihanKiri1[data.addLeft()];
        }
        return pilihanKiri1[data.addLeft()];
    }
    public String PrintRight(){
        SelectData data = new SelectData();
        if (data.getRight() >= 0 && data.getRight() <= 11){
            return pilihanKanan1[data.addRight()];
        }else if (data.getRight() >= 12 && data.getRight() <= 22){
            return pilihanKanan1[data.addRight()];
        }else if (data.getRight() >= 23 && data.getRight() <= 33){
            return pilihanKanan1[data.addRight()];
        }else if (data.getRight() >= 34 &&  data.getRight() <= 44){
            return pilihanKanan1[data.addRight()];
        }
        return pilihanKanan1[data.addRight()];
    }
}
