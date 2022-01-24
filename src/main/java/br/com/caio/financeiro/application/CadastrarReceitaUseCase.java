package br.com.caio.financeiro.application;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import br.com.caio.financeiro.application.port.out.CadastrarReceitaPort;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Service
@RequiredArgsConstructor
public class CadastrarReceitaUseCase {
	
	private final CadastrarReceitaPort cadastrarReceitaPort = null; 
	
	
	
	public OutputValues execute(InputValues input) {
		
		return null;
		
	}
	
	
	
	@Value
    public static class InputValues {

	Long id;
	String descricao;
	BigDecimal valor;
	LocalDate data;

    }
	
	public static class OutputValues {
		
	}

}
