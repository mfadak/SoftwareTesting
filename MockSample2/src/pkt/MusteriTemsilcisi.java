package pkt;

import org.mockito.InjectMocks;

public class MusteriTemsilcisi {
	@InjectMocks
	private ADepartman aDepartman;
	
	public boolean musteriEkle(Musteri musteri) {
		if(aDepartman.musteriVarmi(musteri)) return false;
		return aDepartman.musteriGonder(musteri);
	}
	public ADepartman getADepartman() {
		return aDepartman;
	}
	public void setADepartman(ADepartman aDepartman) {
		this.aDepartman = aDepartman;
	}
}
