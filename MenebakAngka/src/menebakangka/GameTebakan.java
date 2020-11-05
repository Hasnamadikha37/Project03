/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menebakangka;

import java.util.Scanner;

/**
 *
 * @author hasna_madikha
 */
public class GameTebakan {
    /*membuat atribut*/
    
    int acak, tebak, jumlah=0;
    
    /*membuat method*/
    
    public void ClassTebakan(){
            acak = (int)
                   (Math.random()*100);
            System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
            Scanner masukkan = new Scanner(System.in);
            do{
                System.out.print("Tebakan Anda : ");
                
                tebak = masukkan.nextInt();
                if(tebak>acak){
                    System.out.println("Hehehe.. Tebakan Anda terlalu besar");
                }else
                    if(tebak<acak){
                    System.out.println("Hehehe.. Tebakan Anda terlalu kecil");
                    }
                    else{
                        System.out.println("Yeee.. Bilangan tebakan Anda BENAR! Setelah " +jumlah+" kali menebak");
                        }                   
                jumlah++;
            }while(tebak!=acak);
    }
}
