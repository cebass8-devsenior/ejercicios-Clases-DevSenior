package Clase3;
import java.util.Scanner;
public class Ejercicio9 {
    //Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo a la cantidad de unidades que le compren. La siguiente tabla muestra la información:
    //Escriba un programa que dado un número de camisas retorne el precio por unidad.
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("\n---PROGRAMA PARA LA VENTA DE CAMISAS\n---");
        System.out.print("Ingrese el número de camisas que desea comprar: ");
        int camisas = entrada.nextInt();
        double precio = 0;
        double valorCamisas = 0;
        boolean error = false;

        if(camisas >=1 && camisas <= 50){
            precio = camisas * 50000;
            valorCamisas = 50000;
        }else if(camisas >=51 && camisas <=100){
            precio = camisas * 45000;
            valorCamisas = 45000;
        }else if(camisas >=101 && camisas <=150){
            precio = camisas * 40000;
            valorCamisas = 40000;
        }else if(camisas >=151 && camisas <=200){
            precio = camisas * 35000;
            valorCamisas = 35000;
        }else if(camisas >=201){
            precio = camisas * 25000;
            valorCamisas = 25000;
        }else{
                error = true;
        }

        if(error){
            System.out.printf("El valor ingresado (%d) es inválido, intente nuevamente",camisas);
        }else{
            System.out.printf("El valor por camisa es de $%,.0f, el valor total para (%d) camisas es: $%,.0f",valorCamisas, camisas, precio);
        }
        entrada.close();
    }
}
