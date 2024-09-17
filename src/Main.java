//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("What is your bill?");
        double billAmount;
        billAmount = s.nextDouble();

        System.out.println("Enter your tip percentage:");
        int tipPercent;
        tipPercent = s.nextInt();
        double tipPercentage = (double) tipPercent / 100;
        double totalTip = tipPercentage * billAmount;
        System.out.println(String.format("Your total tip is:$%.2f " , totalTip));


        System.out.println("How many people are there :");
        double tipPerPerson;
        int numPeople;
        numPeople = s.nextInt();
        tipPerPerson = (double) totalTip / numPeople;
        System.out.println(String.format("Each person has to tip:$%.2f " , tipPerPerson));



        }
    }
