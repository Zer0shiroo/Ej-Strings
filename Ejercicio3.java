/**
 * Programa que pide tres cadenas que sea el nombre y los ods apellidos 
 * y luego creará un código con las primeras tres letras de cada cadena
 * 
 * @author: Ángel Pérez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Inserte el nombre");
        String cadena1 = System.console().readLine();

        System.out.println("Inserte el primer apellido");
        String cadena2 = System.console().readLine();

        System.out.println("Inserte el segundo apellido");
        String cadena3 = System.console().readLine();

        cadena1 = cadena1.toUpperCase();//Lo pongo todo en mayúscula
        cadena2 = cadena2.toUpperCase();
        cadena3 = cadena3.toUpperCase();
        for (int i = 0; i < 3; i++) {//Imprimimos en cada cadena las primeros tres letras en la misma línea
            char character = cadena1.charAt(i);
            System.out.print(character);
        }
        for (int i = 0; i < 3; i++) {
            char character = cadena2.charAt(i);
            System.out.print(character);
        }
        for (int i = 0; i < 3; i++) {
            char character = cadena3.charAt(i);
            System.out.print(character);
        }
    }
}
