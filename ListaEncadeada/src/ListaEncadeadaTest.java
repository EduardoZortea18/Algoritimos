import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaEncadeadaTest {
    @Test
    void deve_retornar_true_quando_lista_vazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        assertEquals(true, lista.estaVazia());
    }

    @Test
    void deve_retornar_false_quando_lista_possuir_elementos() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);

        assertEquals(false, lista.estaVazia());
    }

    @Test
    void deve_retornar_no_inserido() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);

        assertEquals(5, lista.getPrimeiro().getInfo());
        assertEquals(null, lista.getPrimeiro().getProximo());
    }

    @Test
    void deve_inserir_tres_numeros() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);

        assertEquals(3, lista.obterComprimento());
        assertEquals("15, 10, 5,", lista.toString());
    }

    @Test
    void deve_retornar_busca_de_elemento_na_lista() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(20, lista.buscar(20).getInfo());
    }

    @Test
    void deve_retornar_busca_de_elemento_no_meio_da_lista() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(15, lista.buscar(15).getInfo());
    }

    @Test
    void deve_retornar_null_na_busca() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        assertEquals(null, lista.buscar(50));
    }
}