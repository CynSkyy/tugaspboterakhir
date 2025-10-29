
package Pertemuan5;

public class PersegiPanjang extends Bangundatar {
    private float panjang;
    private float lebar;
    
    
    public PersegiPanjang(float panjang, float lebar) {
    this.panjang = panjang;
    this.lebar = lebar;
}

    private float luas(){
        return panjang * lebar;
    }
    
    private float keliling(){ 
        return 2 * (panjang + lebar);
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }
    
    @Override
    public void getluas(){
        System.out.println("hasil dari luas persegi panjang adalah : " + luas());
    }
    
    @Override
    public void getkeliling(){
        System.out.println("hasil dari keliling persegi panjang adalah : " + keliling());
    }
    
    
}

