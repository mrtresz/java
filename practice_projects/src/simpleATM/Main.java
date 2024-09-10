package simpleATM;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        AtmService atmService = new AtmService();
        int atmNumber = 12345;
        int atmPin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ATM number: ");
        int atmNumberInput = input.nextInt();
        System.out.print("Enter an ATM Pin: ");
        int atmPinInput = input.nextInt();
        if (atmNumberInput == atmNumber && atmPinInput == atmPin) {

            while(true) {
                System.out.println("""
                        ****** MENU ******\
                        
                        1.View Balance\s
                        2.Withdraw Amount
                        3.Deposit Amount
                        4.View Statements
                        5.Exit\s
                        
                        """
                );
                System.out.println("Enter choice");
                int choice = input.nextInt();
                switch(choice) {
                    case 1 -> {
                        atmService.viewBalance();
                    }
                    case 2 -> {
                        atmService.withdrawAmount();
                    }
                    case 3 -> {
                        atmService.depositAmount();
                    }
                    case 4 -> {
                        atmService.viewMiniStatement();
                    }
                    case 5 -> {
                        System.out.println("Collect your ATM Card\n Thank you for using our ATM Bank");
                        System.exit(0);
                    }
                }
            }

        } else if (atmNumberInput == atmNumber && atmPinInput != atmPin) {

            System.out.println("Error: incorrect Pin");
            System.exit(0);

        }else if(atmNumberInput != atmNumber && atmPinInput == atmPin){
            System.out.println("Error: incorrect ATM Number");
            System.exit(0);
        }else{
            System.out.println("Error: Incorrect ATM Number and Pin");
            System.exit(0);
        }


    }
}
