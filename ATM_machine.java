import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {

        String cardNo = "200020104110";
        String pinNo = "1234";
        int cardCount = 0;
        int pinCount = 0;
        //double balance = 5000.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine!");

        System.out.println("Please Enter your Card Number:");
        String enteredCardNo = input.nextLine();

        if (!enteredCardNo.equals(cardNo)) {
            System.out.println("Invalid Card Number!");
            System.out.println("Please Enter Again!");
            main(args);
        } 
        
        else {

            System.out.println("Please Enter your Pin Number: ");
            String enteredPinNo = input.nextLine();

            if (!enteredPinNo.equals(pinNo)) {                

                System.out.println("Invalid Pin Number!");
                System.out.println("Please Enter Again!");
                main(args);
            }

            else {

                System.out.println("Please Choose your option!");

                System.out.println("\n\t\t\t\t (1) Check your Balance");
                System.out.println("\n\t\t\t\t (2) Withdraw your Money");
                System.out.println("\n\t\t\t\t (3) Deposit your Money");
                System.out.println("\n\t\t\t\t (4) Cancel");
                int choice = input.nextInt();

                switch (choice) {

                    case 1:
                    Balance();

                    case 2:
                    Withdraw();

                    case 3:
                    Deposit();

                    case 4:
                    //exit();
                    main(args);

                }
                
            }
        }



    }

    static void Balance() {
        System.out.println("Your Balance is Rs.5000.00");
    }

    static void Withdraw() {
        double balance = 5000.00;
        Scanner amount = new Scanner(System.in);
        System.out.println("Please Enter your amount of Withdrawing");
        double withdrawl = amount.nextDouble();
        if (withdrawl >= balance) {
            System.out.println("Insufficient Balance!");
            System.out.println("Try Again!");
        }
        else {
            System.out.println("Your Withdrawn Money is " + withdrawl);
            double newBalance = balance - withdrawl;
            System.out.println("Your New Balance is " + newBalance);

        }

    }

    static void Deposit() {
        double balance = 5000.00;
        Scanner amount = new Scanner(System.in);
        System.out.println("Please Enter your amount of Depositing");
        double diposit = amount.nextDouble();
        if (withdrawl >= balance) {
            System.out.println("Insufficient Balance!");
            System.out.println("Try Again!");
        }
        else {
            System.out.println("Your Depositted Money is " + diposit);
            double newBalance = balance - diposit;
            System.out.println("Your New Balance is " + newBalance);

        }

    }

    
}