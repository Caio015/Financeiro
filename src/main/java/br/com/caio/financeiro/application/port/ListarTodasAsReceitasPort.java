package br.com.caio.financeiro.application.port;


import java.util.List;

import br.com.caio.financeiro.domain.Receita;

public interface ListarTodasAsReceitasPort {

	List<Receita> listarTodas();
}
