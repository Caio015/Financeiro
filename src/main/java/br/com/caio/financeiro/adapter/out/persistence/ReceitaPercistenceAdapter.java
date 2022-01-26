package br.com.caio.financeiro.adapter.out.persistence;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.caio.financeiro.application.port.CadastrarReceitaPort;
import br.com.caio.financeiro.application.port.ExcluirReceitaPort;
import br.com.caio.financeiro.application.port.ListarReceitaPorIdPort;
import br.com.caio.financeiro.application.port.ListarTodasAsReceitasPort;
import br.com.caio.financeiro.domain.Receita;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReceitaPercistenceAdapter implements CadastrarReceitaPort, 
												ListarTodasAsReceitasPort,
												ListarReceitaPorIdPort,
												ExcluirReceitaPort{
	
	private final ReceitaRepository receitaRepository;

	@Override
	public void save(Receita receita) {
		
		receitaRepository.save(receita); 
		
	}

	@Override
	public List<Receita> listarTodas() {
		
		return receitaRepository.findAll();
	}

	@Override
	public Receita findById(Long id) {
		
		return receitaRepository.findById(id).get();
	}

	@Override
	public void excluirReceita(Long id) {

		receitaRepository.deleteById(id);
		
	}

}
