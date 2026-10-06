package com.exemplo.biblioteca.model;

public class Leitor {
    private final Long id;
    private final String nome;
    private final String email;
    private final String telefone;
    private final String cpf;

    public Leitor (Long id, String nome, String email, String telefone, String cpf){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("O nome do leitor é obrigatório!");
        }

        if (email == null || !email.contains("@") || !email.contains(".")){
            throw new IllegalArgumentException("O email do leitor é inválido!");
        }

        if (telefone == null) {
            throw  new IllegalArgumentException("O telefone do leitor é obrigatório!");
        }

        String telefoneNumeros = telefone.replaceAll("\\D", "");
        if (telefoneNumeros.length() != 11) {
            throw new IllegalArgumentException("O telefone deve ter 11 dígitos com o DDD incluso.");
        }

        if (cpf == null) {
            throw new IllegalArgumentException("O CPF do leitor é obrigatório!");
        }

        String cpfNumeros = cpf.replaceAll("\\D", "");
        if (cpfNumeros.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos!");
        }

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefoneNumeros;
        this.cpf = cpfNumeros;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }
}
