package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account steveAccount = new Account("23232323", 200, "steven", "liang.chis@husky.neu.edu", "8888888888");
        steveAccount.withdrawal(100.0);

        steveAccount.deposit(100.0);
        steveAccount.withdrawal(23.0);
    }
}
