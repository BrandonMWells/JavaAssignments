/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg13;

/**
 *
 * @author Brandon
 */
public class Chapter141413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "be the best you can and be the best that you can be.";
        String[] tokens = text.split(" ");
        for(String token : tokens){
            if(token.contains("b")){
            System.out.println(token);
            }
        }
        
    }
    
}
