package com.example.sprint2.dominios;

import javax.persistence.*;

@Entity
public abstract class Usuario {

    @Column(length = 60,nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Usuario(String email, String senha, int id) {
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    public abstract int analytics();



    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", id=" + id +
                '}';
    }
}
