/* Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
Por ejemplo:
Input : 1 2
Output : 3
El tercer hermano es el el que llegara a la reunión tarde. */
package Clase3;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        hermanoTarde(scanner);
        scanner.close();
    }

    public static void hermanoTarde(Scanner scanner){
        System.out.print("\n---PROGRAMA PARA LA VERIFICACIÓN DE ASISTENCIA A LA REUNIÓN DE HERMANOS---\n\n");
        System.out.print("Primer hermano que llegó a la reunón, digite: 1(hermano mayor), 2(hermano del medio), 3(hermano menor): ");
        int hermano1 = scanner.nextInt();
        System.out.print("Segundo hermano que llegó a la reunón, digite: 1(hermano mayor), 2(hermano del medio), 3(hermano menor): ");
        int hermano2 = scanner.nextInt();
        
        if(hermano1 == hermano2){
            System.err.println("Error no debes digitar opciones iguales");
        }else{
            if((hermano1 == 1 || hermano1 == 2) && (hermano2 == 1 || hermano2 == 2)){
                System.out.println("El hermano menor llegó tarde a la reunión");
            }else if((hermano1 == 2 || hermano1 == 3) && (hermano2 == 2 || hermano2 == 3)){
                System.out.println("El hermano mayor llegó tarde a la reunión");
            }else{
                System.out.println("El hermano del medio llegó tarde a la reunión");
            }
        }                
    }
}
