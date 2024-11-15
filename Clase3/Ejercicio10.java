package Clase3;
import java.util.Scanner;
public class Ejercicio10 {
    //Escriba una función en la que ingrese un número entero entre 1 y 12. Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). El resultado debe ser el número de días del mes ingresado.
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---PROGRAMA PARA VALIDAR LOS DÍAS QUE TIENE UN MES---\n");
        System.out.print("Ingrese el número del mes: ");
        int mesIngresado = entrada.nextInt();
        String mes = "";
        int dias = 0;
        boolean error = false;
        
        if(mesIngresado == 1){
            mes = "Enero";
            dias = 31;
        }else if(mesIngresado == 2){
            mes = "Febrero";
            dias = 28;
        }else if(mesIngresado == 3){
            mes = "Marzo";
            dias = 31;
        }else if(mesIngresado == 4){
            mes = "Abril";
            dias = 30;
        }else if(mesIngresado == 5){
            mes = "Mayo";
            dias = 31;
        }else if(mesIngresado == 6){
            mes = "Junio";
            dias = 30;
        }else if(mesIngresado == 7){
            mes = "Julio";
            dias = 31;
        }else if(mesIngresado == 8){
            mes = "Agosto";
            dias = 31;
        }else if(mesIngresado == 9){
            mes = "Septiembre";
            dias = 30;
        }else if(mesIngresado == 10){
            mes = "Octubre";
            dias = 31;
        }else if(mesIngresado == 11){
            mes = "Noviembre";
            dias = 30;
        }else if(mesIngresado == 12){
            mes = "Diciembre";
            dias = 31;
        }else{
            error = true;
        }
        
        if(error){
            System.out.printf("El número ingresado (%d) no corresponde a un mes del año, intente nuevamente", mesIngresado);
        }else{
            System.out.printf("El mes %d (%s) tiene %d días", mesIngresado, mes, dias);
        }

        entrada.close();
    }
}
