package com.bandtec.simplify.simplifyApi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_agendamento;

    private String nomeCartorio;

    private String endereco;

    private String data;

    private String hora;


    public Integer getId_agendamento() {
        return id_agendamento;
    }

    public void setId_agendamento(Integer id_agendamento) {
        this.id_agendamento = id_agendamento;
    }

    public String getNomeCartorio() {
        return nomeCartorio;
    }

    public void setNomeCartorio(String nomeCartorio) {
        this.nomeCartorio = nomeCartorio;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
