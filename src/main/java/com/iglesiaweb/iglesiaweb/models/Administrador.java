package com.iglesiaweb.iglesiaweb.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

//entidade é a parte que cria as informaçoes do banco
@Entity
@Table (name = "administradores")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;

    @Column(name = "nome" , length = 100 , nullable = false)
    private String nome;

    @Column(name = "email" , length = 180, nullable = false)
    private String email;

    @Column(name = "senha", length = 255 , nullable = false)
    private String senha;

    @Column(name = "observacao")

    private String observacao;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
