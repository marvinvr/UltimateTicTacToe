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
public class InputSetPos implements Input {

    @Override
    public int askInput(int lastField, Game game, int player) {

        //Create variables
        String fieldNumbers = "\n 0 | 1 | 2\n 3 | 4 | 5\n 6 | 7 | 8";
        int validInput = 0;
        int fieldInt = 0;
        
        //Do-While for ensureing valid input
        do {
            try {
                
                //Ask for input
                String fieldString = JOptionPane.showInputDialog(null, game.getPlayerString(player) + "'s turn. \nChoose a position. You have to play in field number " + lastField + fieldNumbers);
                
                //Exit if player hits cancel
                if (fieldString == null) {
                    System.exit(0);
                }
                
                //converting input to int
                fieldInt = Integer.parseInt(fieldString);
                
                //Check if input is valid
                if (validateField(fieldInt, lastField, game)) {
                    validInput = 1;
                    game.askAgain = 0;
                } else {
                    validInput = 0;
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("Please enter a valid number.");
                    System.out.println(" ");
                    game.print();
                }

            } catch (Exception e) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Please enter a valid number.");
                System.out.println(" ");
                game.print();
                validInput = 0;
            }

        } while (validInput == 0);
        return fieldInt;

    }

    @Override
    public boolean validateField(int current, int last, Game game) {
        //Validation function
        TTTField currentTTT = game.getField(current);
        TTTField lastTTT = game.getField(last);
        if (currentTTT.getWinner() == 0 && lastTTT.getStatus(current) == 0) {
            return true;
        } else if (currentTTT.getWinner() != 0) {
            return true;
        } else {
            return false;
        }
    }

}
