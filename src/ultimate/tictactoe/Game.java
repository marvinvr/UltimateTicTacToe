/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarvinvR
 */
public class Game {
    
    //Creating small Tic-Tac-Toe fields

    public TTTField f0 = new TTTField();
    public TTTField f1 = new TTTField();
    public TTTField f2 = new TTTField();

    public TTTField f3 = new TTTField();
    public TTTField f4 = new TTTField();
    public TTTField f5 = new TTTField();

    public TTTField f6 = new TTTField();
    public TTTField f7 = new TTTField();
    public TTTField f8 = new TTTField();

    //Creating master Tic-Tac-Toe field
    
    public TTTField master = new TTTField();
    
    //Creating input Objects with Strategy pattern
    InputSelectField selectField = new InputSelectField();
    InputSetPos setPos = new InputSetPos();

    //Creating main variables
    String fieldNumbers = "\n 0 | 1 | 2\n 3 | 4 | 5\n 6 | 7 | 8";
    private List<TTTField> fields = new ArrayList<TTTField>();
    int winner = 0;
    int validInput = 0;
    int lastField = 10;
    int fieldInt = 0;
    int askAgain = 0;
    int currPlayer = 1;

    //Creating view
    PrintGame pg = new PrintGame();

    public Game() {
        //Arraylist with every Tic-Tac-Toe field
        fields.add(f0);
        fields.add(f1);
        fields.add(f2);

        fields.add(f3);
        fields.add(f4);
        fields.add(f5);

        fields.add(f6);
        fields.add(f7);
        fields.add(f8);
        fields.add(master);
        
        //Starting the main game
        startGame();

    }

    public void startGame() {
        //Output of field
        print();
        
       //Do-While for checking if game is done
        do {
            
            //Do-While if input has to get asked again
            do {
                
                //Checking if player can choose where to play
                if (lastField == 10 || getField(lastField).getWinner() != 0) {
                    fieldInt = selectField.askInput(lastField, this, currPlayer);
                } else {
                    fieldInt = setPos.askInput(lastField, this, currPlayer);
                }
            } while (askAgain == 1);
            
            //Setting field where user played
            getField(lastField).setField(fieldInt, currPlayer);
            
            //Setting last field
            lastField = fieldInt;
            
            //Switching player at end of round
            if (currPlayer == 1) {
                currPlayer = 2;
            } else {
                currPlayer = 1;
            }
            
            //Ending round
            endRound();
        } while (master.getWinner() == 0);
        
        //Output of winner
        if (master.getWinner() == 1) {
            System.out.println("\u001B[31mx\u001B[0m won!");
        } else if (master.getWinner() == 2) {
            System.out.println("\u001B[32mo\u001B[0m won!");
        } else {
            System.out.println("It's a tie.");
        }
    }

    public void endRound() {
        int i = 0;
        
        //For-Each for every field
        for (TTTField f : fields) {
            f.checkWinner();
            
            //Setting winner in master field
            if (i < 9) {
                master.setField(i, f.getWinner());
                i++;
            }
        }
        
        //Clearing the console
        for (int j = 0; j < 10; j++) {
         System.out.println(" ");
        }

        //Output of field
        print();
    }

    public String getPlayerString(int p) {
        
        //Returning player name with color
        switch (p) {
            case 1:
                return "<html><font color=#FF0000>x</font>";
            case 2:
                return "<html><font color=#00FF00>o</font>";
            default:
                return "Error";

        }
    }
    
    public TTTField getField(int f) {
        //Returning field object
        switch (f) {
            case 0:
                return f0;
            case 1:
                return f1;
            case 2:
                return f2;
            case 3:
                return f3;
            case 4:
                return f4;
            case 5:
                return f5;
            case 6:
                return f6;
            case 7:
                return f7;
            case 8:
                return f8;
            default:
                return master;

        }
    }

    public void print() {
        //Checking for winner in every field
        for (TTTField f : fields) {
            f.checkGame();
        }
        
        //Printing game
        pg.printOut(f0, f1, f2, f3, f4, f5, f6, f7, f8);
    }
}
