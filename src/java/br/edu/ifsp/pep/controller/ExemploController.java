package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.model.Pessoa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploController implements Serializable {

    @Inject
    private PessoaDAO pessoaDAO;

    private Pessoa pessoa;
    private Pessoa pessoaSelecionada;
    private List<Pessoa> pessoas;

    public ExemploController() {
        System.out.println("construtor.");
        this.pessoa = new Pessoa();
    }

    public void adicionar() {
        System.out.println("adicionou a pessoa na lista");
        // this.pessoas.add(pessoa);
        this.pessoaDAO.inserir(pessoa);
        this.pessoa = new Pessoa();
        addMessage(FacesMessage.SEVERITY_INFO, "Informação", "Cadastro Realizado");
    }

    public void excluir() {
        System.out.println("Você Excluiu uma Pessoa da Lista");
        this.pessoaDAO.excluir(pessoaSelecionada);        
        System.out.println(pessoaSelecionada);
        addMessage(FacesMessage.SEVERITY_INFO, "Informação", "Pessoa Excluida");
    }

    private void addMessage(FacesMessage.Severity severity, String summary, String detail) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, summary, detail));
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Pessoa> getPessoas() {
//        return pessoas;
        System.out.println("Carregando");
        return pessoaDAO.buscarTodos();
    }

//    public void setPessoas(List<Pessoa> pessoas) {
//        this.pessoas = pessoas;
//    }
    public Pessoa getPessoaSelecionada() {
        return pessoaSelecionada;
    }

    public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
        this.pessoaSelecionada = pessoaSelecionada;
    }

}
