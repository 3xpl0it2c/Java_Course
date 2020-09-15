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
public class Ex4 {

    public static int[] throwCubes(Random rnd, int limit) {
        
        return rnd
                .ints(0, 6)
                .limit(limit)
                .map(v -> v + 1)
                .toArray();
    }
    
    
    public static boolean isShesBesh(int a, int b) {
        return (a == 5 && b == 6) ^ (a == 6 && b == 5);
    }
    
    public static void main(String[] args) {
        Random rnd = new Random();
        int amountOfCubes = 2;
        int[] cubes = throwCubes(rnd, amountOfCubes);
        int counter = 0;

        while (!( isShesBesh(cubes[0], cubes[1]) )) {
            System.out.format("First Cube: %d\nSecond Cube: %d", cubes[0], cubes[1]);

            counter++;
            cubes = throwCubes(rnd, amountOfCubes);
        }
        
        System.out.println("Shesh-Besh !!");

        System.out.format("It has taken you %d iterations", counter);
    }
}
