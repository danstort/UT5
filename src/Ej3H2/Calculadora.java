/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej3H2;

/**
 *
 * @author danielsotoortiz
 */
class Calculadora {
    
    private double operador1;
    private double operador2;
    
    public double suma (){
    
    double a=operador1;
    double b=operador2;
    double c =a+b;
    return c;
    
    }
    
    public double resta (){
    
    double a=operador1;
    double b=operador2;
    double c =a-b;
    return c;
    
    }
    
    public double multiplicacion (){
    
    double a=operador1;
    double b=operador2;
    double c =a*b;
    return c;
    
    }
    
    public double division (){
    
    double a=operador1;
    double b=operador2;
    double c =a/b;
    return c;
    
    }

    public Calculadora() {
    }

    public double getOperador1() {
        return operador1;
    }

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public double getOperador2() {
        return operador2;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }
    
    


    
}
