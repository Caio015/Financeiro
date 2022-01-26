package br.com.caio.financeiro.adapter.in.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caio.financeiro.application.port.ListarTodasAsReceitasPort;
import br.com.caio.financeiro.domain.Receita;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/receita")
@RequiredArgsConstructor
public class ListarTodasAsReceitasController {
	
	private final ListarTodasAsReceitasPort listarTodasAsReceitasPort; 
	
	@GetMapping(path = "/listar-todas-as-receitas")
	public ResponseEntity<List<Receita>> listarTodas() {
		
		List<Receita> receitas = listarTodasAsReceitasPort.listarTodas();
		
		return ResponseEntity.ok(receitas); 
	}

}
