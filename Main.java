
package Pertemuan5;

public class Main {
    public static void main(String[] args) {
        persegi pluas = new persegi(5);
        persegi pkeliling = new persegi(10);
        lingkaran Lluas = new lingkaran(5);
        lingkaran Lkeliling = new lingkaran(5);
        PersegiPanjang PPluas = new PersegiPanjang(10, 5);
        PersegiPanjang PPkeliling = new PersegiPanjang(10, 5);
        Setigita LS = new Setigita(5,10);
        Setigita KS = new Setigita(5,10);
        
       
        pluas.getluas();
        pkeliling.getkeliling();
        Lluas.getluas();
        Lkeliling.getkeliling();
        PPluas.getluas();
        PPkeliling.getkeliling();
        LS.getluas();
        KS.getkeliling();
    }
}
