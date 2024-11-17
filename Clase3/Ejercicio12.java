/* En un día soleado y caluroso Sebastian y Adriana salen en busca de una sandia. Se dirigen a la tienda más cercana y compran la más grande y jugosa.
En casa se disponen a dividir y a comer la fruta pero se les presenta un gran problema y es que Adriana y Sebastian son amantes de los números pares. De manera que quieren dividir la sandía en dos partes no necesariamente iguales pero ambas deben ser pares.
Escriba una función en el que pueda ingresar el peso de la sandía en kilogramos y la respuesta sea:

SI en caso de que se pueda dividir este peso en números pares
NO de lo contrario.
Por ejemplo:

Input : 12
Output : SI */
package Clase3;
import java.util.Scanner;
public class Ejercicio12 {
    
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        
        boolean esPar = verificarNumeroPar(scanner);
        imprimirResultado(esPar);
 
        scanner.close();
    }
    public static boolean verificarNumeroPar(Scanner scanner){
        
        System.out.print("Escriba el peso de la sandía: ");
        int pesoSandia = scanner.nextInt();

        return (pesoSandia % 2 == 0);
    }

    public static void imprimirResultado(boolean par){
        if(par){
            System.out.println("La sandía se puede dividir y su resultado son dos números pares");
        }else{
            System.out.println("La sandía no se puede dividir porque su resultado no son dos números pares");
        }
    }
}
