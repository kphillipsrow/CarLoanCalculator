package com.company;

public class CarLoan {
    double carLoan = 24007.56;
    int loanLength = 5;
    double interestRate = 6.0833;
    int downPayment = 2000;
    double remainingBalance = carLoan - downPayment;
    int months = loanLength*12;
    double monthlyBalance = remainingBalance/months;
    double interest= monthlyBalance*interestRate/100;
    double monthlyPayment =monthlyBalance + interest;
}
