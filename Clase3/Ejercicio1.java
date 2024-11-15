package Clase3;

import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("\n----PROGRAMA PARA VALIDAR SI UN NÚMERO ES POSITIVO, NEGATIVO O CERO----\n");
        System.out.print("Ingrese el número que desea validar: ");
        int numero = entrada.nextInt();

        if(numero>0){
            System.out.println("El número es positivo");
        }else if(numero < 0){
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es es cero");
        }

        entrada.close();
    }

}