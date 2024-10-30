public class Ejercicio6 {
    public static void main(String[] args) {
        double valorPantalonConDescuento = 34;
        double valorDescuento = 0.15;

        //Calcular valor del pantalon
        double descuento = valorPantalonConDescuento*valorDescuento;
        double valorPantalonSinDescuento = valorPantalonConDescuento+descuento;

        System.out.printf("El valor del pantalón antes de aplicar el descuento es: %.2f%n", valorPantalonSinDescuento);
    }
}
