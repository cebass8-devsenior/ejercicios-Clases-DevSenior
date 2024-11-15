package Clase3;

import java.util.Scanner;

public class Ejercicio3 {
    //Escriba un programa que permita ingresar un número e identificar si es par o impar.
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---PROGRAMA PARA VALIDAD SI UN NÚMERO ES PAR O IMPAR---\n");
        System.out.print("Ingrese el número: ");
        int numero = entrada.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "impar";

        System.out.printf("El número ingresado (%d) es un número (%s)", numero, resultado);
        entrada.close();
    }
}
