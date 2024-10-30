package Clase1;
import java.util.Scanner;

public class EntradaySalidaDeDatos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite sus nombres: ");
        String nombres = entrada.nextLine();
        System.out.print("Digite su primer apellido: ");
        String Papellido = entrada.nextLine();
        System.out.print("Digite su segundo apellido: ");
        String Sapellido = entrada.nextLine();

        System.out.printf("%s %s %s",nombres,Papellido,Sapellido);
        entrada.close();
    }
}