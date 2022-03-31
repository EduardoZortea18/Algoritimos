import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListaEncadeadaTest {
	//1
	@Test
	void deve_retornar_true_quando_lista_vazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        assertEquals(true, lista.estaVazia());
    }

 	// 2
    @Test
    void deve_retornar_false_quando_lista_possuir_elementos() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);

        assertEquals(false, lista.estaVazia());
    }

    // 3
    @Test
    void deve_retornar_no_inserido() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);

        assertEquals(5, lista.getPrimeiro().getInfo());
        assertEquals(null, lista.getPrimeiro().getProximo());
    }

    // 4
    @Test
    void deve_inserir_tres_numeros() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);

        assertEquals(3, lista.obterComprimento());
        assertEquals("15,10,5", lista.toString());
    }

    // 5
    @Test
    void deve_retornar_busca_de_elemento_na_lista() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.buscar(20).getInfo());
    }

    // 6
    @Test
    void deve_retornar_busca_de_elemento_no_meio_da_lista() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(15, lista.buscar(15).getInfo());
    }

    // 7
    @Test
    void deve_retornar_null_na_busca() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(null, lista.buscar(50));
    }

    // 8
    @Test
    void deve_retornar_lista_sem_removido() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(20);
        
        NoLista algumNo = new NoLista();
		algumNo = lista.getPrimeiro();
		
		assertEquals("15,10,5", lista.toString()); 
    }
    
    // 9
    @Test
    void deve_retornar_lista_sem_removido_do_meio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        lista.retirar(15);
        
        NoLista algumNo = new NoLista();
		algumNo = lista.getPrimeiro();
		
		assertEquals("20,10,5", lista.toString());
    }
    
    // 10
    @Test
    void deve_obter_no() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
		
		assertEquals(20, lista.obterNo(0).getInfo());
    }
    
    // 11
    @Test
    void deve_obter_no_especifico() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
		
		assertEquals(5, lista.obterNo(3).getInfo());
    }
    
    // 12
    @Test
    void obterNo_deve_retornar_exception() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
		
		try {
			lista.obterNo(10);
			fail();
		} catch(IndexOutOfBoundsException ex) {
			
		}
    }
}
