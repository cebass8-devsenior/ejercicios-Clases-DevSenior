package Clase3;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        //Escriba un programa que le permita ingresar tres números e imprima en la consola el más grande de ellos.
        Scanner entrada = new Scanner(System.in);
        
        

        System.out.print("\n--PROGRAMA PARA VALIDAR EL VALOR MAYOR ENTRE TRES NÚMEROS--\n");
        System.out.print("Ingrese el primer número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = entrada.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numero3 = entrada.nextInt();

        boolean caso1 = (numero1 > numero2 && numero1 > numero3);
        boolean caso2 = (numero2 > numero1 && numero2 > numero3);

        if(caso1){
            System.out.printf("El número 1:1 %d es mayor que los números 2: %d y que el número 3: %d",numero1, numero2, numero3);
        }else if(caso2){
            System.out.printf("El número 2: %d es mayor que los números 1: %d y que el número 3: %d",numero2, numero1, numero3);
        }else{
            System.out.printf("El número 3: %d es mayor que los números3 1: %d y que el número 2: %d",numero3, numero1, numero2);
        }
        
        entrada.close();
    }
}
