import java.io.*;

class CalcIt {
	public int ggT (int a, int b) {
		int m=a;
		int n=b;
		int r=1;
		while (r!=0){
			if (m < n){
				int x = m;
				m=n;
				n=x;
			}
			r = m-n;
			m =n;
			n = r;
		}
		//Ihre Loesung
		return m;
	}
}

class MyCalc {
	public static void main(String[] args) {
		CalcIt c = new CalcIt();
		System.out.println("Ausgabe: "+c.ggT(48,32));
	}
}