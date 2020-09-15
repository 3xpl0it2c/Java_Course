/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.stream.*;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex5 {
    public static void forLoopSolution(int limit, char toPrint) {

        for (int i = 0; i < limit; i++) {
            System.out.print(toPrint);
        }
    }
    
    public static void whileLoopSolution(int limit, char toPrint) {
        int i = 0;
        
        while (i < limit) {
            System.out.print(toPrint);
            i++;
        }
    }
    
    public static void main(String[] args) {
        int limit = 50;
        char toPrint = '*';
        
        System.out.println("For Loop Solution:");
        forLoopSolution(limit, toPrint);
        
        System.out.println();
        
        System.out.println("While loop Solution:");
        whileLoopSolution(limit, toPrint);
    }
}
