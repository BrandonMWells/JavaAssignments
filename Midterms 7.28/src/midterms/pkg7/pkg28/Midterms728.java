/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterms.pkg7.pkg28;

import java.security.SecureRandom;
import java.lang.Thread;

/**
 *
 * @author Brandon
 */
public class Midterms728 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        SecureRandom test = new SecureRandom();
        int i = 0;
        String[] Track = new String[80];
        for (i = 0; i < 80; i++) {
            Track[i] = " ";
        }
        int previous_Square_T = 1;
        int previous_Square_H = 1;
        int Hare = 1;
        int Tortoise = 1;
        int square_Tortoise = 1;
        int square_Hare = 1;
        boolean inf_Loop = true;

        Thread.sleep(1000);
        System.out.println("ON YOUR MARK, GET SET");
        Thread.sleep(1000);
        System.out.println("BANG");
        Thread.sleep(1000);
        System.out.println("AND THEY'RE OFF!!!");

        while (inf_Loop) {
            Hare = 1 + test.nextInt(10);
            Tortoise = 1 + test.nextInt(10);
            Track[previous_Square_H] = " ";
            Track[previous_Square_T] = " ";
            square_Tortoise = tortoise_move(Tortoise, square_Tortoise);
            square_Hare = hare_Move(Hare, square_Hare);
            Track[square_Hare] = "H";
            Track[square_Tortoise] = "T";
            if (square_Tortoise == square_Hare) {
                Track[square_Tortoise] = "Ouch";
            }
            previous_Square_T = square_Tortoise;
            previous_Square_H = square_Hare;

            //System.out.printf("T%d/H%d:",square_Tortoise,square_Hare);
            Thread.sleep(1000);
            for (i = 0; i < 80; i++) {
                System.out.printf(Track[i]);
            }
            System.out.println("");
            if (square_Tortoise > 70 && square_Hare > 70) {
                System.out.println("The Tortoise barely wins!!");
                break;
            }
            if (square_Tortoise > 70) {
                System.out.println("Tortoise Wins YAY!!!!");
                break;
            }
            if (square_Hare > 70) {
                System.out.println("Hare wins. Yuch");
                break;
            }

        }
    }

    public static int tortoise_move(int Tortoise, int square_Tortoise) {
        //System.out.println("T ROLL :"+ Tortoise);
        //Fast Plod 3 spaces right  1-5
        if (1 <= Tortoise && Tortoise <= 5) {
            square_Tortoise += 3;
        } //slip 6 spaces to the left
        else if (6 <= Tortoise && Tortoise <= 7) {
            square_Tortoise -= 6;
            //System.out.println("Tortoise Slipped");
            if (square_Tortoise <= 0) {
                //System.out.println("Tortoise has to start over");
                square_Tortoise = 1;
            }
        } //slow plod 1 space to the right
        else if (8 <= Tortoise && Tortoise <= 10) {
            square_Tortoise += 1;
        }
        return square_Tortoise;
    }

    public static int hare_Move(int Hare, int square_Hare) {
        //Sleep
        //Hare Sleeps 1-2 Roll 20%
        //System.out.println("H ROLL :"+ Hare);
        if (1 <= Hare && Hare <= 2) {
            square_Hare += 0;
        } //Big Hop
        //Hare Moves 9 spaces Right 3-4 roll 20%
        else if (3 <= Hare && Hare <= 4) {
            square_Hare += 9;
            //System.out.println("H = Big Hop");
        } //Small Slip
        // Hare moves 2 spaces Left 5-6 roll 20%
        else if (5 <= Hare && Hare <= 6) {
            square_Hare -= 2;
            //System.out.println("H = Small Slip"); 
            if (square_Hare <= 0) {
                //System.out.println("Hare has to start over");
                square_Hare = 1;
            }
        } //Small hop
        //Hare moves 1 space to the right 7-9 roll 30%
        else if (7 <= Hare && Hare <= 9) {
            square_Hare += 1;
            //System.out.println("H = small hop");   
        } //big slip
        //hare  slips up big  moves left 12 spaces 10%
        else if (Hare == 10) {
            square_Hare -= 12;
            //System.out.println("Slips big");
            if (square_Hare <= 0) {
                //System.out.println("Hare has to start over");
                square_Hare = 1;
            }
        }
        return square_Hare;
    }
}
