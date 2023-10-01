/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

/**
 *
 * @author Issa
 */
public class UstaMakas extends Makas {
private int direnc=2;

    public int getDirenc() {
        return direnc;
    }

    public void setDirenc(int direnc) {
        this.direnc = direnc;
    }

    public UstaMakas() {
    }

    public UstaMakas(double dayaniklilik, int seviyePuani) {
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
    public double etkiHesapla(int rakib) {
      
        double a= 0.2;
        
        int katilik=2;
        int nufuz=2;
        int keskinlik=2;
        
        
        // for terfi
        int sicaklik=2;
        int kalinlik=2;
        int direnc=2;
        
        double UstaMakas_etikisi=0;
        if(rakib==0)
        {
     
            UstaMakas_etikisi=(keskinlik*direnc)/((1-a)*katilik);
        }
        
        else if(rakib==1)
        {
         
           UstaMakas_etikisi=(keskinlik*direnc)/(a*nufuz);
        }
        
        else if(rakib==3)
        {
         
   
           UstaMakas_etikisi=(keskinlik*direnc)/((1-a)*katilik*sicaklik);
        }
        
        else if(rakib==4)
        {
            
            UstaMakas_etikisi=(keskinlik*direnc)/(a*nufuz*kalinlik);
        }
        
        else if(rakib==2)
        {
           UstaMakas_etikisi=direnc;
           
        }
        
        else if(rakib==5)
        {
            //System.out.println("Esit");
            return 0;
        }
        
        else if(rakib==99)
        {

            return 0;
        }
        
        else
            System.out.println("Makas Etki hesab hata");
        
        System.out.print("Makas classtan Etki:" + UstaMakas_etikisi);
        //super.setDayanlililk(((super.getDayanlililk())-(makas_etikisi)));
        
        return UstaMakas_etikisi;
        
    
    }

    @Override
    public void durumGuncelle(double etki, int seviye) {
        super.durumGuncelle(etki, seviye); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }   
}
