public class Discount
{
    public static void main(String[] args)
    {
        double rechnungsBetrag = 0.0; //Rechnungsbetrag

        rechnungsBetrag = Double.parseDouble(args[0]);
        
        if (rechnungsBetrag>1000){
			Sytem.out.println("Es wurde ein Rabatt gewaehrt");
			rechnungsBetrag *= 0.92;
        }
        
        System.out.println("Ihr Gesamtbetrag betraegt "+rechnungsBetrag+" EUR");
    }
}