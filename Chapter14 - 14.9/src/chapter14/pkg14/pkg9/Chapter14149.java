/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg9;

import java.util.Scanner;

/**
 *
 * @author CA240
 */
public class Chapter14149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please form a sentence with spaces.");
        String sentence = input.nextLine();
       
        String[] reverseMe = sentence.split(" ");
        
        for(int counter = reverseMe.length - 1; counter >= 0; counter-- ){    
            System.out.print(reverseMe[counter]);
            System.out.print(" ");
            
        }
            
    }
    
}
