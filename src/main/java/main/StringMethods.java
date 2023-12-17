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
public class StringMethods {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Metn daxil edin : ");
        String m = scan.nextLine();

        // Stringin uzunluqun tapmaq ucun
        int s = m.length();
        System.out.println("lenght = " + s);

        // Moterizedeki indeksli elementi capa verir ve char tipinde olur
        char s2 = m.charAt(5);
        System.out.println("charAt = " + s2);

        // Stringin moterizede yazilan ededlerin araliqindaki hissesin kesir ve String tipi geri qaytarir
        String s3 = m.substring(2, 3);
        System.out.println("substring = " + s3);

        // Moterizede yazilan deyerin (String deyer olmalidi!) olub olmadiqin yoxlayir boolean deyer cap edir 
        boolean s4 = m.contains("30");
        System.out.println("contains = " + s4);

        // Moterizede yazilan (String deyer olmalidi!) deyer tamamile beraber olmalidi daxil olunan deyere
        boolean s5 = m.equals("men seni");
        System.out.println("equals = " + s5);

        // Moterizede yazilan (String deyer olmalidi!) deyer beraber olmalidi boyuk kicik herfler nezere alinmir daxil olunan deyere
        boolean s55 = m.equalsIgnoreCase("men seni");
        System.out.println("equalsIgnoreCase = " + s55);

        // Daxil edilen deyerin bos olub olmadiqin yoxlayir boolean qaytarir
        boolean s6 = m.isEmpty();
        System.out.println("isEmpty = " + s6);

        // Daxil olunan metn m herfile baslayirmi 
        boolean s7 = m.startsWith("m");
        System.out.println("startsWith = " + s7);

        // Daxil olunan metn i herfile bitirmi 
        boolean s8 = m.endsWith("i");
        System.out.println("endsWith = " + s8);

        // Daxil olunan metnde eger saqdan ve soldan bosluqlar buraxilibsa onlari silecey ve String qaytaracay 
        String s9 = m.trim();
        System.out.println("trim = " + s9);

        // Daxil olunan metnin hamisini balaca herflerle yazir  
        String s10 = m.toLowerCase();
        System.out.println("toLowerCase = " + s10);

        // Daxil olunan metnin hamisini boyuk herflerle yazir  
        String s11 = m.toUpperCase();
        System.out.println("toLowerCase = " + s11);

        // Daxil olunan metnin hamisini balaca herflerle yazir  
        String s12 = m.toLowerCase();
        System.out.println("toLowerCase = " + s12);

        // Daxil olunan metnde olan moterize daxilindeki sozun hansi indeksden basladiqin tapir eger soz metnde yoxdursa -1 qaytarir
        int s13 = m.indexOf("men");
        System.out.println("indexOf = " + s13);

        // Daxil olunan metin icerisindeki men sozunu Seni Sevirem ile evez edir 
        String s14 = m.replace("men", "Seni Sevirem");
        System.out.println("replace = " + s14);

    }
}
