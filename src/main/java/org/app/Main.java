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
    }
}