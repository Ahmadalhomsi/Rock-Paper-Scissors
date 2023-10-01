/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author xandros
 */
public class Kullanici extends Oyuncu{
private String kartListesi;

    public Kullanici(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public Kullanici() {
    }
    
        @Override
    public int SkorGoster() {

        return super.SkorGoster();
    }

    @Override
    public void setOyuncuAdi(String oyuncuAdi) {
        super.setOyuncuAdi(oyuncuAdi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOyuncuAdi() {
        return super.getOyuncuAdi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setOyuncuID(String oyuncuID) {
        super.setOyuncuID(oyuncuID); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getOyuncuID() {
        return super.getOyuncuID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void setKartListesi(String kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    public void setSkor(int Skor) {
        super.setSkor(Skor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public int nesneSec() {
        /*Oyuncu sınıfında bulunan kartSec() metotu override edilecektir. Kullanıcı random olarak
    aldığı kartlar arasından kendi istediği kartı seçerek ortaya koyacaktır.*/
        /*Oyuncu sınıfında bulunan kartSec() metotu override edilecektir. Kullanıcı random olarak
    aldığı kartlar arasından kendi istediği kartı seçerek ortaya koyacaktır.*/
        return 0;
    }

    
    
    
}
