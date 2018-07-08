/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop;
import java.util.Scanner;
/**
 *
 * @author JKendil
 */
public class UAS_OOP {
    public static void main(String[] args) {
        int a=0;
        int c=0;
        int d=0;
        System.out.println("-----Tiket TRAVEL 21----");
        System.out.println("1. Palangka Raya-Banjarmasin    Rp 120.000/org");
        System.out.println("2. Palangka Raya-Sampit         Rp 110.000/org");
        System.out.println("3. Banjarmasin-Samarinda        Rp 200.000/org");
        System.out.println("Silakan Pilih Nomor Sesuai Tujuan Anda   ");
        for(String b = "y"; b.equals("y");){
             Scanner no= new Scanner(System.in);
             System.out.println("Masukkan Nomor");
             a=no.nextInt();
             if(a==1){
                 System.out.println("Pilih Waktu Keberangkatan");
                 System.out.println("1. 08.00    2. 13.00   3. 16.00");
                 d=no.nextInt();
                 System.out.println("Jumlah :");
                 c=no.nextInt();
                 int jmh=c* 120000;
                    System.out.println("Jurusan Palangka Raya-Banjarmasin"); 
                 if(d==1){
                     System.out.println("Waktu Keberangkatan Anda jam 08.00");
                 }else if(d==2){
                     System.out.println("Waktu Keberangkatan Anda jam 13.00");
                 }else{
                     System.out.println("Waktu Keberangkatan Anda jam 16.00");
                 }
                 System.out.println("Pembayaran   Rp "+jmh);                
             }else if(a==2){
                 System.out.println("Pilih Waktu Keberangkatan");
                 System.out.println("1. 08.00    2. 13.00   3. 16.00");
                 d=no.nextInt();
                 System.out.println("Jumlah :");
                 c=no.nextInt();
                 int jmh=c* 110000;
                 System.out.println("Jurusan Palangka Raya-Sampit"); 
                 if(d==1){
                     System.out.println("Waktu Keberangkatan Anda jam 08.00");
                 }else if(d==2){
                     System.out.println("Waktu Keberangkatan Anda jam 13.00");
                 }else{
                     System.out.println("Waktu Keberangkatan Anda jam 16.00");
                 }
                 System.out.println("Pembayaran   Rp "+jmh);
             }else if(a==3){
                 System.out.println("Pilih Waktu Keberangkatan");
                 System.out.println("1. 08.00    2. 13.00   3. 16.00");
                 d=no.nextInt();
                 System.out.println("Jumlah :");
                 c=no.nextInt();
                 int jmh=c* 200000;
                 System.out.println("Jurusan Banjarmasin-Samarinda"); 
                 if(d==1){
                     System.out.println("Waktu Keberangkatan Anda jam 08.00");
                 }else if(d==2){
                     System.out.println("Waktu Keberangkatan Anda jam 13.00");
                 }else{
                     System.out.println("Waktu Keberangkatan Anda jam 16.00");
                 }
                 System.out.println("Pembayaran   Rp "+jmh);
             }
              Scanner rumus = new Scanner(System.in);   
            System.out.print("Mau Memesan Lagi (Y/T) "); 
        b = no.next();
        }
        
    }
    
}
