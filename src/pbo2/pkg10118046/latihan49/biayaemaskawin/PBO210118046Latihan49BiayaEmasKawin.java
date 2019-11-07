/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan49.biayaemaskawin;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mengitung emas kawin
 */
public class PBO210118046Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmasKawin emas = new EmasKawin(15.7, 570000);
        System.out.println("Berat Emas yang ingin dibeli \t= " + emas.getBerat() + " gram");
        System.out.println("Harga per gram \t\t\t= Rp. " + emas.getHarga());
        System.out.println("Total yang harus dibayar \t= Rp. " + emas.hitungJumlah(emas.getBerat(), emas.getHarga()));
    }

}
