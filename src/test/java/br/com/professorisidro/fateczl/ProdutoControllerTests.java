package br.com.professorisidro.fateczl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoControllerTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void shouldReturnProductList() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/produto"))
			   .andDo(MockMvcResultHandlers.print())
			   .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void shouldReturnProductDetail() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/produto/1"))
		       .andDo(MockMvcResultHandlers.print())
		       .andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void shouldReturnError404() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/produto/5"))
			   .andExpect(MockMvcResultMatchers.status().is(404));
	}

}
