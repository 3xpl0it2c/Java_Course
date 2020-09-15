/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.stream.IntStream;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex9G {
        static void printTimes(int x, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(x);
        }
    }
    
    static void printTimesln(int x, int times) {
        printTimes(x, times);
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 5;

        IntStream
                .rangeClosed(-size, 0)
                .map(Math::abs)
                .filter(i -> i != 0)
                .forEach(i -> printTimesln(i, i));
    }
}
