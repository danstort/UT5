/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej2H2;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Main {

    public static void main(String[] args) {

        int nCuentas;
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce el número de cuentas a crear");
        nCuentas = tec.nextInt();
        tec.nextLine();

        
        for (int i = 0; i < nCuentas; i++) {
            
            Cuenta c1 = new Cuenta();
            System.out.println("Cliente número " + (i + 1));
            System.out.println("Introduce nombre del titular de la cuenta");
            c1.setNombre(tec.nextLine());
            System.out.println("Introduce ccc");
            c1.setCuenta(tec.nextInt());
            System.out.println("Introduce saldo inicial");
            c1.setSaldo(tec.nextInt());
            System.out.println("Introduce tipo de interes");
            c1.setTipoInteres(tec.nextDouble());
            tec.nextLine();

        }

        System.out.println("Numero de cuentas creadas es " +Cuenta.cont);

    }

}
