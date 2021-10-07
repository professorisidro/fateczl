package br.com.professorisidro.fateczl.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.professorisidro.fateczl.model.Produto;

@RestController
@CrossOrigin("*")
public class ProdutoController {

	@GetMapping("/produto")
	public ResponseEntity<ArrayList<Produto>> recuperarTodos(){
		ArrayList<Produto> lista = new ArrayList<Produto>();
		for (int i=1; i<=10; i++) {
			Produto p = new Produto();
			p.setId(i);
			p.setDescricao("Produto "+i);
			p.setPreco(i*1000);
			lista.add(p);
		}
		return ResponseEntity.ok(lista);
	}
	
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<Produto> getProdutoById(@PathVariable int id){
		if (id == 1) {
			Produto p = new Produto();
			p.setId(1);
			p.setDescricao("Mouse que acende luzinha de noite");
			p.setPreco(50.0);
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
}
