package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan dan menentukan titik kordinaat menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "jingga");
        System.out.println("Warna Kordinat : ".concat(warnaKoordinat.getNamaWarna()));
        System.out.println("Koordinat Sumbu : "+warnaKoordinat.getX()+", "+warnaKoordinat.getY());
    }
}
