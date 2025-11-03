/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasukl2sedang.java;
import java.util.Scanner;
/**
 *
 * @author LOQ
 */
public class TUGASUKL2SEDANGJAVA {
 static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double t = input.nextDouble();
        double hasil = hitungVolume(r, t);
        long hasilBulat = (long) Math.ceil(hasil);
        System.out.println("\nVolume tabung adalah: " + hasilBulat + " cm³");
    }
}
