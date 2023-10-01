/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author Issa
 */
public class AgirTas extends Tas {

    private int sicaklik = 2;

    public AgirTas() {
    }

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }

    public AgirTas(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);

    }

    @Override
    public void setSeviyePuani(int seviyePuani) {
        super.setSeviyePuani(seviyePuani); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getSeviyePuani() {
        return super.getSeviyePuani(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setDayanlililk(double dayaniklilik) {
        super.setDayanlililk(dayaniklilik); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getDayanlililk() {
        return super.getDayanlililk(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    

    @Override
    public void nesnePuaniGoster() {
        super.nesnePuaniGoster();
        System.out.println("Seviye Puani: " + super.getSeviyePuani());
        System.out.println("Dayaniklilik: " + super.getDayanlililk());
    }

    @Override
    public double etkiHesapla(int rakib) {

        double a = 0.2;
        int katilik = 2;      // tas
        int nufuz = 2;        // kagit
        int keskinlik = 2;    // makas

        // for terfi
        int sicaklik=2;
        int kalinlik = 2;
        int direnc = 2;

        double AgirTas_etikisi = 0;
        if (rakib == 2) {

            AgirTas_etikisi = (katilik * sicaklik) / (a * keskinlik);
        } else if (rakib == 1) {

            AgirTas_etikisi = (katilik * sicaklik) / ((1 - a) * nufuz);
        } else if (rakib == 4) {

            AgirTas_etikisi = (katilik * sicaklik) / ((1 - a) * nufuz * kalinlik);
        } else if (rakib == 5) {
            AgirTas_etikisi = (katilik * sicaklik) / (a * keskinlik * direnc);

        } else if (rakib == 0) {
            AgirTas_etikisi = sicaklik;

        } else if (rakib == 3) {
            //System.out.println("Esit");
            return 0;
        } 
        else if (rakib == 99) {

            return 0;
        }
        else {
            System.out.println("Tas Etki hesab hata");
        }

        System.out.println("Tas classtan Etki:" + AgirTas_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(tas_etikisi)));
        
        

        return AgirTas_etikisi;

    }

    @Override
    public void durumGuncelle(double etki, int seviye) {
        super.durumGuncelle(etki, seviye); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

    }
}
