/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg11;

import java.util.Scanner;

/**
 *
 * @author CA240
 */
public class Chapter141411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int test = 0;
        int dupechecker = -2;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a line");
        String sentence = input.nextLine();
        System.out.println("Please input a search character");
        char search_Char = input.next().charAt(0);
        
        for (int i = 0; i < sentence.length(); i++) {
             test = sentence.indexOf(search_Char,i);
             System.out.println(test);
             if(test != -1){
                if(dupechecker == test){
                    System.out.println("skipping dupe detected");
                }else{
                dupechecker = test;
                count++; 
                }
             }
        }
        System.out.println("Count:"+count);
    }
        }
        
        
        
    
    

