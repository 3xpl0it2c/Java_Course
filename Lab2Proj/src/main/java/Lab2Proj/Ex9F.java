/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

import java.util.stream.*;
import java.util.ArrayList;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex9F {

    public static void main(String[] args) {
        int size = 5;

        String x = IntStream
                .rangeClosed(1, size)
                .mapToObj(Integer::toString)
                .reduce("", (a, b) -> a+b);
        
        
        for (int i = x.length(); i > 0; i--) {
            IntStream
                    .range(0, i)
                    .mapToObj(j -> x.charAt(j))
                    .forEach(System.out::print);

            System.out.println();
        }
    }
}
