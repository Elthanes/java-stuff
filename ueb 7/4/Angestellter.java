

public class Angestellter{
	private double stdProMonat;
	private double geldProStunde;
	
	public Angestellter(){
	}
	
	public Angestellter(double arbeitstdProMonat, double gehaltProStunde){
		stdProMonat = arbeitstdProMonat;
		geldProStunde = gehaltProStunde;
	}
	
	public double berechneMonatseinkommen(){
		double r = stdProMonat * geldProStunde;
		return r;
	}
}