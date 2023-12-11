/**
 * Programa que pide dos cadenas de texto y luego diga si
 * son o no iguales, sin diferenciar entre mayúscula o minúscula
 * 
 * @author: Ángel Pérez
 * 
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Inserte la primera cadena de texto");
        String cadena1 = System.console().readLine();

        System.out.println("Inserte la segunda cadena de texto");
        String cadena2 = System.console().readLine();
        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales");

        } else {
            System.out.println("Las cadenas no son iguales");

        }
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();
        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales sin diferenciar entre mayúsculas y minúsculas");
        } else {
            System.out.println("Las cadenas no son iguales sin diferenciar entre mayúsculas y minúsculas");
        }

    }
}
