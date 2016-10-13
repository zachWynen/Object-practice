/**
 *      SEE MAIN CLASS
 */
package mybankmachine;

import java.util.*;

public class ATM 
{
 //variable declaration
 String bank;   
 Scanner kb = new Scanner(System.in);
 double balance;
    
 /**
  *     Constructor method 
  *     Pre: Proper initial information input by user
  *     Post: Global variables assigned to information
  */
 public ATM(String name, double init)
 {
  bank = name;
  balance = init;
 }
 
 /**
  *     This method allows the user to
  *     subtract a certain amount of money 
  *     from their account.
  *     Pre: The user selects the proper input
  *     Post: A specified amount is "Withdrawn"
  */
 public void Withdraw()
 {
  System.out.println("Enter the amount you would like to withdraw: ");
  double amount = kb.nextDouble();
  if(amount <= 0)
  {
   System.out.println("Invalid input. Cannot withdraw negative amount.");   
  }
  else if(amount>balance)
  {
   System.out.println("Invalid input. Withdrawal exceeds balance.");   
  }
  else
   balance -= amount;   
 }
 
  /**
  *     This method allows the user to
  *     add a certain amount of money 
  *     to their account.
  *     Pre: The user selects the proper input
  *     Post: A specified amount is "Deposited"
  */
 public void Deposit()
 {
  System.out.println("Enter the amount you would like to deposit: ");
  double amount = kb.nextDouble();
  if(amount <= 0)
  {
   System.out.println("Invalid input. Cannot deposit negative amount.");   
  }
  else
  {
   balance += amount;
   System.out.println("\nTransaction succesful\n");
  }
 }
 
  /**
  *     This method allows the user to
  *     display their current balance.
  *     Pre: The user selects the proper input
  *     Post: The balance is displayed in the console
  */
 public void Balance()
 {     
  System.out.println("Your balance is: " + ((int)(balance+ 0.005)*100)/100 + "$");   
 }
 
  /**
  *     This method allows the user to
  *     calculate compound interest over
  *     a specified time.
  *     Pre: The user selects the proper input
  *     Post: A specified amount is added to the current balance
  *     based on a compound interest formula
  */
 public void Interest()
 {
  double i;
  int n;
  System.out.println("NOTE: THIS INTEREST IS COMPOUNDED MONTHLY");
  System.out.println("Please enter your interest rate: ");
  i = kb.nextDouble();
  System.out.println("Please enter the number of days to compound: ");
  n = kb.nextInt();
  if(n <=0 || i<= 0)
   System.out.println("Invalid input. Cannot have negative days or interest.");
  else
  {
   balance = balance*Math.pow((1+i),(n/31));
   System.out.println("\nTransaction succesful\n");
  }
 }
}
