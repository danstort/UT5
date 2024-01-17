/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej1H2;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Main {

    public static void main(String[] args) {
        
       Scanner tec = new Scanner (System.in);
       Perro p = new Perro();
       p.setColor(tec.nextLine().charAt(0));
       p.setEdad(tec.nextInt());
       
        System.out.print(p.toString());
       
        
    }
    
}
