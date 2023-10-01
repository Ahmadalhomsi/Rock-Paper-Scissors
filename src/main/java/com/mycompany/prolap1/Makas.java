/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;
import java.util.*;

/**
 *
 * @author Issa
 */
public class Makas extends Nesne {

    private int keskinlik;
    
    public Makas() {
    }

    public Makas(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
    
    

    @Override
    void dayaniklilik() {
        
    }

    @Override
    void seviyePuani() {
        
    }
    void keskinlik () {
}

    @Override
    public void durumGuncelle(double etki,int seviye) {
         super.setDayanlililk(((super.getDayanlililk())-(etki)));
         super.setSeviyePuani(super.getSeviyePuani()+seviye);
    }

    @Override                              //  0      1       2      3         4         5 
public double etkiHesapla(int rakib) { // Rock , paper , si, agirtas, ozelkagit, ustamakas
        double a= 0.2;
        
        int katilik=2;
        int nufuz=2;
        int keskinlik=2;
        
        
        // for terfi
        int sicaklik=2;
        int kalinlik=2;
        int direnc=2;
        
        double makas_etikisi=0;
        if(rakib==0)
        {
          makas_etikisi=keskinlik/((1-a)*katilik);
        }
        
        else if(rakib==1)
        {
           makas_etikisi=keskinlik/(a*nufuz);
        }
        
        else if(rakib==3)
        {
            makas_etikisi=keskinlik/((1-a)*katilik*sicaklik);
        }
        
        else if(rakib==4)
        {
            makas_etikisi=keskinlik/(a*nufuz*kalinlik);
        }
        
        else if(rakib==2)
        {
            //System.out.println("Esit");
            return 0;
        }
        
        else if(rakib==5)
        {
            makas_etikisi=(double)1/direnc;
            
        }
        
        else if(rakib==99)
        {
            makas_etikisi=0;
            
        }
        
        else
            System.out.println("Makas Etki hesab hata");
        
        System.out.print("Makas classtan Etki:" + makas_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(makas_etikisi)));
        
        return makas_etikisi;
        
    }

    @Override
    public void nesnePuaniGoster() {
        System.out.println("Seviye Puani: " + super.getSeviyePuani());
        System.out.println("Dayaniklilik: " + super.getDayanlililk());
    }
  
    
    
}
