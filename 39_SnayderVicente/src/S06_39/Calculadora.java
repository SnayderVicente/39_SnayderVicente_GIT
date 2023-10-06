/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S06_39;

/**
 *
 * @author Lenovo
 */
public class Calculadora {

    // Atributos
    private double resultado;

    public Calculadora() {
        resultado = 0;
    }

    // Métodos

    public void sumar(double num1, double num2) {
        resultado = num1 + num2;
    }

    public void sumar(double num1, double num2, double num3) {
        resultado = num1 + num2 + num3;
    }

    public void restar(double num1, double num2) {
        resultado = num1 - num2;
    }
    
    public void multiplicar(double num1, double num2) {
        resultado = num1 * num2;
    }

    public void dividir(double num1, double num2) {
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            System.out.println("Error: División por cero.");
        }
    }

    // Obtener el resultado actual
    public double obtenerResultado() {
        return resultado;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.sumar(5, 3);
        System.out.println("Resultado de la suma: " + calculadora.obtenerResultado());

        calculadora.multiplicar(4, 2);
        System.out.println("Resultado de la multiplicación: " + calculadora.obtenerResultado());

        calculadora.dividir(8, 0);
        System.out.println("Resultado de la división: " + calculadora.obtenerResultado());
    }
}


