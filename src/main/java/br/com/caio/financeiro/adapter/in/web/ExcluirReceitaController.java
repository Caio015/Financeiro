package br.com.caio.financeiro.adapter.in.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.caio.financeiro.application.ExcluirReceitaUseCase;
import br.com.caio.financeiro.application.port.ExcluirReceitaPort;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "receita")
@RequiredArgsConstructor
public class ExcluirReceitaController {
	
	private final ExcluirReceitaUseCase excluirReceitaUseCase; 

	@DeleteMapping(path = "/excluirReceita/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void excluirReceita(@PathVariable(name = "id") Long id){
		
		excluirReceitaUseCase.execute(new ExcluirReceitaUseCase.InputValues(id));
		
	}

}
