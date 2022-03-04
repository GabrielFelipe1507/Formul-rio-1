package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Pessoa;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PessoaDAO {

    @PersistenceContext(unitName = "aula2FP2PU")
    private EntityManager em;

    public void inserir(Pessoa pessoa) {
        em.persist(pessoa);
    }

    public List<Pessoa> buscarTodos() {
        return em.createQuery("Select p FROM Pessoa p", Pessoa.class).getResultList();
        
    }

}
