package Clase3;

import java.util.Scanner;

public class Ejercicio11{
    /* Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
    Input : 3 , 100 , 1
    Output : 13100 */
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        int[] numeros = ingresarNumeros(scanner);
        imprimirNumeros(numeros[0],numeros[1],numeros[2]);

        scanner.close();
    }
    
    public static int[] ingresarNumeros(Scanner scanner){
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingrese el Tercer número: ");
        int numero3 = scanner.nextInt();
        return new int[] {numero1,numero2,numero3};
    }

    public static void imprimirNumeros(int numero1, int numero2, int numero3){
        if(numero1<=numero2 && numero1<=numero3){
            if(numero2<=numero3){
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero1, numero2, numero3);
            }else{
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero1, numero3, numero2);
            }
        }else if(numero2<=numero1 && numero2<=numero3){
            if(numero1<=numero3){
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero2, numero1, numero3);
            }else{
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero2, numero3, numero1);
            }
        }else if(numero3<=numero1 && numero3<=numero2){
            if(numero1<=numero2){
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero3, numero1, numero2);
            }else{
                System.out.printf("El orden es Numero 1: %d - Numero 2: %d - Numero 3: %d",numero3, numero2, numero1);
            }
        }
    }
}