package EjercicioSesión3;

/*Enunciado Ejercicio 3*/

/*En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima
el resultado final por consola.

Tened en cuenta que los textos pueden venir de un array de tipo String.

Por ejemplo: String[] nombres = {"", "", "", ""}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valor= new Scanner(System.in);

        System.out.println("Introduce el texto a concatenar para finalizar teclea FIN:");

        List<String> arraytexto =new ArrayList<>();

        String texto=valor.nextLine();
        while (!texto.equals("FIN")) {

            arraytexto.add(texto);
            texto=valor.nextLine();

        }

        System.out.println(concatena(arraytexto));

    }
    private static String concatena(List<String> arraytexto) {
        String Textoconcatenado="";
        for (String nombre :arraytexto) {
            Textoconcatenado=Textoconcatenado+nombre;
            System.out.println(nombre);
        }
        return Textoconcatenado;

    }
}
