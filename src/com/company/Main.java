package com.company;

public class Main {

    public static void main(String[] args) {
        CarLoan newLoan = new CarLoan(25000,48,5.5,3000);
        System.out.println(newLoan.calculatePayment());
    }
}


