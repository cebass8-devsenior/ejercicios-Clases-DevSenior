import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la temperatura en grados celsius: ");
        float gradosCelsius = entrada.nextFloat();

        //Conversión de grados celsius a Farenheit y Kelvin
        float farenheit = gradosCelsius * 9/5 +(32);
        float kelvin = gradosCelsius + 273.15f;

        System.out.printf("%.2f grados Celsius equivalen a %.2f grados Farenheit %n",gradosCelsius,farenheit);
        System.out.printf("%.2f grados Celsius equivalen a %.2f grados Kelvin %n",gradosCelsius,kelvin);
        entrada.close();
    }
}
