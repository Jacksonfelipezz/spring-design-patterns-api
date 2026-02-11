package br.com.jackson.labprojetospring.service.impl;

import br.com.jackson.labprojetospring.model.Cliente;
import br.com.jackson.labprojetospring.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(long id, Cliente cliente) {

    }

    @Override
    public void deletar(long id) {

    }
}
