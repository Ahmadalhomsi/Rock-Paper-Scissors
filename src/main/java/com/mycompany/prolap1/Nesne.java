/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

import javax.swing.ImageIcon;

/**
 *
 * @author Issa
 */
  abstract class Nesne {
      
  abstract void  dayaniklilik ();
  abstract void  seviyePuani ();

    public Nesne() {
    }

    private double dayaniklilik;
    private int seviyePuani;
  

    private ImageIcon icon;

    

    public Nesne(double dayaniklilik , int seviyePuani ) {
        

        this.dayaniklilik = 20;
        this.seviyePuani = 0;

    }

    public double getDayanlililk() {
        return dayaniklilik;
    }

    public void setDayanlililk(double dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }

    
    public void nesnePuaniGoster(){ // hasar puani goster (Old name)
        
    }
    
    public double etkiHesapla(int rakib){ // hasar puani goster (Old name)
      return 0;
        
    }
    
    public void durumGuncelle(double etki,int seviye){ // hasar puani goster (Old name)
        
    }
    
}
 
            
    

