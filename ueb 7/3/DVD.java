import java.util.*;
import java.io.*;

public class DVD extends Medium{
	private String DVD_Regisseur;
	private int DVD_Laenge;
	
	public DVD(String in_titel, String in_regisseur, int in_laenge){
		super(in_titel);
		DVD_Laenge = in_laenge;
		DVD_Regisseur = in_regisseur;
	}
	
	public double berechneStrafgeld(){
		int diff;
		Datum dat = new Datum();
		diff = dat.calcDiffDays(Ausleihdatum);
		if (diff > 7){
			diff -=7;
			diff *=2;
			return diff;
		}
		else return 0;
	}
	
	public String getRegisseur(){
		return DVD_Regisseur;
	}
	
	public int getLaenge(){
		return DVD_Laenge;
	}
}