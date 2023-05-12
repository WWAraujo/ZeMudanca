package br.com.zemudanca.model;

import java.util.Date;

public class Cliente {

    private String id, nome, cpf, celular01, celular02, endereco, email;
    private Date dataNascimento;

    public Cliente(String id, String nome, String cpf, String celular01, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular01 = celular01;
        this.endereco = endereco;
    }

    public Cliente(String uid, String nome, String cpf, String celular01, String celular02, String endereco, String email) {
        this.id = uid;
        this.nome = nome;
        this.cpf = cpf;
        this.celular01 = celular01;
        this.celular02 = celular02;
        this.endereco = endereco;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular01() {
        return celular01;
    }

    public void setCelular01(String celular01) {
        this.celular01 = celular01;
    }

    public String getCelular02() {
        return celular02;
    }

    public void setCelular02(String celular02) {
        this.celular02 = celular02;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
