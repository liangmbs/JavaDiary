package com.company;

/**
 * Created by steven on 7/1/16.
 */
public class Account {
    private String AccountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account(){
        System.out.println("Empty construtor called");
    }

    public Account(String AccountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber){
        this.AccountNumber = AccountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
    }

    public void withdrawal(double withdrawAmount){
        if(accountBalance - withdrawAmount <= 0){
            System.out.print("not enough money \n");
        }else{
            this.accountBalance -= withdrawAmount;
            System.out.print("succeed");
        }
    }

    //use the code at the toolbar and then generate the Getter and Setter easily
    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
