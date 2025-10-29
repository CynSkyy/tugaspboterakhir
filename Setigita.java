
package Pertemuan5;

public class Setigita extends Bangundatar{
    private float alas;
    private float tinggi;
    
    public Setigita(float tinggi,float alas){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    private float luas(){
        return (float) (0.5 * alas * tinggi);
    }
    
    private float keliling(){
        return alas + tinggi;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }
    
    @Override
    public void getluas(){
        System.out.println("hasil luas dari segitiga : " + luas());
    }
    
    @Override
    public void getkeliling(){
        System.out.println("hasil dari keliling segitiga : " + keliling());
    }
}
