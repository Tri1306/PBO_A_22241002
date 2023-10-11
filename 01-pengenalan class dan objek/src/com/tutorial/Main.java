package com.tutorial;

class Mahasiswa {
    String nama;
    String NIM;
    String prodi;
}


public class Main {
    public static void main(String[] args) {
        // instansiasi pembuatan objek
        Mahasiswa mhs1 = new Mahasiswa();

        // objek mhs1 diberi atribut
        mhs1.nama = "tri";
        mhs1.NIM = "22241002";
        mhs1.prodi= "Matematika";
     
       System.out.println("Nama Mahasiswa:" + mhs1.nama);
       System.out.println("NIM Mahasiswa:" + mhs1.NIM);
       System.out.println("Prodi Mahasiswa:" + mhs1.prodi);

       Mahasiswa mhs2 = new Mahasiswa();
       mhs2.nama = "tri";
       mhs2.NIM = "22241002";
       mhs2.prodi = "Matematika";

       System.out.println("Nama Mahasiswa:" + mhs2.nama);
       System.out.println("NIM Mahasiswa:" + mhs2.NIM);
       System.out.println("Prodi Mahasiswa:" + mhs2.prodi);
    }
}

