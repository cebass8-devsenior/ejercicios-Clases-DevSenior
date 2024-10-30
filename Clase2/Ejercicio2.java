public class Ejercicio2 {
    public static void main(String[] args){
        String pernil = "Pernil Iberic D'Engreix Llen. Azuaga";
        float valorPorcion = 5.95f;
        int porcion = 100;
        int kilo = 1000;

        System.out.println("El valor de 1 kilo de " + pernil + " es: " + (kilo/porcion)*valorPorcion + " euros");
        //El valor de 1 kilo de Pernil Iberic D'Engreix Llen. Azuaga es: 59.5 euros

    }
}
