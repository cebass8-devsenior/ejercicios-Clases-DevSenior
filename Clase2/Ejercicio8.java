import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("PROGRAMA PARA CALCULAR EL ÁREA Y PERÍMETRO DE UN RECTANGULO \n");
        System.out.print("Digite la base del rectángulo en centímetros: ");
        float baseRectangulo = entrada.nextFloat();
        System.out.print("Ahora digite la altura del rectángulo en centímetros: ");
        float alturaRectangulo = entrada.nextFloat();

        //calcular área y perímetro
        float area = baseRectangulo*alturaRectangulo;
        float perimetro = 2 * (baseRectangulo + alturaRectangulo);

        System.out.printf("El área del rectángulo es: %.2f centímetros %n", area);
        System.out.printf("El perímetro del rectángulo es: %.2f centímetros %n", perimetro);
        
        entrada.close();
    }
}
