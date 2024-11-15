package Clase3;
import java.util.Scanner;
public class Ejercicio5 {
    //Escriba un programa que permita ingresar un número y determine si es divisible por dos y siete.
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n---SISTEMA PARA VERIFICAR SI UN NÚMERO ES DIVISIBLE ENTRE 2 Y 7---\n");
        System.out.print("Ingrese el número que desea verificar: ");
        int numero = entrada.nextInt();

        if(numero % 2 == 0 && numero % 7 == 0){
            System.out.printf("El número ingresado (%d) es divisible entre los números 2 y 7", numero);
        }else{
            System.out.printf("El número ingresado (%d) no es divisible entre los números 2 y 7", numero);
        }
        entrada.close();
    }
}
