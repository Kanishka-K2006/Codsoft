import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //exchange rates (with respect to INR)
        double usd = 83.20;  // 1 USD = 83.20 INR
        double eur = 90.50;  // 1 EUR = 90.50 INR
        double gbp = 105.30; // 1 GBP = 105.30 INR

        System.out.print("Enter base currency (inr,usd,gbp,eur): ");
        String base = sc.next().toLowerCase();

        System.out.print("Enter target currency (inr,usd,gbp,eur): ");
        String target = sc.next().toLowerCase();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        if (base.equals("inr") && target.equals("usd")) {
            result = amount / usd;
        } 
        else if (base.equals("usd") && target.equals("inr")) {
            result = amount * usd;
        } 
        else if (base.equals("inr") && target.equals("eur")) {
            result = amount / eur;
        } 
        else if (base.equals("eur") && target.equals("inr")) {
            result = amount * eur;
        } 
        else if (base.equals("inr") && target.equals("gbp")) {
            result = amount / gbp;
        } 
        else if (base.equals("gbp") && target.equals("inr")) {
            result = amount * gbp;
        } 
        else if (base.equals(target)) {
            result = amount; 
        } 
        else {
            System.out.println("Conversion not supported!");
            sc.close();
            return;
        }

        System.out.println(amount + " " + base + " = " + result + " " + target);

        sc.close();
    }
}
