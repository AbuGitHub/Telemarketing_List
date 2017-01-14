import java.util.Scanner;

public class Password_Creator
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      boolean validity1 = false;
      boolean validity2a = false;
      boolean validity2b = false;
      boolean validity3 = false;
      
      //Program info display & get user input
      System.out.println("Please enter a password for your Amazon account:\n" +
                         "Your Amazon password must meet the following criteria:\n" +
                         "1) The password should be at least six (6) characters long.\n" +
                         "2) The password should contain at least one (1) uppercase and at least one (1) lowercase letter.\n" +
                         "3) The password should have at least one (1) digit.\n");
      String userInputString = keyboard.nextLine();
         
      //Validity check 1: Password long enough?
      if(userInputString.length() >= 6)
      validity1 = true;
           
      //Validity check 2: Password has uppercase? 
      for(int i = 0; i < userInputString.length(); i++)
      {
         if(Character.isUpperCase(userInputString.charAt(i)))
         validity2a = true;
         
      }
          
      //Validity check 2: Password has lowercase?
      for(int i = 0; i < userInputString.length(); i++)
      {
         if(Character.isLowerCase(userInputString.charAt(i)))
         validity2b = true;
         
      }
                                    
      //Validity check 3: Password has digit?
      for(int i = 0; i < userInputString.length(); i++)
      {
         if(Character.isDigit(userInputString.charAt(i)))
         validity3 = true;
      
      }
                  
      //Validity display:
      if(validity1 == true && validity2a == true && validity2b == true && validity3 == true)
      System.out.println("\nYour password is valid.");
      
      else
      System.out.println("\n\tYour password is invalid.\n Please correct the following errors:\n ________________________________\n");
      
      if(userInputString.length() < 6) 
      System.out.println("(!) Your password is less than 6 characters.\n Please enter a password with 6 characters or more.\n");
      
      if(validity2a == false)
         System.out.println("(!) Your password has no upper case characters. \n Please enter a password with at least one upper case letter.\n");
         
      if(validity2b == false)
         System.out.println("(!) Your password has no lower case Characters. \n Please enter a password with at least one lower case letter.\n");
         
      if(validity3 == false)
         System.out.println("(!) Your password has no digits. \n Please enter a password with at least one digit.\n");
      
      
      
                                  
   }
}