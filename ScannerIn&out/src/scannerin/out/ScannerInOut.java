/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerin.out;

// import scanner package 
import java.util.Scanner;
/**
 *
 * @author 
 */
public class ScannerInOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Declared varibles
    String name;
    int age;
    double dailyTravelDis;
        
//scanner declared
    Scanner input = new Scanner(System.in);
    
//Asking a question to the user by displaying though console
    System.out.print("What is your name>> ");
// sending the information that was entered to a varible
    name = input.next();
       
//Asking a question to the user by displaying though console
    System.out.print("What is your age>> ");
// sending the information that was entered to a varible
    age = input.nextInt();
                    
//Asking a question to the user by displaying though console
    System.out.print("What is your travel distance per day>> ");
// sending the information that was entered to a varible
    dailyTravelDis = input.nextDouble();
         
         
         
// dividing the output
    System.out.println("================================");
// displaying the information gathered
    System.out.println("Your name is : " + name) ;
// displaying the information gathered
    System.out.println("Your age is : " + age) ;
// displaying the information gathered
    System.out.println("Your travel distance per day is : " + dailyTravelDis +" km") ;
           
           
       
    }
    
}
