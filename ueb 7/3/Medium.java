import java.util.*;
import java.io.*;

public abstract class Medium{
	protected String Mediumtitel;
	protected Datum Ausleihdatum;
		
	protected Medium(String in_titel){
		Mediumtitel = in_titel;
	}
	
	protected String getTitel(){
		return Mediumtitel;
	}
	
	protected abstract double berechneStrafgeld();

	
	protected void setAusleihdatum(Datum in_leihdatum){
		Ausleihdatum = in_leihdatum;
	}
}