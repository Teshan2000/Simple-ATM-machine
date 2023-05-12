import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {

        String cardNo = "200020104110";
        String pinNo = "1234";

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the ATM Machine!");

        System.out.println("Please Enter your Card Number:");
        String enteredCardNo = input.nextLine();

        if (enteredCardNo.equals(cardNo)) {
            system();
        } 
        else {
            System.out.println("Invalid Card Number!");
            System.out.println("Please Enter Again!");
        }
        
        System.out.println("Please Enter your Pin Number: ");
        String enteredPinNo = input.nextLine();

        if (enteredPinNo.equals(pinNo)) {
            system();
        }        
        else {
            System.out.println("Invalid Pin Number!");
            System.out.println("Please Enter Again!");
        }


    }

    static void system() {
        System.out.println("Please select your choice");
    }
}
