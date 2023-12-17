/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author mrust
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A-ni daxil edin :");
        int a = scan.nextInt();
        System.out.println("B-ni daxil edin :");
        int b = scan.nextInt();
        System.out.println("Emeliyyati-ni daxil edin :");
        int emeliyyat = scan.nextInt();
        System.out.println(Methods.calculiator(a, b, emeliyyat));

    }

    public static double faktorial(int eded) {
        double cavab = 1;
        for (int i = 1; i <= eded; i++) {
            cavab *= i;
        }
        return cavab;
    }

    public static boolean detectSymmetry(String soz) {
        for (int i = 0; i < soz.length(); i++) {
            if (soz.charAt(i) != soz.charAt(soz.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void CoxSiraliMassivler() {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[2][5]; // Iki sirali masiv demekdir her sirada 5 element vardir
        System.out.println("Massivin elementlerin daxil edin :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Setir" + i);

            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Massivin elementleri :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Setir" + i);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);

            }
        }
    }

    public static void BirSiraliMassivler() {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {3, 13, 43, 23, 90}; // Java dilinde massiv bele elan edilir
        int[] arr2 = new int[5]; // Burda ise massivin nece elementli olmasi bildirilir

        int[] arr3 = {0, 0, 0, 0, 0};

        for (int i = 0; i < arr3.length; i++) {
            System.out.println("Massivin elementlerin daxil edin :");
            arr3[i] = scan.nextInt();
        }
        System.out.println("Massivin elementleri :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // Burdaki meqsed odurki biz yuz elementli massiv istifade etmek istedikde yuz eded 0 li massiv yaratmaqdansa arr 2 massivindende istifade ede bileriy
    }
}
