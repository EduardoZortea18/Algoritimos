package atividade3;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista está vazia.
	 */

	public ListaEncadeada() {
		primeiro = null;
	}

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	/*
	 * inserir(T): Deve inserir um novo nó no início da lista. Este novo nó deve
	 * armazenar o valor recebido na variável paramétrica info.
	 */

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();
		novo.setInfo(info);
		novo.setProximo(getPrimeiro());
		this.primeiro = novo;
	}

	public Boolean estaVazia() {
		return primeiro == null;
	}

	public NoLista<T> buscar(T info) {
		NoLista<T> p = this.primeiro;
		while (p != null) {
			if (p.getInfo().equals(info))
				return p;
			p = p.getProximo();
		}
		return null;
	}

	public void retirar(T valor) {
		NoLista<T> anterior = null;
		NoLista<T> p = primeiro;

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

		NoLista<T> p = primeiro;

		while (p != null) {
			p = p.getProximo();
		}
		return qtdNos;
	}

	public NoLista<T> obterNo(Integer posicao) {

		if (posicao < 0)

			throw new IndexOutOfBoundsException();

		NoLista<T> atualNo = primeiro;

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
		NoLista<T> p = primeiro;

		while (p != null) {
			if (p != primeiro)
				resultado += ",";

			resultado += p.getInfo().toString();
			p = p.getProximo();
		}
		return resultado;
	}

}