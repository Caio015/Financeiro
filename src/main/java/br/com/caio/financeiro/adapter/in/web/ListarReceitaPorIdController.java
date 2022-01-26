package br.com.caio.financeiro.adapter.in.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caio.financeiro.application.port.ListarReceitaPorIdPort;
import br.com.caio.financeiro.domain.Receita;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/receita")
@RequiredArgsConstructor
public class ListarReceitaPorIdController {
	
	private final ListarReceitaPorIdPort listarReceitaPorId;
	
	@GetMapping(value = "/listar-receita-por-id/{id}")
	public ResponseEntity<Receita> listarPorId(@PathVariable(name = "id") Long id){
		
		Receita receita = listarReceitaPorId.findById(id); 
		
		return ResponseEntity.ok(receita);
	}
	

}
