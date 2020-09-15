/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2Proj;

/**
 *
 * @author "Nadav Raz <3xpl0it2c@gmail.com>"
 */
public class Ex8 {
    public static void main(String[] args) {
     int limit = 10;
     
     for (int i = 1; i <= limit; i++) {
         for (int j = 1; j <= limit; j++) {
             System.out.format("%d\t", i * j);
         }
         
         System.out.println();
     }
    }
}
