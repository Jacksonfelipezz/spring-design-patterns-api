package br.com.jackson.labprojetospring.service;

import br.com.jackson.labprojetospring.model.Cliente;
import org.springframework.stereotype.Service;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(long id, Cliente cliente);
    void deletar(long id);
}
