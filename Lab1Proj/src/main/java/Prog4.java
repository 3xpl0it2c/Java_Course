/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */

import java.util.stream.*;
import java.util.Arrays;

public class Prog4 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3};
        
        Arrays
            .stream(numbers)
            .sorted()
            .forEach(System.out::println);
    }
}
