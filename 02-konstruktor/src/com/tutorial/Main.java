package com.tutorial;

// class tanpa konstruktor
class polos{
    String dataString;
    int dataInteger;
}

// class dengan konstruktor
class Mahasiswa{
    String nama;
    String nim;
    String prodi;

    // Membuat konstruktor tanpa parameter
    // Mahasiswa() {
    //     System.out.println("Ini adalah konstruktor");
    //}

    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        nama = inputNama;
        nim = inputNIM;
        prodi = inputProdi;
        
        System.out.println("Nama : " + nama);
         System.out.println("NIM : " + nim);
          System.out.println("Prodi : " + prodi);
         
    }

    
}

public class Main {
    public static void main(String[] args) {
        // instansiasi objek dari class polos
        polos pls = new polos();

        // // isi ciri pada objek pls
        // pls.dataString = "Polos";
        // pls.dataInteger = 10;

        // // cetak data
        // System.out.println("Isi Data String :" + pls.dataString);
        // System.out.println("Isi Data Integer:" + pls.dataInteger);

        Mahasiswa mhsl = new Mahasiswa("bial", "22241002", "PTI");
        // memanggil konstruktor
    }
}

