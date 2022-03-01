package pkt;

public class Dikdortgen implements ISekil {
	protected double genislik;
	protected double yukseklik;
	
	public void setGenislik(double genislik) {
		this.genislik = genislik;
	}
	public double getGenislik() {
		return genislik;
	}
	public void setYukseklik(double yukseklik) {
		this.yukseklik = yukseklik;
	}
	public double getYukseklik() {
		return yukseklik;
	}
	
	@Override
	public double Alan() {
		return yukseklik * genislik;
	}

}
