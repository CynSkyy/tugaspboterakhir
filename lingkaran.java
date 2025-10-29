
package Pertemuan5;

public class lingkaran extends Bangundatar{
    private float jari;
    float pi = (float) 3.14;
    
    public lingkaran(float jari){
        this.jari = jari;
    }
    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }
    
    private double luas(){
        return pi * (jari*jari);
    }
    
    private float keliling (){
        float hasil = 2 * pi * jari;
        return hasil;
    }
    
    @Override
    public void getluas(){
        System.out.println("hasil dari luas lingkaran : " + luas());
    }
    
    @Override
    public void getkeliling(){
        System.out.println("hasil dari keliling lingkaran : " + keliling());
    }
}

