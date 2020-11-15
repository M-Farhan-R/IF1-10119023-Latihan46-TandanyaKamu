/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package if1.pkg10119023.latihan46.tandanyakamu;

/**
 *
 * @author 
 * NAMA              : Muhammad Farhan R 
 * KELAS             : IF1
 * NIM               : 10119023
 * Deskripsi Program : program dukun (*‘ω‘ *)
 *
 */
import java.time.Year;
import java.util.Scanner;
public class IF110119023Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Age a = new Age(Year.now().getValue()); //get year value as int
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir : ");
        a.setYearBirth(scan.nextInt());
        System.out.println();
        
        int umur = a.hitungUmur();
        System.out.println("=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun Lahir : "+a.getYearBirth());
        System.out.println("Hari ini tahun : "+a.getYearNow());
        System.out.println("Umur kamu sampai hari ini "+umur);
        System.out.println("Tandanya Kamu ".concat(a.tandanyaKamu(umur)));
    }

}
