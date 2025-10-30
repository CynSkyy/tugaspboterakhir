
package Pertemuan2;

public class BUKU {
    String judul;
    int tahun;
    String pengarang;
    
    public BUKU(){
        
    }
    public BUKU(String judul){
        this.judul = judul;
    }
    public BUKU(int tahun){
        this.tahun = tahun;
    }
    public BUKU(String pengarang,int tahun){
        this.tahun = tahun;
        this.pengarang = pengarang;
    }
    public BUKU(String judul,String pengarang,int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahun = tahun;
    }
    void tampilbuku(){
        System.out.println("judul buku : " + judul);
        System.out.println("nama pengarang : " +pengarang);
        System.out.println("tahun terbit : " +tahun);
    }
    
    
    
    
}

