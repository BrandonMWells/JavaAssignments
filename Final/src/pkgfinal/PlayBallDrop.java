/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Brandon
 */
public class PlayBallDrop {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        BallBoard Board = new BallBoard(2);
        Ball balls = new Ball();
        int ballPos = 0;
        System.out.println("Please enter the number slots [2-20]");
        while(true){
        try{
        Board.setSlots(input.nextInt());
        break;
        }catch(IllegalArgumentException e){
           throw e; 
        }
        }
        System.out.println("Please enter the number of balls to drop:");
        balls.setNumOfBalls(input.nextInt());
        for (int x = 0; x < balls.getNumOfBalls(); x++) {
        for (int i = 0; i < Board.getSlots() - 1; i++) {
            int LeftOrRight = random.nextInt(2);
            ballPos = ballPos + LeftOrRight;
            if(LeftOrRight == 0){
                System.out.print("L");
            }else{
                System.out.print("R");
            }
        }
        Board.addBalltoSocket(ballPos);
        ballPos = 0;
        System.out.println();
        }
        Board.tallySocket();
    }
    
}
