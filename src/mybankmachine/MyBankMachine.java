/**
 *      ZACH WYNEN      ICS4U       OCT 12, 2016      
 *      This program uses multiple classes and object
 *      oriented programming to simulate an ATM, based
 *      on user input with console.
 */
package mybankmachine;

import java.util.*;

public class MyBankMachine
{

    public static void main(String[] args) 
    { 
     //variable declaration
     Scanner kb = new Scanner(System.in); 
     String bank;
     double initial = 0, amount, interest;
     int days;
     boolean transaction = true, valid = false;
    
     //promting user for input  
     System.out.println("Welcome to the ATM!\n Please input your bank name:");   
     bank = kb.next();
     while(valid == false)
     {
      System.out.println("Please input your initial amount");
      initial = kb.nextDouble();
      if(initial > 0)
       valid = true;
      else
       System.out.println("Invalid input. Please enter a positive number.");
     }
     ATM machine = new ATM(bank, initial);
     
     //While the program is being used
     while(transaction == true)
     {
      System.out.println("\n\n\nWelcome, " + bank + " patron.\n");
      System.out.println("Withdraw: 1\t\t\t\t\t2 :Deposit\n\n");
      System.out.println("Display Balance: 3\t\t\t\t4 :Accumulate Interest");
      int select = kb.nextInt();
      
      //calling appropriate methods
      if(select == 1)
       machine.Withdraw();
      else if(select == 2)
       machine.Deposit();  
      else if(select == 3)
       machine.Balance();  
      else if(select == 4)
       machine.Interest();  
      else
       System.out.println("Invalid choice");
     }   
    }
    
    
}
