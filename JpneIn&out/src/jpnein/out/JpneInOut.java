/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpnein.out;
// import scanner package 
import javax.swing.JOptionPane;
/**
 *
 * @author 
 */
public class JpneInOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Declared varibles
        String name;
       int age;
       double travel;
// sending the informationentered in thepop up toe the varible
       name = JOptionPane.showInputDialog(null, "Please enter your name:");
// sending the informationentered in thepop up toe the varible and changing it from string to Integer
       age = Integer.parseInt( JOptionPane.showInputDialog(null, "Please enter your age:"));
// sending the informationentered in thepop up toe the varible and changing it from string to Double
       travel = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter traveld distance for this month:"));

       
//Displaying all the entered information
       JOptionPane.showMessageDialog(null, "Your name is: " +name +"\n"+ "Your name is: "+age +"\n"+"Distance travels = "+ travel +"km");
       
       
    }
    
}
