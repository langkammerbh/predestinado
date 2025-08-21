package br.com.ipbcentralbetim.predestinado.repository;

import br.com.ipbcentralbetim.predestinado.models.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Integer> {
}
