package com.example.mercado.vendas.service;

import com.example.mercado.vendas.model.Cliente;
import com.example.mercado.vendas.model.Endereco;
import com.example.mercado.vendas.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
    public void criarNovoCliente (Cliente cliente) {
        Endereco endereco = cliente.getEndereco();
       /*enderecoRepository.save(endereco);*/
        clienteRepository.save(cliente);
    }
    public void editarCliente(Long id, Cliente cliente){
        validarId(id);
        cliente.setId(id);
        clienteRepository.save(cliente);
    }
    private void validarId(Long id){
        clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Cliente de id %s não existe", id)));
    }
    public void deletarCliente(Long id){
        validarId(id);
        clienteRepository.deleteById(id);
    }
}
