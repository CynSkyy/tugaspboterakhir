
package Pertemuan2;

import java.util.Scanner;

public class Jam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("masukan jam : ");
        int jam = sc.nextInt();
        System.out.print("masukan menit : ");
        int menit = sc.nextInt();
        System.out.print("masukan detik : ");
        int detik = sc.nextInt();
        
        
        int total = jam * 3600 + menit * 60 + detik;
        
        System.out.println("total  detik : " + total);
    }
}
