/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.informasi.penjualan;

/**
 *
 * @author hayaqo
 */
public class SistemInformasiPenjualanBackup {
    
    String namaSiswa; //ini adalah Variable jenis Class Properti
    
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil();
        Mobil mobil2 = new Mobil();
        
        //{1, "budy", false}
        
        System.out.println("Kecepatan Mobil 1 : " + mobil.speed);
        System.out.println("Kecepatan Mobil 2 : " + mobil2.speed);
         
        String name, address;
        int age;
        double score;
        boolean isGraduated;
                
        name = "akil"; 
        address = "Depok";
        age = 25;
        score = 3.5;
        isGraduated = true;
        
        System.out.println("BIODATA");
        System.out.println("=====================================================");
        System.out.println("Nama \t\t\t: " + name);
        System.out.println("Alamat \t\t\t: " + address);
        System.out.println("Umur \t\t\t: " + age);
        System.out.println("Nila \t\t\t: " + score);
        System.out.println("Status Kelulusan \t: " + isGraduated);
        System.out.println("=====================================================");
        
        
        int angka1 = 5;
        int angka2 = 2;
        
        System.out.println("Hasil Penjumlahan = " + (angka1 + angka2));
        System.out.println("Hasil Pengurangan = " + (angka1 - angka2));
        System.out.println("Hasil Perkalian = " + (angka1 * angka2));
        System.out.println("Hasil Pembagian = " + (angka1 / angka2));
        System.out.println("Hasil Mod (Hasil bagi) = " + (angka1 % angka2));
        
        if (angka1 < 7) {
            System.out.println("Tidak Lulus");
        } else {
            System.out.println("Selamat, Anda lulus");
        }
        
     }
    
    public static void getBiodata(String name, int age) {
        System.out.println("Nama : " + name + "\nUmur : " + age);
    }
    
}
