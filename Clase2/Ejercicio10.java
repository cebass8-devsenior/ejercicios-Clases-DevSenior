import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int cantidadNumeros = 0;

        System.out.print("---PROGRAMA PARA CALCULAR EL PROMEDIO DE TRES NÚMEROS---\n\n");
        System.out.print("Digite el primer número: ");
        int numero1 = entrada.nextInt();
        cantidadNumeros++;
        System.out.print("Digite el segundo número: ");
        int numero2 = entrada.nextInt();
        cantidadNumeros++;
        System.out.print("Digite el tercer número: ");
        int numero3 = entrada.nextInt();
        cantidadNumeros++;

        //Calcular el promedio
        int promedio = (numero1+numero2+numero3)/cantidadNumeros;

        //Salida de datos
        System.out.printf("El promedio de los %d números ingresados es: %d",cantidadNumeros,promedio);

        entrada.close();
    }
}
        


