package Clase3;
import java.util.Scanner;
public class Ejercicio4 {
    //Escriba un programa que permita ingresar una letra e identifique si la letra es mayúscula o minúscula.
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("\n---SISTEMA PARA VERIFICAR SI UNA LETRA ES MAYÚSCULA---\n");
        System.out.print("Ingrese una letra: ");
        char letra = entrada.next().charAt(0);

        if(Character.isUpperCase(letra)){
            System.out.printf("La letra ingresada %c es una letra mayúscula", letra);
        }else if(Character.isLowerCase(letra)){
            System.out.printf("La letra ingresada (%c) es una letra minúscula", letra);
        }else{
            System.out.println("El caracter ingresado no es una letra");
        }
        entrada.close();

    }
}
