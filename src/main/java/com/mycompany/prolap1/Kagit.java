/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author Issa
 */
public class Kagit extends Nesne {
    
    private int nufuz=0;

    public Kagit() {
    }

    public Kagit(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);

    }

    @Override
    void dayaniklilik() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void seviyePuani() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void nufuz() {
    }

    @Override
    public void durumGuncelle(double etki, int seviye) {
        super.setDayanlililk(((super.getDayanlililk()) - (etki)));
        super.setSeviyePuani(super.getSeviyePuani()+seviye);
    }

    @Override
    public void nesnePuaniGoster() {
                System.out.println("Seviye Puani: " + super.getSeviyePuani());
                System.out.println("Dayaniklilik: " + super.getDayanlililk());
    }
    
    

    @Override                            //  0      1       2      3         4         5 
    public double etkiHesapla(int rakib) { // Rock , paper , si, agirtas, ozelkagit, ustamakas
        double a = 0.2;

        int katilik = 2;      // tas
        int nufuz = 2;        // kagit
        int keskinlik = 2;    // makas

        // for terfi
        int sicaklik = 2;
        int kalinlik=2;
        int direnc = 2;

        double kagit_etikisi = 0;
        if (rakib == 2) {
            kagit_etikisi=nufuz/((1-a)*keskinlik);
            
        } else if (rakib == 0) {
              kagit_etikisi=nufuz/(a*katilik);
        } else if (rakib == 3) {
             kagit_etikisi=nufuz/(a*katilik*sicaklik);
        } else if (rakib == 5) {
           kagit_etikisi=nufuz/((1-a)*keskinlik*direnc);
        } else if (rakib == 1) {
            //System.out.println("Esit");
            return 0;
        } else if (rakib == 4) {
            kagit_etikisi=(double)1/kalinlik;
        } else if (rakib == 99) {
            kagit_etikisi=0;
        } else {
            System.out.println("Kagit Etki hesab hata");
        }

        System.out.println("Kagit classtan Etki:" + kagit_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(kagit_etikisi)));

        return kagit_etikisi;

    }

}
