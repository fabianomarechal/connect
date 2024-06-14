package br.com.acheplus.connect.service;

import br.com.acheplus.connect.model.Client;
import br.com.acheplus.connect.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Client save(Client cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Client> findByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }
}
