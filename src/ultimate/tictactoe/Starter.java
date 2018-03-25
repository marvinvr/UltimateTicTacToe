/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.tictactoe;

import javax.swing.JOptionPane;

/**
 *
 * @author MarvinvR
 */
public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int again;
        
        //Do-While for playing again
        do {
            
            //Creating new game
            Game game = new Game();
            
            //Ask if player wants to play again
            int reply = JOptionPane.showConfirmDialog(null, "Game over\nDo you want to play again?", "GAME OVER", JOptionPane.YES_NO_OPTION);
            
            //Process users answer
            if(reply == JOptionPane.YES_OPTION){
                again = 1;
            } else{
                again = 0;
            }
        } while (again == 1);
    }
    
}
