/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan5;

/**
 *Nama :veri ajie saputra
 *KELAS:pbo
 *NIM  :23215017
 * 
 */

 import java.util.Scanner;

public class Latihan_17_ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();
        
        double tunjangan = 0;
        
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }
        
        double totalGaji = gajiPokok + tunjangan;
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
        System.out.println("Total Gaji    : Rp " + totalGaji);
    }
}

