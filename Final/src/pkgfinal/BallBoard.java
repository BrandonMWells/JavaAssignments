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
public class BallBoard {
    private int slots;
    private int[] slotSocket;
    public BallBoard(int slots) {
        if(this.slots < 2 && this.slots > 20){
         throw new IllegalArgumentException("Please input a number between [2 - 8]");
        }
        this.slots = slots;
        this.slotSocket = new int[21];
    }
    public int[] getSlotSocket() {
        return slotSocket;
    }
    public void setSlotSocket(int[] slotSocket) {
        this.slotSocket = slotSocket;
    }
    @Override
    public String toString() {
        return "BallBoard{" + "slots=" + slots + '}';
    }
    public int getSlots() {
        return slots;
    }
    public void setSlots(int slots) {
        this.slots = slots;
    }
    public void addBalltoSocket(int ele){
        this.slotSocket[ele] += 1;
    }
    public void tallySocket(){
        System.out.println();
       
         for (int i = 1; i < this.slots + 1; i++) {
            System.out.println("Slot "+i+":"+this.slotSocket[i]);  
    }
         
         
    }
}
