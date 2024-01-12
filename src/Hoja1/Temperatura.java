/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja1;

/**
 *
 * @author danielsotoortiz
 */
public class Temperatura {

    double celsiusToFarenheit(double C) {

        double F = (1.8) * C + 32;
        return F;

    }

    double farenheitToCelsius(double F) {

        double C = (F - 32) / 1.8;
        return C;

    }

    public Temperatura() {
    }

}
