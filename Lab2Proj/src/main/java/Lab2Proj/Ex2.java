/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;
import java.util.Random;
import java.util.stream.*;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int limit = 10;
        
        long x = rnd
                .ints(100, 1000)
                .limit(limit)
                .filter(v -> v % 2 != 0)
                .count();

        String output = String.format("The amount of randomly generated odd numbers is: %d", x);
        
        System.out.println(output);
    }
}
