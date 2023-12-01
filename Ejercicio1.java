/*
 * Programa que pide una cadena de texto por teclado y luego
 * mumestre cada palabra de la cadena en una línea distinta 
 * 
 *  @author: Ángel Pérez
 * 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Inserte una cadena de texto");
        String cadena = System.console().readLine();
//Con el for y el ChartAt podemos identificar la posición de cada letra de la palabra para luego imprimirla individualmente
        for (int i = 0; i < cadena.length(); i++) {
            char character = cadena.charAt(i);
            System.out.println(character);
        }

    }

}
