package br.com.caio.financeiro.application.port;

import br.com.caio.financeiro.domain.Receita;

public interface CadastrarReceitaPort {	
	
	void save(Receita receita); 

}
