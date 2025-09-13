package com.example;

public class Ejercicio3 {
    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
        // tu código aquí

        int contador = 5;
        System.out.println(contador);

        int preIncremento = ++contador;

        System.out.println(preIncremento);

        int postIncremento = contador++;

        System.out.println(postIncremento);

        int preDecremento = --contador;

        System.out.println(preDecremento);

        int postDecremento = contador--;

        System.out.println(postDecremento);

        // el post incremento devuelve el valor de la variable y lo incrementa en 1
        // unidad
        // el preicremento incremeneta y luego devuelve el nuevo valor
    }
}
