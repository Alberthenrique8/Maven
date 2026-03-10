package br.com.albert.repository;

import br.com.albert.domain.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class ClienteDAO {

    @PersistenceContext(unitName = "meuPU")
    private EntityManager entityManager;

    public void salvar(Cliente cliente) {

        entityManager.persist(cliente);
    }
}
