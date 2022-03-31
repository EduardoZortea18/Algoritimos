package iteratorEncadeado;

import java.util.Iterator;

import iteratorDuplamenteEncadeado.NoListaDuplaIterator;

public class ListaEncadeada<T> implements Iterable<T> {
	private NoListaIterator<T> primeiro;	

	public ListaEncadeada() {
	}
	
	public NoListaIterator getPrimeiro() {
		return primeiro;
	}
	
	public void inserir(T info) {
		NoListaIterator novoNo = new NoListaIterator();
		novoNo.setInfo(info);
		novoNo.setProximo(primeiro);
		this.primeiro = novoNo;
	}
	
	public void exibir() {
		NoListaIterator algumNo = primeiro;
		
		while(algumNo != null) {
			System.out.println(algumNo.getInfo());
			algumNo = algumNo.getProximo();
		}
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public NoListaIterator buscar(T info) {
		NoListaIterator<T> algumNo = primeiro;
		
		while(algumNo != null) {
			if(algumNo.getInfo().equals(info)) {
				return algumNo;
			}
			
			algumNo = algumNo.getProximo();
		}
		
		return null;
	}
	
	public void retirar(T info) {
		NoListaIterator<T> anterior = null;
		NoListaIterator<T> algumNo = primeiro;
		
		while((algumNo != null) && (algumNo.getInfo() != info)) {
			anterior = algumNo;
			algumNo = algumNo.getProximo();
		}
		
		if(algumNo != null) {
			if(anterior == null) {
				primeiro = algumNo.getProximo();
			} else {
				anterior.setProximo(algumNo.getProximo());
			}
		}
	}
	
	public int obterComprimento() {
		int count = 0;
		NoListaIterator proximo = primeiro;
		
		while(proximo != null) {
			count++;
			proximo = proximo.getProximo();
		}
		
		return count;
	}
	
	public NoListaIterator<T> obterNo(int index){
		if(index > obterComprimento() ||index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		NoListaIterator<T> atualNo = primeiro;
		NoListaIterator<T> noRetornado = null;
		
		boolean noExiste = false;
		int count = 0;
		
		while(noExiste != true) {
			if(count == index) {
				noExiste = true;
				noRetornado =  atualNo;
			}
			
			atualNo = atualNo.getProximo();
			count++;
		}
		
		return noRetornado;	
		
		

		
		/*
		 * ou
		 * 
		 * 
		 * if(index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		NoLista<T> atualNo = primeiro;
		
		while((atualNo != null) && (index > 0)) {
			index--;
			atualNo = atualNo.getProximo();
		}
		
		if(atualNo == null) {
			throw new IndexOutOfBoundsException();
		}
		
		return atualNo;*/
	}
	
	@Override
	public String toString() {
		NoListaIterator atualNo = primeiro;
		String lista = "";
		
		while(atualNo != null) {
			if(atualNo != primeiro) {
				lista += ",";
			}
		
			lista += atualNo.getInfo().toString();
						
			atualNo = atualNo.getProximo();
		}
		
		return lista;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new IteradorListaEncadeada();
	}
	
	private class IteradorListaEncadeada implements Iterator<T> {

		private NoListaIterator<T> ponteiro = getPrimeiro();

	   @Override
	   public boolean hasNext() {
	      return ponteiro!=null;
	   }

	   @Override
	   public T next() {
	      T valor = ponteiro.getInfo();
	      ponteiro = ponteiro.getProximo();
	      return valor;
	   }
	}
}
