package br.com.albert.controller;
import br.com.albert.domain.Cliente;
import br.com.albert.service.ClienteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@RequestScoped
public class ClienteController implements Serializable {


    private Cliente cliente = new Cliente();

    @Inject
    private ClienteService clienteService;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteService getClienteService() {
        return clienteService;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void salvar() {
        clienteService.salvar(cliente);
    }

}
