package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // mortgagePayment; //referencing the other method
        //mortgagePayment = new totalMortgagePayment();

        double interestRate;
        int loanTime;
        double principal;
        //double loanLength;
        //double monthlyPayment;
        //double totalInterest;

        //String mortgageCalculator;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Mortgage Calculator: ");
        System.out.println("This calculator will calculate how much" +
                "a monthly payment for a loan would be. As well as " +
                "how much interest you would pay over the life" +
                "of the loan.");

        System.out.println("Enter Principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter interest rate: ");
        interestRate = scanner.nextDouble();
        double monthlyInterestRate = (interestRate / 100) / 12;

        System.out.println("Enter loan years: ");
        loanTime = scanner.nextInt();

        //convert annual interest rate to monthly interest rate
        //double monthlyInterestRate = interestRate / 100 / 12;

        //calculate the number of monthly payments
        int numberOfPayments = loanTime * 12;

        //calculate the monthly payment
        double myMonthlyPayment = principal * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Monthly Payment: $" + myMonthlyPayment);

        //double theTotalInterest = (monthlyInterestRate * loanTime) - principal;
        double theTotalInterest = (myMonthlyPayment * loanTime) - principal;
        System.out.println("Total interest: " + theTotalInterest);

        scanner.close();
    }
    //loanTime = loanTime * 12;
    //double totalMonthlyPayment = (principal * interestRate) / (1 - Math.pow(1 + interestRate - loanTime));



    //double principal = scan.nextDouble();
    //System.out.println("Enter Rate of Interest: ");
    //double rate = scan.nextDouble();
    //rate = (rate / 100) / 12;
    // System.out.println("Enter time in years: ");

    //int time = scan.nextInt();
    //time = time * 12;
    //double totalMonthlyPayment = (principal * rate) / (1 - Math.pow(1 + rate, -time));
    //System.out.println("Monthly Payment: ");



    //calculate the number of monthly payments (n)by
    //the loan years by 12
    //call the monthly payment method here with the calculation

    //monthlyPayment = principal[interestRate(1+interestRate)]

    //scanner.nextLine();

    //calculations

    //System.out.println("You will have a " + monthlyPayment +
    //      " with a total interest of: " + rate);


}
//monthly payment method
//    class MortgagePayment {
//        public static void monthlyPayment(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the principal amount: ");
//            double principal = scan.nextDouble();
//            System.out.println("Enter Rate of Interest: ");
//            double rate = scan.nextDouble();
//            rate = (rate / 100) / 12;
//            System.out.println("Enter time in years: ");
//
//            int time = scan.nextInt();
//            time = time * 12;
//            double p = (principal * rate) / (1 - Math.pow(1 + rate, -time));
//            System.out.println("Monthly Payment: ");
//        }
//    }}
