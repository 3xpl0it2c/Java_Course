/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.*;
/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex7 {
    
    static int hint(int x, Random rnd) {
        int amount = rnd.nextInt(20)+1;
        
        return x - amount;
    }
    
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        final Random rnd = new Random();
        final int hintLimit = 3;

        int x = Math.abs(rnd.nextInt());
        int counter = 0;
                
        do {
            if (counter > hintLimit) {
                int hint = hint(x, rnd);
                System.out.format("Try something like: %d\n", hint);
            }
            
            System.out.println("Please enter a number:");
            counter++;
        } while(input.nextInt() != x);
        
        System.out.format("It had taken you %d tries.", counter);
    }
}
