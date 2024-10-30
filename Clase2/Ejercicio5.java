public class Ejercicio5 {
    public static void main(String[] args){
        float valorOrdenador = 660f;
        float descuento = 0.10f;

        //Calcular el precio con descuento
        float valorDescuento = valorOrdenador * descuento;
        float valorConDescuentoOrdenador = valorOrdenador - valorDescuento;

        System.out.printf("El valor del ordenador sin descuento es: %.2f%n", valorOrdenador);
        System.out.printf("El valor del decuento aplicado (10%%) es: %.2f%n", valorDescuento);
        System.out.printf("El valor del total del ordenador con el descuento aplicado es: %5.2f%n", valorConDescuentoOrdenador);
    }
}
