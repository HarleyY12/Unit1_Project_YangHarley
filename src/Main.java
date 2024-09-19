

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner object for reading user input
        Scanner s = new Scanner(System.in);

        // Get Total Bill
        System.out.println("Enter your bill: ($)");
        double billAmount;
        billAmount = s.nextDouble();

        //Get Tip Percentage and Convert It to a Decimal
        System.out.println("Enter your tip percentage: (%)");
        int tipPercent;
        tipPercent = s.nextInt();
        double tipPercentage = (double) tipPercent / 100;
        
        //Calculate Total Tip    
        double totalTip = tipPercentage * billAmount;

        //Get Number Of People Paying
        System.out.println("Enter how many people are paying: ");
        double tipPerPerson;
        double billPerPerson;
        int numPeople;
        numPeople = s.nextInt();

        //Calculate Tip & Bill Amounts Per Person 
        tipPerPerson = totalTip / numPeople;
        billPerPerson = (billAmount / numPeople) + tipPerPerson;
        billAmount = billAmount + totalTip;

        //Display receipt
        System.out.println("-----------------------------");
        System.out.println(String.format("The total bill is : $%.2f" , billAmount));
        System.out.println(String.format("The total tip is: $%.2f " , totalTip));
        System.out.println(String.format("Each person has to tip: $%.2f " , tipPerPerson));
        System.out.println(String.format("Each person's bill is: $%.2f " , billPerPerson));
        System.out.println("-----------------------------");




    }
}