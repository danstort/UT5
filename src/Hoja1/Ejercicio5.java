/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        double a = tec.nextDouble();
        Temperatura temp = new Temperatura();

        System.out.println(temp.celsiusToFarenheit(a));
    }
}
