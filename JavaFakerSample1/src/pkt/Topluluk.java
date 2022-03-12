public class Topluluk {
    private double[] dizi;
    private String isim;
    
    public Topluluk(double[] dizi){
        this.dizi = dizi;
    }
    public Topluluk(double[] dizi,String isim){
            this.dizi = dizi;
            this.isim = isim;
    }
    public double Ortalama(){
        double toplam=0;
        for(double sayi : dizi) toplam += sayi;
        return toplam / dizi.length;
    }  
    public double Toplam(){
            double toplam=0;
            for(double sayi : dizi) toplam += sayi;
            return toplam;
    } 
    public int Uzunluk(){
          return isim.length();
    }

}
