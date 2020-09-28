/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.penjualan;

import java.util.Scanner;
import entity.Category;

/**
 *
 * @author hayaqo
 */
public class Sip extends Mobil {
    
    public static void main(String[] args) {
        registrasi("rudi", "Jakarta", 18, 70, false);
        registrasi("Rina", "Depok", 21, 82, true);
        
        penjumlahan(3, 6);
        penjumlahan(50, 100);
        perkalian(1232, 21323);
        
        int hasil = kalikan(3, 5);
        print("Hasil = " + hasil);
        
        Mobil mobil = new Mobil();
        mobil.kalikanDariMoibl(3, 6, 7);
    }
    
    public static void penjumlahan(int angka1, int angka2) {
        print("Hasil = " + (angka1 + angka2));
    }
    
    public static void perkalian(int angka1, int angka2) {
        print("Hasil = " + (angka1 * angka2));
    }
    
    public static void print(String msg) {
        System.out.println(msg);
    }

    private static void registrasi(String name, String address, int age, int score, boolean isGraduated) {
        print("Biodata");
        print("==============================================");
        print("Nama : " + name);
        print("Alamat : " + address);
        print("Umur : " + age);
        print("Score : " + score);
        print("Status Kelulusan : " + isGraduated);
        print("==============================================");
    }
    
    
    public static int kalikan (int angka1, int angka2) {
        int hasil;
        hasil = angka1 *  angka2;
        return hasil;
    }
      
}
