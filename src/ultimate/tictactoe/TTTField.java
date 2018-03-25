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
public class TTTField {
    
    //Creating main variables
    public String l1, l2, l3, l4, l5, l6, l7;
    
    private int[] status = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int winner = 0;

    public int getWinner() {
        return winner;
    }
    
    //Setting a field
    public void setField(int pos, int player){
        status[pos] = player;
    }

    //getting status of single position
    public int getStatus(int pos) {
        return status[pos];
    }
    public void checkGame(){
        
        //Setting lines depending on situation of field
        if(winner == 1){
            l1 = "\u001B[31m \\ \\     / / \u001B[0m";
            l2 = "\u001B[31m  \\ \\   / /  \u001B[0m";
            l3 = "\u001B[31m   \\ \\-/ /   \u001B[0m";
            l4 = "\u001B[31m    |   |    \u001B[0m";
            l5 = "\u001B[31m   / /-\\ \\   \u001B[0m";
            l6 = "\u001B[31m  / /   \\ \\  \u001B[0m";
            l7 = "\u001B[31m / /     \\ \\ \u001B[0m";
        } else if(winner == 2){
            l1 = "\u001B[32m    /---\\    \u001B[0m";
            l2 = "\u001B[32m   /     \\   \u001B[0m";
            l3 = "\u001B[32m  / /---\\ \\  \u001B[0m";
            l4 = "\u001B[32m  | |   | |  \u001B[0m";
            l5 = "\u001B[32m  \\ \\---/ /  \u001B[0m";
            l6 = "\u001B[32m   \\     /   \u001B[0m";
            l7 = "\u001B[32m    \\---/    \u001B[0m";
            
        } else {
        l1 = "    |   |    ";
        l2 = "  " + checkStatus(0) + " | "+checkStatus(1)+" | "+checkStatus(2)+"  ";
        l3 = "----+---+----";
        l4 = "  " + checkStatus(3) + " | "+checkStatus(4)+" | "+checkStatus(5)+"  ";
        l5 = "----+---+----";
        l6 = "  " + checkStatus(6) + " | "+checkStatus(7)+" | "+checkStatus(8)+"  ";
        l7 = "    |   |    ";
            
        }
    }
    
    //Checking status of field
    private String checkStatus(int pos){
        int number = status[pos];
        switch(number){
            case 1: 
                return "\u001B[31mx\u001B[0m";
            case 2:
                return "\u001B[32mo\u001B[0m";
            default:
                return " ";
                
    }
    }
    
    //Checking if soemone won
    public void checkWinner(){
        if(status[0] == 1 && status[1] == 1 && status[2] == 1 ||
           status[3] == 1 && status[4] == 1 && status[5] == 1 ||
           status[6] == 1 && status[7] == 1 && status[8] == 1 ||
                
           status[0] == 1 && status[3] == 1 && status[6] == 1 ||
           status[1] == 1 && status[4] == 1 && status[7] == 1 ||
           status[2] == 1 && status[5] == 1 && status[8] == 1 ||
           
           status[0] == 1 && status[4] == 1 && status[8] == 1 ||
           status[2] == 1 && status[4] == 1 && status[6] == 1)
        {
        winner = 1;    
        } else if(status[0] == 2 && status[1] == 2 && status[2] == 2 ||
           status[3] == 2 && status[4] == 2 && status[5] == 2 ||
           status[6] == 2 && status[7] == 2 && status[8] == 2 ||
                
           status[0] == 2 && status[3] == 2 && status[6] == 2 ||
           status[1] == 2 && status[4] == 2 && status[7] == 2 ||
           status[2] == 2 && status[5] == 2 && status[8] == 2 ||
           
           status[0] == 2 && status[4] == 2 && status[8] == 2 ||
           status[2] == 2 && status[4] == 2 && status[6] == 2)
        {
        winner = 2;    
        } else if (status[0] != 0 && status[1] != 0 && status[2] != 0 && 
                   status[3] != 0 && status[4] != 0 && status[5] != 0 && 
                   status[6] != 0 && status[7] != 0 && status[8] != 0)
        {
            winner = 3;
        }
    }
}
