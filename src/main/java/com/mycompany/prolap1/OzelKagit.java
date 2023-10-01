/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author Issa
 */
public class OzelKagit extends Kagit{
private int kalinlik;

    public int getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(int kalinlik) {
        this.kalinlik = kalinlik;
    }

    public OzelKagit() {
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

    

    public OzelKagit(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }

    @Override
    public void durumGuncelle(double etki, int seviye) {
        super.durumGuncelle(etki, seviye); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


    @Override
    public double etkiHesapla(int rakib) {
       double a = 0.2;

        int katilik = 2;      // tas
        int nufuz = 2;        // kagit
        int keskinlik = 2;    // makas

        // for terfi
        int sicaklik = 2;
        int kalinlik=2;
        int direnc = 2;

        double Ozelkagit_etikisi = 0;
        if (rakib == 2) {
         
            Ozelkagit_etikisi = (nufuz*kalinlik) / ((1 - a) * keskinlik);
        } else if (rakib == 0) {
          
            Ozelkagit_etikisi = (nufuz*kalinlik)/ (a * katilik ) ;
        } else if (rakib == 3) {
          
            Ozelkagit_etikisi = (nufuz*kalinlik) / (a * katilik * sicaklik) ;
        } else if (rakib == 5) {
           
            Ozelkagit_etikisi =(nufuz*kalinlik) / ( (1 - a) * keskinlik * direnc);
        } else if (rakib == 1) {
            Ozelkagit_etikisi=kalinlik;
       
        } else if (rakib == 4) {
            //System.out.println("Esit");
            return 0;
        } 
        else if (rakib == 99) {
            
            return 0;
        }
        else {
            System.out.println("Kagit Etki hesab hata");
        }

        System.out.println("Kagit classtan Etki:" + Ozelkagit_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(kagit_etikisi)));

        return Ozelkagit_etikisi;

    }
}
