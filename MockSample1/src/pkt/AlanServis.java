package pkt;

public class AlanServis {
	private ISekil isek;
	
	public double AlanHesapla() {
		return isek.Alan();
	}
	public ISekil getISekil() {
		return isek;
	}
	public void setISekil(ISekil isek) {
		this.isek = isek;
	}
}
