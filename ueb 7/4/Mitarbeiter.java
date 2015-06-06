import java.util.*;

public class Mitarbeiter extends Angestellter{
	
	public Mitarbeiter(double arbeitstdProMonat, double gehaltProStunde){
		super(arbeitstdProMonat,gehaltProStunde);
	}
	
	public double berechneMonatseinkommen(){
	double r = super.berechneMonatseinkommen();
	r +=500;
	return r;
	}
}