
package Pertemuan2;

public class Main {
    public static void main(String[] args) {
        BUKU buku = new BUKU("Pulang");
        buku.tampilbuku();
        BUKU buku2 = new BUKU(2015);
        buku2.tampilbuku();
        BUKU buku3 = new BUKU("Tere Liye",2015);
        buku3.tampilbuku();
        BUKU buku4 = new BUKU("Pulang","Tere Liye",2015);
        buku4.tampilbuku();
            

    }
}
