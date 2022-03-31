package atividade1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import atividade1.ListaEstatica;

public class ListaEstaticaTest {

	@Test
	public void testInclusao() {
		ListaEstatica estatica = new ListaEstatica();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals("5,10,15,20", estatica.toString());
	}

	@Test
	public void testObtencao() {
		ListaEstatica estatica = new ListaEstatica();

		Integer valor = 4;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals(valor, estatica.getTamanho());
	}

	@Test
	public void testBuscar() {
		ListaEstatica estatica = new ListaEstatica();

		Integer valor = 2;
		Integer busca = 15;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals(valor, estatica.buscar(busca));
	}

	@Test
	public void testRetirar() {
		ListaEstatica estatica = new ListaEstatica();

		Integer tamanho = 3;
		Integer retirar = 10;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.retirar(retirar);
		assertEquals("5,15,20", estatica.toString());
		assertEquals(tamanho, estatica.getTamanho());

	}

	@Test
	public void testRedimensionamento() {
		ListaEstatica estatica = new ListaEstatica();

		Integer tamanho = 15;

		for (int i = 1; i <= 15; i++) {
			estatica.inserir(i);
		}

		assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", estatica.toString());
		assertEquals(tamanho, estatica.getTamanho());

	}

	@Test
	public void testObterElemento() {
		ListaEstatica estatica = new ListaEstatica();

		Integer valor = 20;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals(valor, estatica.obterElemento(3));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testObterElementoException() {
		ListaEstatica estatica = new ListaEstatica();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.obterElemento(5);

	}

	@Test
	public void testEstaVazia() {
		ListaEstatica estatica = new ListaEstatica();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.liberar();
		assertEquals(true, estatica.estaVazia());
	}

}
