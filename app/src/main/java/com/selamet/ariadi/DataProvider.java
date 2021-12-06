package com.selamet.ariadi;

import android.content.Context;

import com.selamet.ariadi.model.Elang;
import com.selamet.ariadi.model.Hewan;
import com.selamet.ariadi.model.Hiu;
import com.selamet.ariadi.model.Primata;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Primata> DataPrimata(Context ctx) {
        List<Primata> Primatas = new ArrayList<>();
        Primatas.add(new Primata("Orangutan Sumatra", "Sumatra",
                "Hewan yang memakan buah-buahan seperti mangga, nangka, durian serta leci. Selain itu, Orangutan Sumatera juga memakan telur dan vertebrata kecil. ", R.drawable.pri1));
        Primatas.add(new Primata("Simakobu atau Pig-tailed Langur", "Kepulauan Mentawai",
                "Simakobu adalah salah satu keluarga kera. Populasinya yakni 6.700–17.300 ekor (IUCN, 2006). Simakobu saat ini statusnya adalah sebagai hewan langka.", R.drawable.pri2));
        Primatas.add(new Primata("Monyet Hitam Sulawesi atau yaki", "Sulawesi",
                "Yaki atau monyet wolai atau monyet hitam Sulawesi (Macaca nigra)/monyet pantat merah adalah satwa endemik Indonesia yang hanya terdapat di Pulau Sulawesi bagian utara dan beberapa pulau di sekitarnya, yakni di Hutan Tangkoko Bitung", R.drawable.pri3));
        Primatas.add(new Primata("Bekantan", "Kalimantan",
                "Bekantan adalah monyet yang memiliki hidung panjang dan hewan yang mengonsumsi biji-bijian dan buah-buahan. Ia juga bisa makan daun yang dapat menghasilkan gas ketika dicerna.", R.drawable.pri4));
        Primatas.add(new Primata("Beruk Mentawai", "Kepulauan Mentawai",
                "Orang lokal menyebutnya Bokoi atau bokkoi (Macaca pagensis). Mereka adalah sejenis monyet yang menyebar terbatas (endemik) di Kepulauan Mentawai, lepas pantai barat Sumatera.", R.drawable.pri5));
        return Primatas;
    }

    private static List<Elang> DataElang(Context ctx) {
        List<Elang> Elangs = new ArrayList<>();
        Elangs.add(new Elang("Elang Hitam", "Asia tropis",
                "Black eagle ialah spesies elang dengan kekuatan pertahanan besar dan tersebar bermacam daerah ketinggian tiga ratus hingga dua ribu mdpl, Karakteristik spesial black eagle dilihat dari sayapnya yang nampak menjari, lebar serta kuat.", R.drawable.el1));
        Elangs.add(new Elang("Elang Brontok", "Sumatra, Kalimantan, Jawa, Bali dan Nusa Tenggara",
                "Elang brontok adalah sejenis burung pemangsa anggota suku Accipitridae. Dinamai demikian kemungkinan karena warnanya yang berbercak-bercak (pada bentuk yang berwarna terang).", R.drawable.el2));
        Elangs.add(new Elang("Elang Jawa", "Jawa",
                "Burung elang jawa tersebut tinggal di zona pedalaman serta sekunder pada tinggi 3 ratus di atas permukaan laut.", R.drawable.el3));
        Elangs.add(new Elang(" Elang Ular Bido", "Asia",
                "Dikenal juga sebagai Crested Serpent Eagle atau CSE oleh sebagian pecinta burung pemangsa (BOP)", R.drawable.el4));
        Elangs.add(new Elang("Elang Ular Jari Pendek", "Pengembara",
                "Hewan Elang ular jari pendek ialah hewan besar dengan suatu dimensi 65 centimeter. Badannya yang perkasa dengan suatu warna bulu putih. Hewan tersebut sangat tidak sering buat nampak.", R.drawable.el5));
        return Elangs;
    }

    private static List<Hiu> DataHiu(Context ctx) {
        List<Hiu> Hius = new ArrayList<>();
        Hius.add(new Hiu("Hiu Goblin", "Indo-Pasifik dan Oceania",
                "Dilihat dari penampilannya saja, hiu yang satu ini sudah terlihat mengerikan. Bagaimana tidak, ia memiliki tanduk di dahinya, tak seperti hiu pada umumnya.", R.drawable.hiu1));
        Hius.add(new Hiu("Hiu Great White Shark", "pesisir perairan di seluruh permukaan lautan utama",
                        "Great White Shark adalah hiu pemakan daging terbesar di dunia. Para betinanya bisa tumbuh hingga enam meter, sedangkan hiu jantan bisa tumbuh hingga empat meter. Mereka bisa ditemukan di seluruh samudra, tetapi lebih banyak menempati wilayah yang hangat.", R.drawable.hiu2));
        Hius.add(new Hiu("Hiu banteng", "Amerika Utara hingga Selatan",
                "Hiu banteng memiliki tubuh yang relatif kecil, yaitu berkisar antara dua hingga tiga meter saja. Namun jangan remehkan mereka. Hiu banteng sering kali disebut sebagai hiu paling berbahaya di dunia.", R.drawable.hiu3));
        Hius.add(new Hiu("Hiu harimau", "Perairan Samudera Hindia.",
                "Hiu harimau memiliki reputasi sebagai pemakan manusia. Mereka adalah hiu paling berbahaya kedua setelah hiu banteng. Tubuhnya cukup besar karena bisa tumbuh hingga sepanjang lima meter. ", R.drawable.hiu4));
        Hius.add(new Hiu("Hiu martil", " Samudera Hindia sebelah selatan Jawa dan Nusa Tenggara.",
                "Hiu martil terkenal karena bentuk kepalanya yang unik. Mereka juga tergolong cukup besar karena bisa tumbuh hingga sepanjang enam meter.", R.drawable.hiu5));
        return Hius;
    }

    private static void AllHewans(Context ctx) {
        hewans.addAll(DataPrimata(ctx));
        hewans.addAll(DataElang(ctx));
        hewans.addAll(DataHiu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            AllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
