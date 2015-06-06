import java.util.*;
import java.io.*;

public class Datum {
	private int Jahr;
	private int Monat;
	private int Tag;
	private Calendar cal;
	
	public Datum() {
		cal=Calendar.getInstance();
		Jahr=cal.get(1);
		Monat=cal.get(2)+1;
		Tag=cal.get(5);
	}	
	
	public Datum(int jahr, int monat, int tag){
		cal=Calendar.getInstance();
		this.Jahr=jahr;
		this.Monat=monat;
		this.Tag=tag;
   }
	
	public int getJahr() {
		return Jahr;
	}
	
	public int getMonat() {
		return Monat;
    }
    
    public int getTag() {
    	return Tag;
	}
	
	public int calcDiffDays(Datum ausleih) {
		int daysDiff=0;
		daysDiff += 365*(this.Jahr - ausleih.Jahr);
		daysDiff += 30*(this.Monat - ausleih.Monat);
		daysDiff += (this.Tag - ausleih.Tag);
		//Ihre Loesung
		
		return daysDiff;
	}
}