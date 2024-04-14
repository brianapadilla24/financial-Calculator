package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double initialDeposit;
        double annualInterestRate;
        double numberOfYears;
        double dailyInterest;
        double annualInterest;
        double futureValue;
        double totalInterest;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("Enter the initial deposit: ");
        initialDeposit = scanner.nextDouble();

        System.out.println("Enter Annual Interest Rate: ");
        annualInterestRate = scanner.nextDouble();

        System.out.println("Enter the number of years: ");
        numberOfYears = scanner.nextDouble();


        //calculate the daily interest for daily compounding
        // daily interest = annual interest / 365
        dailyInterest = annualInterestRate / 365;

        //use formula to calculate the future value of deposit
        //Future Value = initial deposit(1 + interestRate/ 365)^(365*number of years)

        futureValue = calculateFutureValue(initialDeposit, annualInterestRate, (int) numberOfYears);

        totalInterest = futureValue - initialDeposit;

        System.out.println("Future Value: " + futureValue);
        System.out.println("Total interest: " + totalInterest);


    }

    public static double calculateFutureValue(double initialDeposit, double annualInterestRate,
                                                  int numberOfYears) {

        double dailyInterestRate = annualInterestRate / 365;

        double exponent = 365 * numberOfYears;

        double futureValue = initialDeposit * Math.pow((1+dailyInterestRate)
                , exponent);


        return futureValue;
        //now calculate the total interest
        //totalInterest = futureValue - initialDeposit

        //sout futureValue
        //sout totalInterest



    }
}