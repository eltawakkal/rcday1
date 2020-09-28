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
public class Percabangan {
    
    public static void main(String[] args) {
        
        int nilai = 50;
        
        if (nilai < 65) {
            print("Nilai: Cukup");
        } else if(nilai >= 60 && nilai < 75) {
            print("Status : Baik");
        } else {
            print("Nilai : Sangat Baik");
        }
        
        int angka = 3;
        
        switch(angka) {
            case 0 :
                print("Angka Tidak Boleh Kosong");
                break;
            case 1:
                print("Angka Terlalu Kecil");
                break;
            case 100:
                print("Ini baru mantap");
                break;
                default:
                    print("Angka Tidak Dikenal");
        }
        
    }

    private static void print(String status) {
        System.out.println(status);
    }
   
    
}
