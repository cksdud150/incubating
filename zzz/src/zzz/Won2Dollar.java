package zzz;

public class Won2Dollar extends Converter {
	
	public double convert(double src) {
		src = src / ratio;
		return src;
	}
	public String getSrcString() {
		
		return "��";
	}
	public String getDestString() {
		return "�޷�";
	}
	
	public Won2Dollar(double a) {
		ratio = a;
	}
}
