/*
 Task-3
 ATM interface 
 */

import java.util.Scanner;
public class Atm_Interface {
    public static void printbalance(int balance) {
        System.out.println("updated balance :" + balance);
        System.out.println();
    }

    public static int withraw(int balance, int withrawammount) {
        System.out.println("withraw");
        System.out.println("The withraw amount is :" + withrawammount);
        if (balance >= withrawammount) {
            balance = balance - withrawammount;
            System.out.println("pleace collect your money");
            printbalance(balance);
        } else {
            System.out.println("insufficent balance");
            System.out.println();
        }
        return balance;
    }

    public static int transfer(int balance, int transferamount) {
        System.out.println("transfered");
        System.out.println("The transferd amount is :" + transferamount);
        if (balance >= transferamount) {
            balance = balance - transferamount;
            System.out.println("money is transfered.");
            printbalance(balance);
        } else {
            System.out.println("insufficent balance");
            System.out.println();
        }
        return balance;
    }


    public static int deposite(int balance, int depositeamount) {
        System.out.println("deposit");
        System.out.println("The deposite amount is :" + depositeamount);
        balance = balance + depositeamount;
        printbalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        int balance = 1000;
        int withraw, deposite, transfer, Ac_number;
        int pin = 4444;
        int user_id = 7489488;
        Scanner mn = new Scanner(System.in);
        System.out.println("......... Welcome to ATM.........");
        System.out.println("Enter the user Id");
        int ui = mn.nextInt();
        System.out.println("Enter the pin");
        int p = mn.nextInt();
        if(user_id == ui && pin == p){
            while (true) {
            System.out.println("Select 1 for Withdraw");
            System.out.println("Select 2 for Deposit");
            System.out.println("Select 3 for Transfer");
            System.out.println("Select 4 for check balance");
            System.out.println("Select 5 for EXIT");

            int op = mn.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Enter ammount to be withdraw :");
                    withraw = mn.nextInt();
                    balance=withraw(balance, withraw);
                    break;
                }
                case 2: {
                    System.out.println("Enter ammount to be Deposite :");
                    deposite = mn.nextInt();
                    balance=deposite(balance, deposite);
                    break;
                }
                case 3: {
                    System.out.println("Enter the account number");
                    Ac_number = mn.nextInt();
                    System.out.println("Enter ammount to be transfered :");
                    transfer = mn.nextInt();
                    balance=transfer(balance, transfer);
                    break;
                }
                case 4: {
                    System.out.println("Balance "+balance);
                    break;
                }
                case 5: {
                    System.out.println("thenk you");
                    System.exit(0);
                    break;
                }
            }
        }

        }
        else{
            System.out.println("incorrect pin or user id");
        }
    }

}