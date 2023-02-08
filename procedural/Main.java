package procedural;
import java.util.Scanner;

public class Main {
  static double balance =10000; 
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int choice = 0;

    while (choice != 4) {
      System.out.println("ATM Machine");
      System.out.println("1. Check Balance");
      System.out.println("2. Withdraw Money");
      System.out.println("3. Deposit Money");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice) {
        case 1:
          checkBalance();
          break;
        case 2:
          withdrawMoney();
          break;
        case 3:
          depositMoney();
          break;
        case 4:
          System.out.println("Thank you for using ATM machine!");
          break;
        default:
          System.out.println("Invalid input. Please try again.");
          break;
      }
    }
  }

  public static void checkBalance() {
    System.out.println("Your current balance is $" + balance);
  }

  public static void withdrawMoney() {
	  
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the amount you want to withdraw: $");
    
    double amount = scan.nextDouble();
    
    if (amount > balance) {
      System.out.println("Insufficient funds. Please try again.");
    } else {
      balance = balance - amount;
      
      System.out.println("You have successfully withdrawn $" + amount);
      System.out.println("Your current balance is $" + balance);
    }
  }

  public static void depositMoney() {
	  
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the amount you want to deposit: $");
    
    double amount = scan.nextDouble();
    balance = balance + amount;
    
    System.out.println("You have successfully deposited $" + amount);
    System.out.println("Your current balance is $" + balance);
  }
}
