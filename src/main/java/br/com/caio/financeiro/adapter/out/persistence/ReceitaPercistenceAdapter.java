package br.com.caio.financeiro.adapter.out.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.caio.financeiro.application.port.out.CadastrarReceitaPort;
import br.com.caio.financeiro.domain.Receita;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReceitaPercistenceAdapter implements CadastrarReceitaPort {
	
	private final ReceitaRepository receitaRepository = null; 
	
	public void salvarReceita(Receita receita) {
		
		receitaRepository.save(receita); 
	}
	

}
