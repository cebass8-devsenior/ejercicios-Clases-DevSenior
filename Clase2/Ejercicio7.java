import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer número: ");
        double numero1 = entrada.nextDouble();
        
        System.out.print("Digite el segundo número: ");
        double numero2 = entrada.nextDouble();

        //operaciones;
        var suma = numero1 + numero2;
        var resta = numero1 - numero2;
        var multiplicacion = numero1 * numero2;
        var division = numero1 / numero2;

        //Salida de datos
        System.out.printf("El resultado de la suma es: %.2f%nEl resultado de la resta es: %.2f%nEl resultado de la multiplicación es: %.2f%nEl resultado de la división es: %.2f%n", suma, resta, multiplicacion, division);
        entrada.close();
    }
}
