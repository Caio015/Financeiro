package br.com.caio.financeiro.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.caio.financeiro.domain.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Long> {

}
