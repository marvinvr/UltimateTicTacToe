/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.tictactoe;

/**
 *
 * @author MarvinvR
 */
public interface Input {
    
    //Input interface
    public int askInput(int lastField, Game game, int player);

    public boolean validateField(int current, int last, Game game);

}
