package simpleATM;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.Arrays;


public class AtmService implements AtmOperation{

    ATM atm = new ATM();
    Scanner sc = new Scanner(System.in);
    ArrayList<String> statement = new ArrayList<String>();
    LocalDateTime time = LocalDateTime.now();


    @Override
    public void viewBalance() {
        System.out.println("Balance: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount() {
        System.out.println("Enter amount to withdraw");
        double amount = sc.nextDouble();

        if(amount %50 == 0){
            if(amount > atm.getBalance()){
                System.out.println("Insufficient Balance");


            }else{
                double newBalance = atm.getBalance() - amount;
                atm.setBalance(newBalance);
                String message = amount + " withdrawn" + " , " + "Date: " + time.getYear() + " " + time.getMonth() + " " + time.getDayOfMonth() + " " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
                statement.add(message);
                System.out.println("Take your money");
            }
        }else{
            System.out.println("Can only withdraw multiples of 50");
        }


    }

    @Override
    public void depositAmount() {
        System.out.println("Enter amount to deposit");
        double amount = sc.nextDouble();
        double newBalance = atm.getBalance() + amount;
        atm.setBalance(newBalance);
        String message = amount + " deposited" + " , " + "Date: " + time.getYear() + " " + time.getMonth() + " " + time.getDayOfMonth() + " " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
        statement.add(message);
        System.out.println(amount + " has been deposited");

    }

    @Override
    public void viewMiniStatement() {
       for(String statement : statement){
           System.out.println(statement);
       }
    }
}
