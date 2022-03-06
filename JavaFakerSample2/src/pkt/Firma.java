package pkt;

public class Firma {
	private String adi;
	private String adres;
	private Sektor sektor;
	
	public Firma(String adi, String cadde, String no, String sehir, String ulke, Sektor sektor) {
		this.adi = adi;
		this.adres = adresOlustur(cadde, no, sehir, ulke);
		this.sektor = sektor;
	}
	public boolean adresKontrol(String filtre) {
		return adres.contains(filtre);
	}
	@Override
	public boolean equals(Object obj) {
		boolean check = false;

        if (obj != null && obj instanceof Firma)
        {
        	check = this.adi.equals(((Firma) obj).adi);
        }

        return check;
	}
	
	private String adresOlustur(String cadde, String no, String sehir, String ulke) {
		return cadde+" "+no+" "+sehir+" / "+ulke;
	}
	@Override
	public String toString() {
		return "Firma Adı: "+adi+
			   "\nAdres: "+adres+
			   "\nSektör:"+sektor;
	}
}
