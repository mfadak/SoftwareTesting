package pkt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.github.javafaker.Faker;

class YonetimTest {

	@Test
	void firmaSorgulaTest() {
		Yonetim yonetim = new Yonetim();
		Faker faker = new Faker();
		String firmaAdi, firmaAdiKontrol="",caddeAdi,caddeAdiKontrol="";
		for(int i=0;i<100;i++) {
			firmaAdi = faker.company().name();
			caddeAdi = faker.address().streetName();
			if(i == 47) { // Kontrol için bir adet sakla
				firmaAdiKontrol = firmaAdi;
				caddeAdiKontrol = caddeAdi;
			}
			Firma firma = new Firma(firmaAdi, 
									caddeAdi,
									faker.address().buildingNumber(),
									faker.address().cityName(), 
									faker.address().country(), 
									faker.options().option(Sektor.Enerji, Sektor.Saglik, Sektor.Savunma, Sektor.Kozmetik, Sektor.Teknoloji));
			yonetim.firmaEkle(firma);
		}
		assertEquals(true, yonetim.firmaSorgula(firmaAdiKontrol));
		assertEquals(true, yonetim.firmaSorgula(caddeAdiKontrol));
		assertEquals(false, yonetim.firmaSorgula("Vestel"));
		System.out.print(yonetim);// Ekranda bütün firmaları görmek için
	}

}
