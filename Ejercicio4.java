/**
 * Programa que muestr por telado cuantas vocales hay en una cadena de texto introducida
 * 
 * @author: Ángel Pérez
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Inserte la cadena");
        String cadena1 = System.console().readLine();
        cadena1 = cadena1.toLowerCase();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        for (int f = 0; f < cadena1.length(); f++) {
            char character = cadena1.charAt(f);
            if (character == 'a') {// Hacemos una condición con cada vocal y hacemos un bucle que pase por cada
                                   // letra y así detecte cuantas vocales hay y se sumarán a una variable
                a++;
            }
            if (character == 'e') {
                e++;
            }
            if (character == 'i') {
                i++;
            }
            if (character == 'o') {
                o++;
            }
            if (character == 'u') {
                u++;
            }

        }
        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
    }
}
