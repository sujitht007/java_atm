import java.util.*;

public class atm {
    public static void main(String a[]) {
        int pin = 1234;
        int balance = 10000;
        int addamount = 0;
        int takeamount = 0;

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = sc.nextInt();
        if(password==pin){
            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("Welcome!!"+name);
            while(true){
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to withdraw amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to  EXIT");
                int option;
                option = sc.nextInt();
                switch(option){
                    case 1:
                    System.out.println("Your current balance: "+balance);
                    System.out.println("Thank You!");
                    break;
                    case 2:
                    System.out.println("Amount to add: ");
                    addamount = sc.nextInt();
                    System.out.println("Successfully Credited");
                    balance = balance + addamount;
                    System.out.println("Balance: "+balance);
                    break;
                    case 3:
                    System.out.println("Amount you need to withdraw: ");
                    takeamount = sc.nextInt();
                    if(takeamount>balance){
                        System.out.println("Insufficient Balance");
                        System.out.println("Enter amount within your balance");
                    }
                    else{
                        System.out.println("Withdrawal Succesfull!");
                        balance = balance - takeamount;
                        System.out.println("Balance: "+balance);
                    }
                    break;
                    case 4:
                    System.out.println("Welcome to Tamilnadu ATM");
                    System.out.println("Available Balance: "+balance);
                    System.out.println("Amount Deposited: "+addamount);
                    System.out.println("Withdrawal Amount: "+takeamount);
                    System.out.println("THANK YOU!");
                    break;
                    case 5:
                    System.out.print("Thank you!");
                    break;
                    default:
                    System.out.println("Press number below 5!");
                }
            }
        }
        else{
            System.out.println("Incorrect Pin!");
        }
    }
}