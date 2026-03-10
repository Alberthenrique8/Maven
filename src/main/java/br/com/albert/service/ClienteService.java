package br.com.albert.service;

import br.com.albert.domain.Cliente;
import br.com.albert.repository.ClienteDAO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClienteService {

    @Inject
    private ClienteDAO clienteDAO;

    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente);
    }
}