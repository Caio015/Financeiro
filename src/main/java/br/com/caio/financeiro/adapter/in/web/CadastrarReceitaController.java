package br.com.caio.financeiro.adapter.in.web;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import br.com.caio.financeiro.application.CadastrarReceitaUseCase;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@RestController
@RequestMapping(path = "/receita")
@RequiredArgsConstructor
public class CadastrarReceitaController {
	
	private final CadastrarReceitaUseCase cadastrarReceitaUseCase;
	
	@PostMapping(path = "/cadastrar-nova-receita")
	@ResponseStatus(value = HttpStatus.CREATED)
	public void cadstrarNovaReceita(@RequestBody Request request){
		
	 LocalDate novaData = LocalDate.parse(request.data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
				
		cadastrarReceitaUseCase.execute(
				new CadastrarReceitaUseCase.InputValues(request.getDescricao(),
						request.getValor(), 
						novaData
						)); 	
	}
	
	
	@Value
	public static class Request{
		
		String descricao;
		BigDecimal valor;
		String data;
	}

}
