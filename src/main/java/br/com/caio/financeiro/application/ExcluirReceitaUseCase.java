package br.com.caio.financeiro.application;

import org.springframework.stereotype.Service;

import br.com.caio.financeiro.application.port.ExcluirReceitaPort;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Service
@RequiredArgsConstructor 
public class ExcluirReceitaUseCase {
	
	private final ExcluirReceitaPort excluirReceitaPort; 
	
	public OutputValues execute(InputValues input) {
		
		excluirReceitaPort.excluirReceita(input.getId());
		
		return new OutputValues();
		
	}
	
	@Value
	public static class InputValues{
		
		Long id;
		
	}

	@Value
	public static class OutputValues{
	}
}
