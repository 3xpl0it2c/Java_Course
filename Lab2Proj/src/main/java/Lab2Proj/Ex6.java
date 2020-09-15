/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.Random;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex6 {
    public static boolean isPrime(int x) {
        int limit = x / 2;
        
        for (int i = 2; i < limit; i++) {
            if (x % i == 0) return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int candidate = rnd.nextInt(9001) + 1000;
        
        if (isPrime(candidate)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}
