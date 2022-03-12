package pkt;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

public class ToplulukTest {
    
    public ToplulukTest() {
    }
    
    @Test
    public void ortalamaTest(){
        double []dizi = {14, 16, 5, 9};
        Topluluk topluluk = new Topluluk(dizi);
        assertEquals(11, topluluk.Ortalama(),0);
    }
    @Test
    public void toplamTest(){
        double []dizi = {14, 16, 5, 9};
        Topluluk topluluk = new Topluluk(dizi);
        assertEquals(44, topluluk.Toplam(),0);
    }
    @Test
    public void uzunlukTest(){
        for(int i=0;i<100;i++){
            Faker faker = new Faker();
            String isim = faker.name().firstName();
            System.out.println(isim);
            double []dizi = {14, 16, 5, 9};
            Topluluk topluluk = new Topluluk(dizi,isim);
            assertEquals(isim.length(), topluluk.Uzunluk(),0);
        }
    }

}
