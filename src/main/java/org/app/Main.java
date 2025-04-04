package org.app;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        var pessoa2 = new Pessoa();
        pessoa1.setNome("Pedro");
        pessoa2.setNome("Vinicius");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        pessoa1.comer();
        pessoa1.viver();

        var analistaSistemas = new AnalistaSistemas();
        var gerenteSistemas = new GerenteSistemas();
        analistaSistemas.setSalario(10000D);
        gerenteSistemas.setSalario(15000D);
        System.out.println(gerenteSistemas.getSalario());
        System.out.println(analistaSistemas.getSalario());
        analistaSistemas.analisarSistemas();
        gerenteSistemas.gerenciarEquipes();

        int[] arrayNumeros = new int[3];
        arrayNumeros[0] = 5;
        arrayNumeros[1] = 6;
        arrayNumeros[2] = 2;
        System.out.println("Array não ordenado:");
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[1]);
        System.out.println(arrayNumeros[2]);

        Arrays.sort(arrayNumeros);
        System.out.println("Array ordenado:");
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[1]);
        System.out.println(arrayNumeros[2]);


        ArrayList<String> listaNomes = new ArrayList<String>();
        listaNomes.add("Pedro");
        System.out.println(listaNomes.get(0));
        listaNomes.add("Nome");
        listaNomes.add("Askdna");
        listaNomes.add("Aasfasf");
        listaNomes.forEach(System.out::println);
    }
}