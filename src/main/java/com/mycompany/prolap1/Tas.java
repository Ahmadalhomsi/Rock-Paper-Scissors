/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author Issa
 */
public class Tas extends Nesne {

    @Override
    void dayaniklilik() {

    }

    @Override
    void seviyePuani() {

    }

    public Tas() {
    }

    public Tas(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);

    }

    @Override
    public void durumGuncelle(double etki, int seviye) {
        super.setDayanlililk(((super.getDayanlililk()) - (etki)));
        super.setSeviyePuani(super.getSeviyePuani()+seviye);
    }

    void katilik() {
    } // I think it should be a varieble with getter and setter

    @Override                              //  0      1       2      3         4         5 
public double etkiHesapla(int rakib) { // Rock , paper , si, agirtas, ozelkagit, ustamakas
        double a = 0.2;

        int katilik = 2;      // tas
        int nufuz = 2;        // kagit
        int keskinlik = 2;    // makas

        // for terfi
        int sicaklik=2;
        int kalinlik = 2;
        int direnc = 2;

        double tas_etikisi = 0;
        if (rakib == 2) {
            tas_etikisi=katilik/(a*keskinlik);
        } else if (rakib == 1) {
           tas_etikisi=katilik/((1-a)*nufuz);
        } else if (rakib == 4) {
           tas_etikisi=katilik/((1-a)*nufuz*kalinlik);
        } else if (rakib == 5) {
           tas_etikisi=katilik/(a*keskinlik*direnc);
        } else if (rakib == 0) {
            //System.out.println("Esit");
            return 0;
        } else if (rakib == 3) {
            tas_etikisi=(double)1/sicaklik;
        } else if (rakib == 99) {
            tas_etikisi=0;
        } else {
            System.out.println("Tas Etki hesab hata");
        }

        System.out.println("Tas classtan Etki:" + tas_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(tas_etikisi)));

        return tas_etikisi;

    }

    @Override
    public void nesnePuaniGoster() {
        System.out.println("Seviye Puani: " + super.getSeviyePuani());
        System.out.println("Dayaniklilik: " + super.getDayanlililk());
    }

}
