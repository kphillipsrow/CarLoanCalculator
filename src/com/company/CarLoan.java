package com.company;

public class CarLoan {
    double carLoan;
    int loanLength;
    double interestRate;
    int downPayment;

    public CarLoan (double carLoan, int loanLength, double interestRate, int downPayment){
        this.carLoan = carLoan;
        this.loanLength = loanLength;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
    }
    public double calculatePayment(){
        double remainingBalance = carLoan - downPayment;
        int months = loanLength*12;
        double monthlyBalance = remainingBalance/months;
        double interest= monthlyBalance*interestRate/100;
        double monthlyPayment =monthlyBalance + interest;
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
            return 0;
        } else if (downPayment >= carLoan){
            System.out.println("The car can be paid in full");
            return 0;

        }else{
            return monthlyPayment;
        }
    }
}
