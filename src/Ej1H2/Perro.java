/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej1H2;

/**
 *
 * @author danielsotoortiz
 */
public class Perro {

    char color;
    int edad;
    String cS;

    public Perro() {
    }

    public void setColor(char color) {
        this.color = color;
        switch (color) {
            case 'b' | 'B':
                cS = "Blanco";
                break;

            case 'n' | 'N':
                cS = "Negro";
                break;

            default:
                cS = "Color no establecido";
                ;
        }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Perro{color="+cS+ ", edad="+edad+"}";

    }

    

}
