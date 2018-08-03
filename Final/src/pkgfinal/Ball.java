/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

/**
 *
 * @author Brandon
 */
public class Ball {
    int numOfBalls;
    
    public Ball() {
        this.numOfBalls = 0;
    }

    @Override
    public String toString() {
        return "Ball{" + "numOfBalls=" + numOfBalls + '}';
    }

    public int getNumOfBalls() {
        return numOfBalls;
    }

    public void setNumOfBalls(int numOfBalls) {
        this.numOfBalls = numOfBalls;
    }
    
    
}
