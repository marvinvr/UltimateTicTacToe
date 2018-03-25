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
public class InputSelectField implements Input {

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
                String fieldString = JOptionPane.showInputDialog(null, game.getPlayerString(player) + "'s turn. \nChoose the field you want to play in." + fieldNumbers);
                
                //Exit if player hits cancel
                if (fieldString == null) {
                    System.exit(0);
                }
                
                //converting input to int
                fieldInt = Integer.parseInt(fieldString);
                
                //Check if input is valid
                if (validateField(fieldInt, 0, game)) {
                    validInput = 1;
                    game.lastField = fieldInt;
                    game.askAgain = 1;
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
        if (currentTTT.getWinner() == 0) {
            return true;
        } else {
            return false;
        }
    }

}
