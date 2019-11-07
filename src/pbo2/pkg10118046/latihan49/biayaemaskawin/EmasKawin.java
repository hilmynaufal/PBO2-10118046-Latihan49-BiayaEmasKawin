package pbo2.pkg10118046.latihan49.biayaemaskawin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class EmasKawin {
    private double berat, harga, total;    

    public EmasKawin(double berat, double harga) {
        this.berat = berat;
        this.harga = harga;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }
    
    public double hitungJumlah(double berat, double harga) {
        return berat*harga;
    }
}
