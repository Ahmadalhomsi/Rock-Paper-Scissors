/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolap1;

import java.util.*;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author xandros
 */
public class Oyun {

    Boolean OxB = false;
    Boolean BxB = false;
    ArrayList<Nesne> kno = new ArrayList<>(30);
    ArrayList<Nesne> bno = new ArrayList<>(30);
    ArrayList<Nesne> bno2 = new ArrayList<>(30);
    Tas[] tas = new Tas[30];
    Kagit[] kagit = new Kagit[30];
    Makas[] makas = new Makas[30];

    AgirTas[] agirTas = new AgirTas[30];
    OzelKagit[] ozelKagit = new OzelKagit[30];
    UstaMakas[] ustaMakas = new UstaMakas[30];

    private static Buttoner b = new Buttoner(); // try final access


    public void cngenerator(int s) // Classes generator for kullanci
    {

        if (s == 0) {
            tas[b.ccr] = new Tas(20, 0);
            kno.add(tas[b.ccr]);
            b.ccr++;

        } else if (s == 1) {
            kagit[b.ccp] = new Kagit(20, 0);
            kno.add(kagit[b.ccp]);
            b.ccp++;

        } else if (s == 2) {
            makas[b.ccs] = new Makas(20, 0);
            kno.add(makas[b.ccs]);
            b.ccs++;

        } else if (s == 3) {
            agirTas[b.ccr2] = new AgirTas(20, 0);
            kno.set(b.KS, agirTas[b.ccr2]);
            b.ccr2++;
            System.out.println("Agir Tas class made in cngenerator");
            System.out.println("OYUN.CNG:" + kno.toString());
        } else if (s == 4) {
            ozelKagit[b.ccp2] = new OzelKagit(20, 0);
            kno.set(b.KS, ozelKagit[b.ccp2]);
            b.ccp2++;
            System.out.println("Ozel Kagit class made in cngenerator");
            System.out.println("OYUN.CNG:" + kno.toString());
        } else if (s == 5) {
            ustaMakas[b.ccs2] = new UstaMakas(20, 0);
            kno.set(b.KS, ustaMakas[b.ccs2]);
            b.ccs2++;
            System.out.println("Usta Makas class made in cngenerator");
            System.out.println("OYUN.CNG:" + kno.toString());
        } else {
            System.out.println("cngenerator Error");
        }

        //return null;
    }

    public void cnbgenerator(int s) // Classes generator for bilgisayar
    {

        if (s == 0) {
            tas[b.ccrb] = new Tas(20, 0);
            bno.add(tas[b.ccrb]);
            b.ccrb++;
            System.out.println("Tas class made in cnbgenerator");
        } else if (s == 1) {
            kagit[b.ccpb] = new Kagit(20, 0);
            bno.add(kagit[b.ccpb]);
            b.ccpb++;
            System.out.println("Kagit class made in cnbgenerator");
        } else if (s == 2) {
            makas[b.ccsb] = new Makas(20, 0);
            bno.add(makas[b.ccsb]);
            b.ccsb++;
            System.out.println("Makas class made in cnbgenerator");
        } else if (s == 3) {
            agirTas[b.ccr2b] = new AgirTas(20, 0);
            bno.set(b.x, agirTas[b.ccr2b]);
            b.ccr2b++;
            System.out.println("Agir Tas class made in cnbgenerator");
        } else if (s == 4) {
            ozelKagit[b.ccp2b] = new OzelKagit(20, 0);
            bno.set(b.x, ozelKagit[b.ccp2b]);
            b.ccp2b++;
            System.out.println("Ozel Kagit class made in cnbgenerator");
        } else if (s == 5) {
            ustaMakas[b.ccs2b] = new UstaMakas(20, 0);
            bno.set(b.x, ustaMakas[b.ccs2b]);
            b.ccs2b++;
            System.out.println("Usta Makas class made in cnbgenerator");
        } else {
            System.out.println("cnbgenerator Error");
        }

        //return null;
    }

   

    Oyun() {

        JFrame frame = new JFrame("Giris Ekran");
        JButton bb = new JButton("Oyuncu X Bilgisayar");
        JButton cb = new JButton("Bilgisayar X Bilgisayar");
        bb.setBounds(80, 70, 300, 40);
        cb.setBounds(80, 130, 300, 40);

        JLabel label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("src\\Pic\\Background.jpg")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(0, 0, size.width, size.height); //Sets the location of the image

        frame.add(label); //Adds objects to the container

        bb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) { // Oyuncu X Biilgisayar

                OxB = true;
                System.out.println("Oyuncu X Bilgisayar");
                b.setVisible(true);

            }
        });

        cb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                BxB = true;
                System.out.println("Bilgisayar X Bilgisayar");
                

            }
        });

        frame.setLayout(null);
        frame.add(bb);
        frame.add(cb);
        frame.getRootPane().setDefaultButton(bb); // sets default button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        /*
        Buttoner b = new Buttoner(); 
        b.setVisible(true);
         */
        //Giris g = new Giris();
        //g.setVisible(true);

        ///  Button
        //Oyun g = new Oyun();
        //---
    }

}
