import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {

        String cardNo = "200020104110";
        String pinNo = "1234";
        int cardCount = 0;

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
            }
        }



    }

    
}
