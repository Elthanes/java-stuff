import java.io.*;
import java.lang.Integer;

public class Rest
{
public static void main(String args[]) {
    int i=Integer.parseInt(args[0]);
    int j=Integer.parseInt(args[1]);
	
	int m = i%j;
	switch (m){
			case 0:
				System.out.println("Der Rest ist null");
				break;
			case 2:
				System.out.println("Der Rest ist eine einstellige Primzahl");
				break;
			case 3:
				System.out.println("Der Rest ist eine einstellige Primzahl");
				break;
			case 5:
				System.out.println("Der Rest ist eine einstellige Primzahl");
				break;
			case 7:
				System.out.println("Der Rest ist eine einstellige Primzahl");
				break;
			default:
				if ((m%2)==1){
					System.out.println("Der Rest ist ungerade");
				}else System.out.println("Keine der Aussagen trifft zu");
	}
}
}