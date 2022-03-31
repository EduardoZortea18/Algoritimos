package atividade5;

import java.util.Iterator;

public class ListaEncadeadaForEach<T> implements Iterable<T> {

	private NoListaForEach<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista está vazia.
	 */

	public ListaEncadeadaForEach() {
		primeiro = null;
	}

	public NoListaForEach<T> getPrimeiro() {
		return primeiro;
	}

	/*
	 * inserir(T): Deve inserir um novo nó no início da lista. Este novo nó deve
	 * armazenar o valor recebido na variável paramétrica info.
	 */

	public void inserir(T info) {
		NoListaForEach<T> novo = new NoListaForEach<T>();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		this.primeiro = novo;
	}

	public Boolean estaVazia() {
		return primeiro == null;
	}

	public NoListaForEach<T> buscar(T info) {
		NoListaForEach<T> p = this.primeiro;
		while (p != null) {
			if (p.getInfo().equals(info))
				return p;
			p = p.getProximo();
		}
		return null;
	}

	public void retirar(T valor) {
		NoListaForEach<T> anterior = null;
		NoListaForEach<T> p = primeiro;

		while (p != null && !p.getInfo().equals(valor)) {
			anterior = p;
			p = p.getProximo();
		}

		if (p != null) {
			if (p == primeiro) {
				primeiro = primeiro.getProximo();
			} else {
				anterior.setProximo(p.getProximo());
			}
		}

	}

	public Integer obterComprimento() {
		int qtdNos = 0;

		NoListaForEach<T> p = primeiro;

		while (p != null) {
			p = p.getProximo();
		}
		return qtdNos;
	}

	public NoListaForEach<T> obterNo(Integer posicao) {

		if (posicao < 0)

			throw new IndexOutOfBoundsException();

		NoListaForEach<T> atualNo = primeiro;

		while ((atualNo != null) && (posicao > 0)) {
			posicao--;
			atualNo = atualNo.getProximo();
		}

		if (atualNo == null)
			throw new IndexOutOfBoundsException();

		return atualNo;

// NoLista<T> atualNo = primeiro;
// NoLista<T> noRetornado = null;
//
// boolean noExiste = false;
// int count = 0;
// int ultimaPosicao = obterComprimento() - 1;
//
// while (noExiste != true) {
// if (count == posicao) {
// noExiste = true;
// noRetornado = atualNo;
// }
// atualNo = atualNo.getProximo();
// count++;
// }
// return noRetornado;

	}

	@Override
	public String toString() {
		String resultado = "";

		while (iterator().hasNext()) {
			resultado += iterator().next();
		}

		return resultado;
//		NoListaForEach<T> p = primeiro;
//
//		while (p != null) {
//			if (p != primeiro)
//				resultado += ",";
//
//			resultado += p.getInfo().toString();
//			p = p.getProximo();
//		}
//		return resultado;

	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new IteradorListaEncadeada();
	}

	private class IteradorListaEncadeada implements Iterator<T> {

		private NoListaForEach<T> ponteiro = getPrimeiro();

		@Override
		public boolean hasNext() {
			return ponteiro != null;
		}

		@Override
		public T next() {
			T valor = ponteiro.getInfo();
			ponteiro = ponteiro.getProximo();
			return valor;
		}
	}

}