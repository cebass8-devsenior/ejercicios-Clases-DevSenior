package Clase3;

import java.util.Scanner;

public class Ejercicio8 {
    //Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla.
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---PROGRAMA PARA VERIFICAR EL RANGO DE EDAD---\n");
        System.out.print("Ingresa una edad: ");
        int edad = entrada.nextInt();
        int grupo = 0;

        if(edad >= 0 && edad <= 5){
            grupo = 1;     
        }else if(edad >=6 && edad <= 11){
            grupo = 2;
        }else if(edad >=12 && edad <= 18){
            grupo = 3;
        }else if(edad >=19 && edad <= 26){
            grupo = 4;
        }else if(edad >=27 && edad <= 59){
            grupo = 5;
        }else if(edad >=60 && edad <= 110){
            grupo = 6;
        }else{
            grupo = 7;
        }

        String rangoEdad = switch (grupo){
            case 1 -> rangoEdad = "Persona mayor";
            case 2 -> rangoEdad = "Infancia";
            case 3 -> rangoEdad = "Adolescencia";
            case 4 -> rangoEdad = "Juventud";
            case 5 -> rangoEdad = "Adultez";
            case 6 -> rangoEdad = "Persona Mayor";
            default -> rangoEdad = "Ingrese una edad válida";
        };
        if(grupo>=7){
            System.out.printf("(%s)",rangoEdad);
        }else{
            System.out.printf("La edad ingresada (%d años) corresponde al rango de (%s)",edad,rangoEdad);
        }
        entrada.close();
    }
}
