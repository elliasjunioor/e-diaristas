package br.com.cleanapp.ediaristas.core.repositories;

import br.com.cleanapp.ediaristas.core.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
