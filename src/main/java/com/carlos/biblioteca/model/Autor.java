package com.carlos.biblioteca.model;

public class Autor {
    private String Nome;
    private String nacionalidade;
    private String obras;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObras() {
        return obras;
    }

    public void setObras(String obras) {
        this.obras = obras;
    }
}
