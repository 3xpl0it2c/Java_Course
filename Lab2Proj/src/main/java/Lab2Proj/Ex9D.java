/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;
import java.util.stream.*;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex9D {
    public static void main(String[] args) {
        int size = 5;
        
        IntStream
                .rangeClosed(1, size)
                .mapToObj(Integer::toString)
                .reduce("", (a, b) -> {
                    String result = a+b;
                    System.out.println(result);
                    return result;
                });
    }
}
