import java.util.*;
import java.io.*;

public class BibVerwaltung{
	public static void main(String[] args){
		Buch a = new Buch("Strange Case of Dr. Jekyll and Mr. Hyde", "Robert Louis Stevenson", 54);
		DVD b = new DVD("Fight Club","David Fincher", 139);
		Datum c = new Datum(2015,1,1);
		b.setAusleihdatum(c);
		double r = b.berechneStrafgeld();
		System.out.println(r);
		}
}