package decorator.pratica;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DescafeinadoTest {
	Bebida bebida;
	@Before
	public void setUp() throws Exception {

		}

	@Test
	public void testPreco() {
		bebida = new Descafeinado(Bebida.Tamanhos.MEDIO);
		bebida = new Chocolate(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chantilly(bebida);
		
		assertEquals(4.76, bebida.preco(), 0.01);
		
		
		bebida = new Descafeinado(Bebida.Tamanhos.GRANDE);
		bebida = new Leite(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chantilly(bebida);
		
		assertEquals(8.75, bebida.preco(), 0.01);
		
		bebida = new Descafeinado(Bebida.Tamanhos.PEQUENO);
		bebida = new Leite(bebida);
		bebida = new Soja(bebida);
		bebida = new Soja(bebida);
		bebida = new Chantilly(bebida);
		
		assertEquals(4.28, bebida.preco(), 0.01);
		
		bebida = new Descafeinado(Bebida.Tamanhos.GRANDE);
		bebida = new Chocolate(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chantilly(bebida);
		
		assertEquals(9, bebida.preco(), 0.01);
		
		bebida = new Descafeinado(Bebida.Tamanhos.GRANDE);
		assertEquals(3.75, bebida.preco(), 0.01);
		
	}
}
