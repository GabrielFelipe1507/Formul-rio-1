
package br.edu.ifsp.pep.model;

import java.util.Date;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private boolean status;
    private String uf;
    
    public String getNome() {
        return nome;
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
}
