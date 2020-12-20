package housepaymentfinal;
import java.util.Scanner;
import java.text.*;
import java.util.Random;

/*
 * Date: June 18th 2020                 
 * programmer name: Zaid Khan         
 * Program: HouseMonthlyPaymentFinal.java           
 * Project Name: HouseMonthlyPayentFinal 
 */

public class HousePaymentFinal {

    public static void main(String[] args) {
        // Initialize Scanners
        Scanner scanN = new Scanner(System.in); // Initializing scanner Numeric
        Scanner scanS = new Scanner(System.in); // Initializing Scanner Strings
        
        //Variables//
        int Check; // checks if the user wants look for another house
        int MainDoLoop = 1; // so Loop knows when too loop and when not too
        double MathOutput = 1; // wMethod 3
        String SearchArea;
        String RandomHouse;
        // ^^ Variables ^^ //
              
        do { // Main Do... While Loop
            
            WelcomeUser(); //Style 1
            SearchArea = CityFinder(); //Style 3
            RandomHouse = HouseSearch(SearchArea);//Style 4 returned chosen house
            MathOutput = Final(RandomHouse); // Style 4
            PrintOutputScreen(MathOutput);  
            
            // Asks user if they want to look for another house
            
            System.out.println("Would you like to look for another house maybe?"
                    + "\nIf yes press 1"
                    + "\nIf no press 2");
            
            Check = scanN.nextInt();
            
            if (Check == 1) {
                MainDoLoop = 0;
            } 
            
            
            else if (Check == 2) {
                System.out.println("Found the dream home!??" 
                        + "\ncontact us at 123-456-7890 to find out more!");
                System.out.println("Thank you for using Zaids House Loan calculator!"); //Farewll message at the end of the program
                System.exit(0);
            }
            
            else {
                System.out.println("Incorrect Selection Please restart program");
            }
           
        } while (MainDoLoop == 0); 
    } 
    
    public static void WelcomeUser() { // First Method
        
        int stars; // limit how many astricks are produced
        
        for (stars=0; stars<30; stars++) { // For Loop Astericks
            System.out.print("===");
        }                
        
        System.out.println("\n\t\t\t House Finder & Mortgage calculator"); //title of program
        
        System.out.println("\t\t\t welcome to Zaids Real Estate Calculator" //Welcome/starting menue
                + "\n\t\t\t we will help YOU find the perfect house, if you have any"
                + "\n\t\t\t questions or would like to discuss in further detiail"
                + "\n\t\t\t contact my team at 123-456-7890!\n ");
        
        for (stars=0; stars<30; stars++) { // Bottom Loop Astricks
            System.out.print("===");    
        }                                    
    }
    
    public static String CityFinder() { // Second Method
        
        String SearchArea; // Search Area for home is stored here
        Scanner scanS = new Scanner(System.in); // Initializing Scanner Strings
        
        System.out.println("\nWhat area would you like to look at homes in? ");
        SearchArea = scanS.nextLine();
        
            
            System.out.println("Great we will search for homes in " + SearchArea); //outputs any city the user inputs
         
        return (SearchArea);
    }
    
