package pkt;

import java.util.ArrayList;
import java.util.List;

public class Yonetim {
	private List<Firma> firmalar;	
	
	public Yonetim() {
		firmalar = new ArrayList<Firma>();
	}
	public void firmaEkle(Firma firma) {
		firmalar.add(firma);
	}
	public boolean firmaSorgula(String filtre) {
		return firmalar.stream().filter(f->f.equals(new Firma(filtre,"","","","",Sektor.Bilinmiyor))).findFirst().isPresent() || firmalar.stream().filter(f->f.adresKontrol(filtre)).findFirst().isPresent();
	}
	@Override
	public String toString() {
		String cikti="";
		for(var firma : firmalar) {
			cikti += firma+"\n-------\n";
		}
		return cikti;
	}
}
