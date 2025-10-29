
package Pertemuan5;

public class persegi extends Bangundatar{
    private float sisi;
    
    public persegi(float sisi){
        this.sisi = sisi;
    }
    
    private float luas(){
        return sisi * sisi;
    }
    
    private float keliling(){
        return 4 * sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi; 
    }
    
    @Override
    public void getluas(){
        System.out.println("hasil luas dari persegi : " + luas());
    }
    
    @Override
    public void getkeliling(){
        System.out.println("hasil keliling dari persegi : " + keliling());
    }
    
}
