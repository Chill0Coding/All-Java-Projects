/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// packages that I am using ( Scanner + Joptionpane )
package bmath;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author wilge
 */
public class Bmath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input varubles declared
        int num;
        double decimal;

        //scanner declared
        Scanner input = new Scanner(System.in);
// questions for user
        System.out.println("random number");
        num = input.nextInt();

        System.out.println("random number with desimal");
        decimal = input.nextDouble();
//math varubles declared
        double roundval;
        int minus;
        int plus;
        int times;
        double divide;
// basic math
        roundval = decimal * num;
        minus = 50 - num;
        plus = num + num;
        times = num * num;
        divide = decimal / num;
//output for completed math
        JOptionPane.showMessageDialog(null, "round value = " + Math.round(roundval) + "\n"
                + "minus = " + minus + "\n" + "plus = " + plus + "\n" + "times = " + times + "\n" + "divide = " + divide);

    }

}
