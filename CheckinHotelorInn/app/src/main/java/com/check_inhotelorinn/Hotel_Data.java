package com.check_inhotelorinn;

import java.util.ArrayList;

public class Hotel_Data {
    private static String[] daftarnamahotel = {
            "Permata Sari Hotel's",
            "Jati Agung Motel",
            "Penginapan Merih Asri",
            "Surya Resto & Hotel",
            "Penginapan Pak Mamat",
            "Hotel Anugrah",
            "Penginapan Way Huwi",
            "Saidah Guest House",
            "Penginapan Jati Agung",
            "Villa Tanah Abang"
    };

    private static String[] detailhotel = {
            "Terletak di Bandar Lampung, 11 km dari Mal Boemi Kedaton, Aston Lampung City Hotel menawarkan restoran, tempat parkir pribadi gratis, bar, dan lounge bersama.",
            "Terletak di Lampung Selatan, wilayah Sumatra, berada dalam jarak 13 km dari Boemi Kedaton Mall.",
            "Terletak di wilayah Jakarta Selatan, wilayah padat penduduk, Rp.150.000,- per malam, Sarapan pagi, Kamar mandi di dalam ",
            "Menawarkan Wi-Fi gratis, Surya Resto & Hotel terletak di Bandar Lampung, 4,3 km dari Mal Boemi Kedaton. Pilihan sarapan ala carte dan Asia tersedia setiap pagi di guest house.",
            "Terletak di Lampung Selatan, Fasilitas Kipas Angin, Kamar mandi, Lemari baju, include sarapan pagi, Rp.100.000,00",
            "Hotel Anugrah Lampung menawarkan akomodasi bergaya minimalis modern dengan pusat bisnis dan meja depan 24 jam. Hotel ini menyediakan akses Wi-Fi gratis di seluruh areanya",
            "Terletak di Bandar Lampung, 5 km dari Mal Boemi Kedaton, dekat ITERA, menawarkan akomodasi dengan Wi-Fi gratis dan tempat parkir pribadi gratis.",
            "Penginapan nyaman, fasilitas kamar mandi, tv, Ruang Keluarga, Gym, dan BAR.",
            "Terletak di Bandar Lampung, Golden Tulip Springhill Lampung menyediakan restoran, kolam renang luar ruangan, bar, dan taman.",
            "Jalan Pangeran Antasari Lampung terletak di Bandar Lampung, 8 km dari Boemi Kedaton Mall, dan menawarkan akomodasi dengan Wi-Fi gratis."
    };

    private static int[] foto ={
            R.drawable.h1,
            R.drawable.h2,
            R.drawable.h3,
            R.drawable.h4,
            R.drawable.h5,
            R.drawable.h6,
            R.drawable.h7,
            R.drawable.h8,
            R.drawable.h9,
            R.drawable.h10
    };

    static ArrayList <Hotel_Constructor> getListData() {
        ArrayList<Hotel_Constructor> list = new ArrayList<>();

        for(int pos=0; pos<daftarnamahotel.length; pos++){
            Hotel_Constructor hc = new Hotel_Constructor();
            hc.setNama(daftarnamahotel[pos]);
            hc.setDetail(detailhotel[pos]);
            hc.setFoto(foto[pos]);

            list.add(hc);
        }
        return list;
    }


}
