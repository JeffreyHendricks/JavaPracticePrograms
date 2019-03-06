/*
 * This program simulates the purchase of a stereo with 
 * a downpayment of 0 dollars and an interst rate of 18%
 * yearly. This program will calculate how many months it
 * will take someone to pay off the life of the loan by
 * making payments of $50.00 a month towards interest and 
 * debt combined.
 */
package monthlyinterestrate;

/**
 *
 * @author jeff
 */
import java.text.NumberFormat;

public class MonthlyInterestRate {

    /**
     * @param args the command line arguments
     */ 
    public static final double MONTHLY_INTEREST = .015;
    
    public static void main(String[] args) {
        // TODO code application logic here
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
        
        int count = 0;
        double cost = 1000;
        double actualCost = 0;
        double payment = 50;
        double interest;
        double totalInterest = 0;
        
        System.out.println("You have just purchased a stereo for $1000.00 . ");
        System.out.println("Your downpayment was $0.00 and the yearly interest is 18% (1.5% monthly).");
        System.out.println("So lets take a look at how many months it should take you to pay off your debt.");
        System.out.println("As well as how much interest you actually payed.\n");
        
        while(cost > 0)
        {
            interest = MONTHLY_INTEREST * cost;
            totalInterest += interest;   
            
            if(cost < payment && cost > 0)
            {
                payment = cost + interest;
            }
            
            cost = (interest + cost) - payment;
            
            
            System.out.println("The cost would be: " + moneyFormat.format((cost + payment)));
            System.out.println("The cost of the stereo after payment is as follows: " + moneyFormat.format(cost));
            System.out.println("The payment would be: " + moneyFormat.format(payment));
            System.out.println("The total interest amount that you would have payed after finishing your payments would be: " + moneyFormat.format(totalInterest));
            System.out.println();
            count++;
        }
            System.out.println("The total months it would take to pay off the debt with payments at $50.00 a month would be: " + count);
        
    }
    
}
