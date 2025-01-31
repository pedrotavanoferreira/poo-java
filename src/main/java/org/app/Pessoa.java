package org.app;

public class Pessoa {

    private String nome;
    private String idade;

    public void comer(){
        System.out.println("comendo");
    }

    public void dormir(){
        System.out.println("dormindo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}
