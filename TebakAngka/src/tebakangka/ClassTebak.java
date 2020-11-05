/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Scanner;

/**
 *
 * @author hasna_madikha
 */
public class ClassTebak {
        /*membuat atribut*/
    
    int acak, tebak, jumlah=0, skor=100;
    
    /*membuat method*/
    
    public void menebakAngka(){
            acak = (int)
                   (Math.random()*100);
            System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
            Scanner masukkan = new Scanner(System.in);
            do{
                System.out.print("Tebakan Anda : ");
                
                tebak = masukkan.nextInt();
                if(tebak>acak){
                    skor = skor-2;
                    System.out.println("Hehehe.. Tebakan Anda terlalu besar");
                }else
                    if(tebak<acak){
                    skor = skor-2;
                    System.out.println("Hehehe.. Tebakan Anda terlalu kecil");
                    }
                    else{
                        System.out.println("Yeee.. Bilangan tebakan Anda BENAR! Setelah " +jumlah+" kali menebak");
                        System.out.println("Skor Anda : " +skor); 
                        if(tebak==acak){
                            if(jumlah<=5){
                                skor+=50;
                                System.out.println("Selamat Anda mendapat bonus skor 50");
                                System.out.println("Total skor Anda : " +skor);
                            }
                        }
                    }
                jumlah++;
            }while(tebak!=acak);
    }
    
}
