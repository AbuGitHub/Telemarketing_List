import java.util.Scanner;
public class Telemarketing_list
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Array of names
      String[] nameList = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
      //Array of numbers
      String[] numberList = {"555-2234", "555-9098", "555-1785", "555-9224"};
      
      //Ask user for input
      System.out.println("Please enter the name of a person to be searched for:  (Full, first, or last)");
      String userInput = keyboard.nextLine();
       
      //If userInput is the same as any of array values, display that name and its number
      //If userInput starts with the last name of a value, display that name and its number
      
      for(int i = 0; i < nameList.length; i++)
      {
         //Changer userinput's first char to upper case for better compatibility with following else if statements
         userInput = Character.toUpperCase(userInput.charAt(0)) + userInput.substring(1);
         
         if(userInput.equalsIgnoreCase( nameList[i] ))
         {  
            System.out.println("\n");
            System.out.print("NAME: " + nameList[i] + " ___________________________________ " + "NUMBER: " + numberList[i] + "\n");
            
         }     
                    
         else if(userInput.startsWith("Harrison") || userInput.startsWith("Rose"))
         {
            System.out.println("\n");
            System.out.println("NAME: " + nameList[0] + " _____________________________________ " + "NUMBER: " + numberList[0] + "\n");
         }
         
         else if(userInput.startsWith("James") || userInput.startsWith("Jean"))
         { 
            System.out.println("\n");
            System.out.println("NAME: " + nameList[1] + " _____________________________________ " + "NUMBER: " + numberList[1] + "\n");
         }
            
         else if(userInput.startsWith("Smith") || userInput.startsWith("William") || userInput.startsWith("Brad"))
         {
            if(userInput.startsWith("William"))
            {
            System.out.println("\n NAME: " + nameList[2] + "___________________________________" + "NUMBER: " + numberList[2] + "\n");
            break;
            }
            
            else if(userInput.startsWith("Brad"))
            {
            System.out.println("\n NAME: " + nameList[3] + "___________________________________" + "NUMBER: " + numberList[3] + "\n");
            break;
            }
                        
            System.out.println("\n");
            System.out.println("NAME: " + nameList[2] + " _____________________________________ " + "NUMBER: " + numberList[2] + "\n");
            System.out.println("NAME: " + nameList[3] + " _____________________________________ " + "NUMBER: " + numberList[3] + "\n");
         }
         
         else
         System.out.println("Error: That name cannot be found.");
         break;
  
      }
      
      
   }
   
 }
      
