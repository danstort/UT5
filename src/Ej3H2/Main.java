/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej3H2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Calculadora c1 = new Calculadora();
        try {
            c1.setOperador1(tec.nextDouble());
            c1.setOperador2(tec.nextDouble());
            tec.nextLine();

            char op = tec.nextLine().charAt(0);

            switch (op) {
                case '+':

                    System.out.printf("Resultado %.2f\n", c1.suma());

                    break;

                case '-':

                    System.out.printf("Resultado %.2f\n", c1.resta());

                    break;

                case 'x':

                    System.out.printf("Resultado %.2f\n", c1.multiplicacion());

                    break;

                case ':':

                    System.out.printf("Resultado %.2f\n", c1.division());

                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Dato introducido erróneo");
            double resultado = 0;
            System.out.printf("Resultado: %.2f\n", resultado);

        }

    }

}
