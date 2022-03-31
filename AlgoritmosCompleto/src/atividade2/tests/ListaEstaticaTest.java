package atividade2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListaEstaticaTest {

	@Test
	public void testInclusao() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals("5,10,15,20", estatica.toString());

	}

	@Test
	public void testObtencao() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		Integer valor = 4;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals(valor, estatica.getTamanho());
	}

	@Test
	public void testBuscar() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

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
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

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
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		Integer tamanho = 15;

		for (int i = 1; i <= 15; i++) {
			estatica.inserir(i);
		}

		assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15", estatica.toString());
		assertEquals(tamanho, estatica.getTamanho());

	}

	@Test
	public void testObterElemento() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		Integer valor = 20;

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		assertEquals(valor, estatica.obterElemento(3));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testObterElementoException() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.obterElemento(5);

	}

	@Test
	public void testEstaVazia() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.liberar();
		assertEquals(true, estatica.estaVazia());
	}
	
	@Test
	public void testInverterPar() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.inverter();
		assertEquals("20,15,10,5", estatica.toString());
	}
	
	@Test
	public void testInverterImpar() {
		atividade2.ListaEstatica<Integer> estatica = new atividade2.ListaEstatica<>();

		estatica.inserir(5);
		estatica.inserir(10);
		estatica.inserir(15);
		estatica.inserir(20);
		estatica.inserir(25);
		estatica.inverter();
		assertEquals("25,20,15,10,5", estatica.toString());
	}

}
