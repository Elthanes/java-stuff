import java.io.*;
import java.lang.*;

class TastaturIn {
	private InputStreamReader is=new InputStreamReader(System.in);
	private BufferedReader eingabe=new BufferedReader(is);
	
	/*Liest einen Wert von der Konsole ein 
	  und gibt diesen als int-Wert zurück. Im Fehlerfall wird eine
	  IOException geworfen */ 
	public int readInt() throws IOException {
		String zeile;
		int wert=0;
		
		zeile=eingabe.readLine();
		wert=(new Integer(zeile)).intValue();
		
		return wert;
	}
	
   /*Liest einen Wert von der Konsole ein 
	  und gibt diesen als String zurück. Im Fehlerfall wird eine
	  IOException geworfen */ 
	public String readString() throws IOException{
		String zeile="";
		
		zeile=eingabe.readLine();
		
		return zeile;
	}
}


public class BinCalc {
	public static String Dec2Bin(int dec) {
		
		String r = "";
		for (int i = dec; i >0;){
			r = (i%2) + r;
			i /= 2;
		}
		return r;
		//Ihre Loesung
		
	}
	
	public static void main(String args[]) {
		TastaturIn mTastatur = new TastaturIn();
		int input;
		while(true){
			try{
				input = mTastatur.readInt();
				System.out.println(Dec2Bin(input));
				return;
			}catch (NumberFormatException e){
				System.out.println("Fehler! Keine Zahl");
			}catch (IOException er){
				System.out.println("Fehler! Keine Zahl");
			}
		}
		//Ihre Loesung	
		
	}
}
