package listaDuplamenteEncadeada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaDuplaTest {

	// 1
	@Test
	void deve_inserir_com_relacoes_corretas() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		NoListaDupla<Integer> noAtual = lista.getPrimeiro();
	
		String listaExibida = "";
		
		assertEquals("20,15,10,5", lista.toString());
		assertEquals("5,10,15,20", this.toStringContrario(lista));
	}
	
	// 2
	@Test
	void deve_buscar_elemento_no_inicio() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals(20, lista.buscar(20).getInfo());
	}
	
	// 3
	@Test
	void deve_buscar_elemento_no_meio_da_lista() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		assertEquals(10, lista.buscar(10).getInfo());
	}
		
	// 4
	@Test
	void deve_remover_elemento_no_inicio() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.retirar(20);
		
		assertEquals("15,10,5", lista.toString());
		assertEquals("5,10,15", this.toStringContrario(lista));
	}
	
	// 5
		@Test
	void deve_remover_elemento_no_meio() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		lista.retirar(10);
		
		assertEquals("20,15,5", lista.toString());
		assertEquals("5,15,20", this.toStringContrario(lista));
	}
	
		
	// 7
	@Test
	void develiberar() {
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		
		lista.inserir(5);
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		var no1 = lista.buscar(5);
		var no2 = lista.buscar(10);
		var no3 = lista.buscar(15);
		var no4 = lista.buscar(20);
		
		lista.liberar();
		
		assertEquals(null, no1.getAnterior());
		assertEquals(null, no1.getProximo());
	}	
		
	private String toStringContrario(ListaDupla<Integer> listaDupla) {
		NoListaDupla<Integer> atualNo = listaDupla.buscar(5);
		String lista = "";
		
		while(atualNo != null) {
			if(atualNo.getInfo() != 5) {
				lista += ",";
			}
		
			lista += atualNo.getInfo().toString();
						
			atualNo = atualNo.getAnterior();
		}
		
		return lista;
	}

}
