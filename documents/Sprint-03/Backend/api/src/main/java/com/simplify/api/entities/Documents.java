package com.simplify.api.entities;

import com.simplify.api.entities.documents.CPF;
import com.simplify.api.entities.documents.Comprovante;
import com.simplify.api.entities.documents.RG;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Documents {


        //Essa classe ela é uma fk do usuario para referenciar seus documentos


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private CPF cpf;

    private RG rg;

    private Comprovante comprovante;

    private String tipoDocumento;

    private String urlUpload;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    public Comprovante getComprovante() {
        return comprovante;
    }

    public void setComprovante(Comprovante comprovante) {
        this.comprovante = comprovante;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUrlUpload() {
        return urlUpload;
    }

    public void setUrlUpload(String urlUpload) {
        this.urlUpload = urlUpload;
    }
}
