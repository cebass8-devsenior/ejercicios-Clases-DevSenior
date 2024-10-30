public class Prueba {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;

        a += 3;
        b *= 2;

        a++;
        b--;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
        System.out.println("a después de += 3: " + a);
        System.out.println("b después de *= 2: " + b);
        System.out.println("a después de ++: " + a);
        System.out.println("b después de --: " + b);
    }
}
