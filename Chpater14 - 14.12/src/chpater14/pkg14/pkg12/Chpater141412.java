/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpater14.pkg14.pkg12;

/**
 *
 * @author Brandon
 */
public class Chpater141412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int counter = 0;
      String[] letters = {"a","b","c","d","e",
                          "f","g","h","i","k",
                          "j","m","n","o","p",
                          "q","r","s","t","u",
                          "v","w","x","y","z"};
        int[] tally = {0,0,0,0,0,0,0,0,0,0,
                       0,0,0,0,0,0,0,0,0,0,
                       0,0,0,0,0};
      String line = "this is a test";
      int text = 0;
      int j = 0;
      int dupechecker = -2;
      for (int i = 0; i < line.length(); i++) {
          
          for (j = 0; j < 24; j++) {
              text = line.indexOf(letters[j],i);
              System.out.println(letters[j]+":"+i);
              if(text != -1){
                if(dupechecker == text){
                    System.out.println("skipping dupe detected");
                }else{
                dupechecker = text;
                tally[0]++; 
                }
          }
          }
             //System.out.println(text);
//             for (int i = 0; i < tally.length; i++) {
            System.out.println(letters[i]+":"+tally[i]);
        }
//             }
        }
//        System.out.println("Count:"+count);      
        
//        for (int i = 0; i < 25; i++) {
//            System.out.println("Pass:"+ i);
//            for (int x = 0; x < line.length();x++) {
//            //x = line.indexOf(letters[i], x);
//            
//                //System.out.println(text);
//                //System.out.println(test);
//                     if(text != -1){
//                         System.out.println("adding:"+i);
//                     tally[i]++;
//                     }
//                     
//            }     
             
            
        }
        
        
        
        
    
    

