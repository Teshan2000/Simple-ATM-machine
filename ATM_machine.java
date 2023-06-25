import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {

        String cardNo = "200020104110";
        String pinNo = "1234";
        int cardCount = 0;
        int pinCount = 0;

        Scanner input = new Scanner(System.in);

        while (cardCount<3) {

            System.out.println("------------------------------------------------");
            System.out.println("|          Welcome to the ATM Machine!          |");
            System.out.println("------------------------------------------------\n");

            System.out.println("Please Enter your Card Number:");
            String enteredCardNo = input.nextLine();

            if (!enteredCardNo.equals(cardNo)) {
                System.out.println("Invalid Card Number!\n");
                System.out.println("Please Enter Again!\n");
                cardCount++;

                if (cardCount==3) {
                    System.out.println("You entered your Card Number 3 Times!\n");
                    System.out.println("Please Enter your Card Number Again!\n");   
                    main(args);  
                }  
            } 
            
            else {

                while (pinCount<3) {

                    System.out.println("Please Enter your Pin Number: ");
                    String enteredPinNo = input.nextLine();

                    if (!enteredPinNo.equals(pinNo)) {                

                        System.out.println("Invalid Pin Number!\n");
                        System.out.println("Please Enter Again!\n");
                        pinCount++;

                        if (pinCount==3) {
                            System.out.println("You entered your Pin Number 3 Times!\n");
                            System.out.println("Please Enter your pin Number Again!\n");   
                            main(args);  
                        }
                    }

                    else {

                        System.out.println("------------------------------------------------");
                        System.out.println("\tDo You want to continue Transaction?\n");
                        System.out.println(" (1)Yes");
                        System.out.println(" (2)No");
                        int continueTransaction = input.nextInt();     

                        if (continueTransaction==1) {

                            System.out.println("------------------------------------------------");
                            System.out.println("\tPlease Choose your option!\n");

                            System.out.println(" (1) Check your Balance");
                            System.out.println(" (2) Withdraw your Money");
                            System.out.println(" (3) Deposit your Money");
                            System.out.println(" (4) Cancel");
                            int choice = input.nextInt();

                            switch (choice) {

                                case 1:
                                Balance();
                                break;

                                case 2:
                                Withdraw();
                                break;

                                case 3:
                                Deposit();
                                break;

                                case 4:
                                main(args);
                            }                
                        }

                        if (continueTransaction==2) {
                            System.exit(continueTransaction);
                        }  
                    }                
                }
            }
        }

    }

    static void Balance() {
        System.out.println("------------------------------------------------");
        System.out.println("\tYour Balance is Rs.5000.00");
        System.out.println("------------------------------------------------");
    }

    static void Withdraw() {
        double balance = 5000.00;
        Scanner amount = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Please Enter your amount of Withdrawing\n");
        double withdrawl = amount.nextDouble();
        if (withdrawl >= balance) {
            System.out.println("Insufficient Balance!\n");
            System.out.println("Try Again!\n");
        }
        else {
            System.out.println("------------------------------------------------");
            System.out.println("Your Withdrawn Money: " + withdrawl);
            double newBalance = balance - withdrawl;
            System.out.println("\nYour New Balance: " + newBalance);
            System.out.println("------------------------------------------------");
        }
    }

    static void Deposit() {
        double balance = 5000.00;
        Scanner amount = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("Please Enter your amount of Depositing\n");
        double diposit = amount.nextDouble();
        if (diposit >= balance) {
            System.out.println("Insufficient Balance!\n");
            System.out.println("Try Again!\n");
        }
        else {
            System.out.println("------------------------------------------------");
            System.out.println("Your Depositted Money: " + diposit);
            double newBalance = balance + diposit;
            System.out.println("\nYour New Balance: " + newBalance);
            System.out.println("------------------------------------------------");
        }
    }
    
}