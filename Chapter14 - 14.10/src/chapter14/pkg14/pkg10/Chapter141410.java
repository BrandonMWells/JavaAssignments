/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg10;

import java.util.Scanner;

/**
 *
 * @author CA240
 */
public class Chapter141410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Please form a sentence.");
        String sentence = input.nextLine();
        System.out.println("Output:");
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
    }
    
}
