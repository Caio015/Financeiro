package br.com.caio.financeiro.application;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

import br.com.caio.financeiro.application.port.CadastrarReceitaPort;
import br.com.caio.financeiro.domain.Receita;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Service
@RequiredArgsConstructor
public class CadastrarReceitaUseCase {
	
	private final CadastrarReceitaPort cadastrarReceitaPort; 
	
	
	
	public OutputValues execute(InputValues input) {
		
		Receita receita = input.of(input.getDescricao(), input.getValor(), input.getData());
		cadastrarReceitaPort.save(receita); 
		
		
		return new OutputValues();
		
	}
	
	
	
	@Value
    public static class InputValues {

	String descricao;
	BigDecimal valor;
	LocalDate data;
	
	public static Receita of(String descricao, BigDecimal valor, LocalDate data) {
		
		Receita receita = new Receita(descricao, valor, data); 
		
		return receita;
	}

    }
	
	public static class OutputValues {
		
	}

}
