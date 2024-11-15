package Clase3;

import java.util.Scanner;

public class Ejercicio7 {
    //Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y compruebe si con estos números se puede formar un triángulo.
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---PROGRAMA PARA VALIDAR SI LA LONGITUD INGRESADA MEDIANTE TRES NÚMEROS PUEDEN FORMAR UN TRIÁNGULO---\n");
        System.out.print("Ingrese el primer número: ");
        float a = entrada.nextFloat();
        System.out.print("Ingrese el segundo número: ");
        float b = entrada.nextFloat();
        System.out.print("Ingrese el tercer número: ");
        float c = entrada.nextFloat();


        if(a + b > c && a + c > b && b + c > a){
            System.out.printf("Los números ingresados A = (%.2f) - B = (%.2f) - C = (%.2f) SI pueden formar un triangulo",a , b, c);
        }else{
            System.out.printf("Los números ingresados A = (%.2f) - B = (%.2f) - C = (%.2f) NO pueden formar un triangulo",a , b, c);
        }
        entrada.close();
    }
}
