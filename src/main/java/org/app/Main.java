package org.app;

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
        System.out.println(arrayNumeros[0]);
        System.out.println(arrayNumeros[2]);

    }
}