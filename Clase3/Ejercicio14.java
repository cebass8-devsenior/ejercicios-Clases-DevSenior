//Realice un programa en el que ingrese un número y muestre el cubo. Repita el proceso hasta que se introduzca un valor negativo.
package Clase3;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        numeroCubo(scanner);
        scanner.close();
    }
    public static void numeroCubo(Scanner scanner){
        int numero;
        do{
        System.out.println("\n\n---PROGRAMA PARA ELEVAR UN NÚMERO AL CUBO---\n");
        System.out.print("Ingrese el número que desea elevar al cubo: ");
        numero = scanner.nextInt();
        
        if(numero>=0){
            var numeroCubo = (numero*numero*numero);
            System.out.printf("El numero (%,d) elevado al cubo es igual a: %,d ", numero, numeroCubo);
        }
        }while(numero>0);
        System.out.println("Salió del sistema");
    }

}
