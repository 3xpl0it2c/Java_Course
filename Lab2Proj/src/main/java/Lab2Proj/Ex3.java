/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex3 {
    
    // ! Problematic - big integers might overflow the call stack.
    public static int factorial(int x) {
        if (x <= 1) return 1;
        
        return x + factorial(x - 1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a number: \n");
        Stream.of(in.nextInt())
                .forEach(num -> {
                    System.out.format(
                            "The factorial of %d is: %d", 
                            num, 
                            factorial(num));
                        }
                );
        
    }
}
