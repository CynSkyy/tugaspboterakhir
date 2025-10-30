
package Pertemuan1;
import java.util.Scanner;

public class Tugas1sepeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jarak = 0;
        int hasiljarak;
        int pilihan;
        System.out.print("masukan object merek sepeda : ");
        String merk = sc.nextLine();
        System.out.println("Object " + merk + " dibuat, jarak tempuh awal : " + jarak);
        
        do{
            System.out.println("bergerak maju ketik (1) ");
            System.out.println("bergerak mundur ketik (2)  ");
            System.out.println("berhenti ketik (3)");
            System.out.println("keluar program (0)");
            System.out.print("pilih pilihan anda : ");
            pilihan = sc.nextInt();
            
            switch (pilihan){
                case 1 :
                    jarak += 10;
                    System.out.println("bergerak maju");
                    System.out.println("object sepeda " + merk + ", jarak tempuh " + jarak + "km");
                    break;
                
                case 2 :
                    jarak -= 5;
                    System.out.println("bergerak mundur " + jarak);
                    System.out.println("object sepeda " + merk + ", jarak tempuh " + jarak + "km");
                    break;
                    
                case 3 :
                    hasiljarak = jarak;
                    System.out.println("sepeda berhenti");
                    System.out.println("object sepeda " + merk + ", jarak tempuh akhir " + jarak + "km");
                    break;
                    
            }
        }while(pilihan != 0);
        System.out.println("anda keluar program");
    }

    
}
