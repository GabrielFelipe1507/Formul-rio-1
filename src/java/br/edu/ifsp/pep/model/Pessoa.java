
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;
    @Column(name="nome", length = 50, nullable = false)
    private String nome;
    @Column(name="data_nascimento", nullable = false)
    private Date dataNascimento;
    @Column(name="status", nullable = false)
    private boolean status;
    @Column(name="uf", nullable = false, length = 2)
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", status=" + status + ", uf=" + uf + '}';
    }
    
    
}
