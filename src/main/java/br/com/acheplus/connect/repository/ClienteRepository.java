package br.com.acheplus.connect.repository;

import br.com.acheplus.connect.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByEmail(String email);
}
