/**
 *Programa que nos dice si la frase que indique el usuario es palíndrome o no 
 *No se diferencia entre espacios, mayúsculas o minúsculas
 *
 *@author: Ángel Pérez 
 * 
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Inserte la frase");
        String cadena1 = System.console().readLine();
        cadena1 = cadena1.toLowerCase();
        String palindrome = "";
        String cadena1N = "";

        for (int i = 0; i < cadena1.length(); i++) {//Este for nos imprime tada la cadena junta (sin espacios)
            char character = cadena1.charAt(i);
            if (character == ' ') { //Este if filtra y elimina posibles espacios

            } else {
                cadena1N = cadena1N + character;
            }
        }

        for (int i = cadena1.length() - 1; i >= 0; i--) {//Este for hace lo mismo pero va de fin a principio (al contrario)
            char character = cadena1.charAt(i);
            if (character == ' ') {//Este if quita los espacios

            } else {
                palindrome = palindrome + character;
            }
        }
        if (cadena1N.equals(palindrome)) {//Si las dos cadenas son iguales entonces son palíndrome
            System.out.println("La frase es un palíndromo");
        } else {
            System.out.println("La frase no es palíndromo");
        }
    }
}
