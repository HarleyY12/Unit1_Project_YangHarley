

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your bill: ($)");
        double billAmount;
        billAmount = s.nextDouble();

        System.out.println("Enter your tip percentage: (%)");
        int tipPercent;
        tipPercent = s.nextInt();
        double tipPercentage = (double) tipPercent / 100;
        double totalTip = tipPercentage * billAmount;



        System.out.println("Enter how many people are paying: ");
        double tipPerPerson;
        double billPerPerson;
        int numPeople;
        numPeople = s.nextInt();
        tipPerPerson = (double) totalTip / numPeople;
        billPerPerson = (double) billAmount / numPeople;


        System.out.println("-----------------------------");
        System.out.println("The total bill is : $" + billAmount);
        System.out.println(String.format("The total tip is: $%.2f " , totalTip));
        System.out.println(String.format("Each person has to tip: $%.2f " , tipPerPerson));
        System.out.println(String.format("Each person's bill is: $%.2f " , billPerPerson));
        System.out.println("-----------------------------");




    }
}