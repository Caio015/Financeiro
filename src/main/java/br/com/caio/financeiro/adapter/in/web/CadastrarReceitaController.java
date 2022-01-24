package br.com.caio.financeiro.adapter.in.web;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caio.financeiro.application.CadastrarReceitaUseCase;

@RestController
@RequestMapping(path = "/receita")
public class CadastrarReceitaController {
	
	@PostMapping(path = "/cadastrar-nova-receita")
	public ResponseEntity<Void> cadstrarNovaReceita(@RequestBody @Valid CadastrarReceitaUseCase.InputValues input){
		
		return null;
	}

}
