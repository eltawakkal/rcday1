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
public class Mobil {
    
    int jumlahRoda;
    protected int speed;
    String warna;
        
    public void addSpeed(int increment) {
        speed += increment;
    }
    
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    
    private void berBelok() {
        System.out.println("Mobil Berbelok");
    }
    
    public void kalikanDariMoibl(int angka1, int angka2) {
        System.out.println("Hasil Perkalian = " + (angka1 * angka2));
    }
    
    public void kalikanDariMoibl(int angka1, int angka2, int angka3) {
        System.out.println("Hasil Perkalian = " + (angka1 * angka2));
    }
    
}
