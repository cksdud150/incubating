package zzz;

public class Km2Mile extends Converter {
	
	public double convert(double src) {
		src = src / ratio;
		return src;
	}
	public String getSrcString() {
		
		return "Km";
	}
	public String getDestString() {
		return "mile";
	}
	
	public Km2Mile(double a) {
		ratio = a;
	}

}
