package br.com.professorisidro.fateczl;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.professorisidro.fateczl.model.Produto;

@SpringBootTest
public class ProdutoTests {
	
	@Test
	public void shouldExistProduto() throws Exception{
		Produto p = new Produto();
		p.setId(1);
		p.setDescricao("Computador");
		p.setPreco(1000);
		assertTrue(p.getId() != 0 && p.getDescricao() != null && p.getDescricao().length() > 0 && p.getPreco() > 0);
	}

}
