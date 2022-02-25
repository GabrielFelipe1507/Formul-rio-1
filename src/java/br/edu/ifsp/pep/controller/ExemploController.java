package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploController implements Serializable{
    private Pessoa pessoa;
    private List<Pessoa> pessoas = new ArrayList<>();
    
    public ExemploController(){
        System.out.println("construtor.");
        this.pessoa=new Pessoa();
    }
    public void excluir(){
        pessoas.remove(this.pessoa);
    }
    
   public void adicionar(){
       System.out.println("adicionou a pessoa na lista");
       System.out.println("Nome: " + this.pessoa.getNome());
       this.pessoas.add(pessoa);
       this.pessoa=new Pessoa();
       addMessage(FacesMessage.SEVERITY_INFO, "Informação", "Cadastro Realizado");
   }
   private void addMessage(FacesMessage.Severity severity, String summary, String detail){
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
   }
   public void exibir(){
       for(Pessoa p: pessoas){
           System.out.println(p.getNome());
       }
   }
   public Pessoa getPessoa(){
       return pessoa;
   }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
   
}
