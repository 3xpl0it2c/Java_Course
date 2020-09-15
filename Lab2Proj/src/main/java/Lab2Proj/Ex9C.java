/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;
;
import java.util.stream.*;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex9C {   
    static void printTimes(char c, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(c);
        }
    }
    
    static void printTimesln(char c, int times) {
        printTimes(c, times);
        System.out.println();
    }
    
    public static void main(String[] args) {
        char toPrint = '*';
        int size = 5;

        IntStream
                .rangeClosed(-size, size)
                .map(Math::abs)
                .filter(i -> i != 0)
                .forEach(i -> printTimesln(toPrint, i));
    }
}
