/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

import java.util.Random;

/**
 *
 * @author Issa
 */
public class BilgisayarOyuncusu extends Oyuncu {

    private String kartListesi;

    public BilgisayarOyuncusu(String oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

    public BilgisayarOyuncusu() {
    }

    @Override
    public void setSkor(int Skor) {
        super.setSkor(Skor);
    }

    @Override
    public int getSkor() {
        return super.getSkor();
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

    public String getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(String kartListesi) {
        this.kartListesi = kartListesi;
    }

    @Override
    public int nesneSec() {

        Random r = new Random();

        int randomMultipleOfFive = r.nextInt(5); // 0<x<5 
        int sec = randomMultipleOfFive;

        return sec;
    }

}
