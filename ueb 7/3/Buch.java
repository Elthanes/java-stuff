import java.util.*;
import java.io.*;

public class Buch extends Medium{
	private String Buch_Autor;
	private int Buch_Seiten;
	
	public Buch(String in_titel, String in_autor, int in_seiten){
		super(in_titel);
		Buch_Seiten = in_seiten;
		Buch_Autor = in_autor;
	}
	
	public double berechneStrafgeld(){
		int diff;
		Datum dat = new Datum();
		diff = dat.calcDiffDays(Ausleihdatum);
		if (diff > 28){
			diff -=28;
			return diff;
		}
		else return 0;
	}
	
	public String getAutor(){
		return Buch_Autor;
	}
	
	public int getSeiten(){
		return Buch_Seiten;
	}
}