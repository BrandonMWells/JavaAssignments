/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg8;

import java.util.Scanner;

/**
 *
 * @author CA240
 */
public class Chapter14148 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a telephone number.");
        String telephone_Num = input.nextLine();
        String[] area_code_splitter = telephone_Num.substring(0, 5).split("-");
        String[] number_splitter = telephone_Num.substring(5, 14).split(" ");
        
        System.out.println("Substring form:" + area_code_splitter[0].substring(1, 4) 
                            +" "
                            + number_splitter[0].substring(1, 4) 
                            +" "
                            + number_splitter[0].substring(5, 9));
        
       String s_Phone_Num = area_code_splitter[0].substring(1, 4).concat(number_splitter[0].substring(1, 4).concat(number_splitter[0].substring(5, 9)));
        
        
        
        // TODO code application logic here
    }
    
}
