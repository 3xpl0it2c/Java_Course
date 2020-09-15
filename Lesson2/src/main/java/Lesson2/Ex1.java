/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void printBigger(int x, int y) {
        if (x > y) {
            System.out.println(x);
            System.out.println(y);
        } else {
            System.out.println(x);
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
        int x1 = 7;
        int x2 = 10;
        int x3 = -5;
        
        if (x2 > x1) {
            // x2 > x1 > x3
            if (x1 > x3) {
                System.out.println(x2);
                printBigger(x1, x3);
            }
            
            // x2 > x3 > x1
            else {
                printBigger(x2, x3);
                System.out.println(x1);
            }
        } else {
            // x1 > x2 => x1
        }
    }
    
}