    public static String HouseSearch(String SearchArea) { // Third Method
        
        DecimalFormat decFor = new DecimalFormat("0.00"); // To eliminate Decimals
        Scanner scanS = new Scanner(System.in);
        
        int x = 1; // used for do... while loop
        
        String ChosenHouse;
        
        System.out.println("\nThe following houses are listed in " + SearchArea);
        
        String HouseNames[] = {"Willow's Way \nPrice $5,000,000" , "King Edward Road \n$3,000,000", //setting array for house names and prices
            "Kingsley Avenue \n$2,000,000" , "Onyx Street \n$500,000" , "Chapel Boulevard \n$600,000" ,
            "Apollo Avenue \n$50,000" , "Barley Street \n$173,000" , "Chemin de Tonnerre \n$279,970" , 
            "Chemin des Noyers \n$343,750"};
        
         System.out.print( "\n" + HouseNames[new Random().nextInt(HouseNames.length)]);     // House Name 1
         System.out.print( "\n" + HouseNames[new Random().nextInt(HouseNames.length)]);     // House Name 2
         System.out.print( "\n" + HouseNames[new Random().nextInt(HouseNames.length)]);     // House Name 3
         System.out.print( "\n" + HouseNames[new Random().nextInt(HouseNames.length)]);     // House Name 4
         System.out.print( "\n" + HouseNames[new Random().nextInt(HouseNames.length)]);     // House Name 5
         
         do {
         
         System.out.print("\n\nWhich house would you be interested in? Please " //Asking user which house they are interested in
                + "type the name, ensure all characters are correct: ");
         
         ChosenHouse = scanS.nextLine();
         
         switch (ChosenHouse) { 
             
             case "Willow's Way": case "willow's way": //Name of house and in lower and uppercase for a friendlier user input
                 x = 0;
                break;
             case "King Edward Road": case "king edward road":
                 x = 0;
                break;
             case "Kingsley Avenue": case "kingsley avenue":
                 x = 0;
                 break;
             case "Onyx Street": case "onyx street":
                 x = 0;
                 break;
             case "Chapel Boulevard": case "chapel boulevard":
                 x = 0;
                 break;
             case "Apollo Avenue": case "apollo avenue":
                 x = 0;
                 break;
             case "Barley Street": case "barley street":
                 x = 0;
                 break;
             case "Chemin de Tonnerre": case "chemin de Tonnerre":
                 x = 0;
                 break;
             case "Chemin des Noyers": case "chemin des noyers":
                 x = 0;
                 break;
             default:
                 System.out.println("That house is not on any listing please try again");
                 x = 1;
 
         }  
     } while(x == 1);
          return(ChosenHouse); 
        
        } // returned chosen house
    
    public static double Final(String RandomHouse) {
        
        DecimalFormat decFor = new DecimalFormat("0.00"); // To eliminate Decimals
        
        Scanner scanN = new Scanner(System.in);
        double price = 0;
        int stars; // for design
        // Declaring Calculation Variables
        double DownPay; 
        double loanAmount; 
        double termInYears;
        double termInMonths;
        double interestRate;
        double monthlyRate;
        double monthlyPayment;
        
         switch (RandomHouse) {
             
             case "Willow's Way": //Name of house
                price = 5000000; //price of hous
                break;
             case "King Edward Road":
                price = 300000;
                break;
             case "Kingsley Avenue":
                price = 2000000;
                break;
             case "Onyx Street":
                price = 500000;
                break;
             case "Chapel Boulevard":
                price = 600000;
                break;
             case "Apollo Avenue":
                price = 50000;
                break;
             case "Barley Street":
                price = 173000;
                break;
             case "Chemin de Tonnerre":
                price = 279970;
                break;
             case "Chemin des Noyers":
                price = 343750;
                break;
         } 
         
    
      System.out.print("What is your Down Payment? $"); //Prompts the user for their down payment amount
      DownPay = scanN.nextInt();
      
      System.out.println("Loan Amount (cost of house): $" + (price-DownPay)); //asks the user for their loan amount
      loanAmount = (price-DownPay); // User wont pay mortgage on downpay  
      
      System.out.print("What is your Loan Term in years: ");
      termInYears = scanN.nextInt();
      
      System.out.print("Interest Rate: "); //Asks the user for their interest rate
      interestRate = scanN.nextDouble();
      
      // Calculations
      interestRate = interestRate/100.0; // Divides interest rate by 100 so it's in decimal
      monthlyRate = interestRate / 12.0; 
      termInMonths = termInYears * 12;
      monthlyPayment = (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -termInMonths));
      
      for (stars=0; stars<30; stars++) { // For Loop Astericks
            System.out.print("===");
        }                

      System.out.println("\nYour interest rate: " + decFor.format(interestRate*100) + "%"); //Outputs the users calculated interest rate
      System.out.println("your Term Length in Years: " + termInYears + " Year(s)"); //Outputs the users term lenght in years
      System.out.println("Your Term Length in months: " + termInMonths + "Month(s)"); //outputs the users term lenght in months

        
        return(monthlyPayment);
    }
    
    public static double PrintOutputScreen(double MathOutput) { //Method for outputting final loan payment amount
       
        DecimalFormat decFor = new DecimalFormat("0.00"); // To eliminate Decimals
       
       System.out.println("Your Monthly Payment will be: $" + decFor.format(MathOutput)); //Outputs the users monthly payment
       return(MathOutput);
    }
}