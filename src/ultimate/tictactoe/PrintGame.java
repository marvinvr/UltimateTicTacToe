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
class PrintGame {
    
    public void printOut(TTTField f0, TTTField f1, TTTField f2, TTTField f3, TTTField f4, TTTField f5, TTTField f6, TTTField f7, TTTField f8){
        //Print entire Tic-Tac-Toe field
        System.out.println("               |               |              ");
        System.out.println(" " + f0.l1 + " | " + f1.l1 + " | " + f2.l1);
        System.out.println(" " + f0.l2 + " | " + f1.l2 + " | " + f2.l2);
        System.out.println(" " + f0.l3 + " | " + f1.l3 + " | " + f2.l3);
        System.out.println(" " + f0.l4 + " | " + f1.l4 + " | " + f2.l4);
        System.out.println(" " + f0.l5 + " | " + f1.l5 + " | " + f2.l5);
        System.out.println(" " + f0.l6 + " | " + f1.l6 + " | " + f2.l6);
        System.out.println(" " + f0.l7 + " | " + f1.l7 + " | " + f2.l7);
        System.out.println("               |               |              ");
        System.out.println("---------------+---------------+---------------");
        System.out.println("               |               |              ");
        System.out.println(" " + f3.l1 + " | " + f4.l1 + " | " + f5.l1);
        System.out.println(" " + f3.l2 + " | " + f4.l2 + " | " + f5.l2);
        System.out.println(" " + f3.l3 + " | " + f4.l3 + " | " + f5.l3);
        System.out.println(" " + f3.l4 + " | " + f4.l4 + " | " + f5.l4);
        System.out.println(" " + f3.l5 + " | " + f4.l5 + " | " + f5.l5);
        System.out.println(" " + f3.l6 + " | " + f4.l6 + " | " + f5.l6);
        System.out.println(" " + f3.l7 + " | " + f4.l7 + " | " + f5.l7);
        System.out.println("               |               |              ");
        System.out.println("---------------+---------------+---------------");
        System.out.println("               |               |              ");
        System.out.println(" " + f6.l1 + " | " + f7.l1 + " | " + f8.l1);
        System.out.println(" " + f6.l2 + " | " + f7.l2 + " | " + f8.l2);
        System.out.println(" " + f6.l3 + " | " + f7.l3 + " | " + f8.l3);
        System.out.println(" " + f6.l4 + " | " + f7.l4 + " | " + f8.l4);
        System.out.println(" " + f6.l5 + " | " + f7.l5 + " | " + f8.l5);
        System.out.println(" " + f6.l6 + " | " + f7.l6 + " | " + f8.l6);
        System.out.println(" " + f6.l7 + " | " + f7.l7 + " | " + f8.l7);
        System.out.println(" ");
    }
}
