import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ListaEstaticaTests {

	@Test
	void inverterTest() {
		ListaEstatica<Integer> lista = new ListaEstatica<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.inverter();
		
		assertEquals("20, 15, 10, 5,", lista.toString());
		
	}
	
	@Test
	void inverterTestComTamnhoImpar() {
		ListaEstatica<Integer> lista = new ListaEstatica<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		lista.inserir(25);
		
		lista.inverter();
		
		assertEquals("25, 20, 15, 10, 5,", lista.toString());
		
	}

}
