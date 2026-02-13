package br.com.jackson.labprojetospring.service.impl;

import br.com.jackson.labprojetospring.model.Cliente;
import br.com.jackson.labprojetospring.model.ClienteRepository;
import br.com.jackson.labprojetospring.model.Endereco;
import br.com.jackson.labprojetospring.model.EnderecoRepository;
import br.com.jackson.labprojetospring.service.ClienteService;
import br.com.jackson.labprojetospring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(long id, Cliente cliente) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            cliente.setId(id);
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(long id) {
        clienteRepository.deleteById(id);
    }


    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            return enderecoRepository.save(novoEndereco);
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

}
