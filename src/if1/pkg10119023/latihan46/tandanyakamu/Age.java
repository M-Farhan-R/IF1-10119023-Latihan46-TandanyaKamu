/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan46.tandanyakamu;

/**
 *
 * @author Muhammad Farhan R 
 */

public class Age {
    private int yearBirth;
    private final int yearNow;
    private final String red="\u001B[31m";
    
    public Age(int yearNow){
        this.yearNow = yearNow;
    }
    
    public int getYearBirth(){
        return yearBirth;
    }
    
    public void setYearBirth(int yearBirth){
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow(){
        return yearNow;
    }
    
    public int hitungUmur(){
        int umur=yearNow-yearBirth;
        return umur;
    }
    
    public String tandanyaKamu(int umur){
        String keterangan="TIDAK TERDETEKSI DI KEHIDUPAN";
        if(0<=umur&&umur<=5){
            keterangan = "LAGI LUCU-LUCUNYA";
        }else if(5<umur&&umur<=10){
            keterangan = "MASIH ANAK-ANAK";
        }else if(10<umur&&umur<=13){
            keterangan = "MASIH REMADJA";
        }else if(13<umur&&umur<=19){
            keterangan = "ALAY";
        }else if(19<umur&&umur<=29){
            keterangan = "LAGI SIBUK NYARI JODOH";
        }else if(29<umur&&umur<=35){
            keterangan = "LAGI SIBUK NYARI UANG";
        }else if(35<umur&&umur<=150){
            keterangan = "SUDAH TUA";
        }else{
            
        }
        return red.concat(keterangan);
    }
}
