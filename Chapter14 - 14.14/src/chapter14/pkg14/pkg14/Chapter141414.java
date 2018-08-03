/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14.pkg14.pkg14;

/**
 *
 * @author Brandon
 */
public class Chapter141414 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "edward defeated the chimera with the spear!";
        String[] tokens = text.split(" ");
        for(String token : tokens){
            if(token.endsWith("ed")){
            System.out.println(token);
            }
        }
    }
    
}
