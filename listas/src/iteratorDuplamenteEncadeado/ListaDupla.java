package iteratorDuplamenteEncadeado;

import java.util.Iterator;
import iteratorDuplamenteEncadeado.NoListaDuplaIterator;

public class ListaDupla<T> implements Iterable<T>{

	private NoListaDuplaIterator<T> primeiro;

	public ListaDupla() {
		primeiro = null;
	}

	public NoListaDuplaIterator<T> getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(NoListaDuplaIterator<T> primeiro) {
		this.primeiro = primeiro;
	}

	public void inserir(T valor) {
		NoListaDuplaIterator<T> novoNo = new NoListaDuplaIterator<T>();
		novoNo.setInfo(valor);
		novoNo.setProximo(primeiro);
		novoNo.setAnterior(null);
		
		if(primeiro != null) {
			primeiro.setAnterior(novoNo);
		}
		
		this.setPrimeiro(novoNo);
	}
	
	public NoListaDuplaIterator<T> buscar(T valor){
		NoListaDuplaIterator<T> noAtual = primeiro;
		
		while(noAtual != null) {
			if(noAtual.getInfo().equals(valor)) {
				return noAtual;
			}
			
			noAtual = noAtual.getProximo();
		}
		
		return null;
	}
	
	public void retirar(T valor) {
		NoListaDuplaIterator<T> noAtual = this.buscar(valor);
		
		if(noAtual != null) {
			if(noAtual.equals(primeiro)) {
				setPrimeiro(noAtual.getProximo());
			} else {
				noAtual.getAnterior().setProximo(noAtual.getProximo());
			}
			
			if(noAtual.getProximo() != null) {
				noAtual.getProximo().setAnterior(noAtual.getAnterior());
			}
		}
	}
	
	public void exibirOrdemInversa() {
		NoListaDuplaIterator<T> novoNo = obterUltimo();
		
		while(novoNo != null) {
			System.out.println(novoNo.getInfo());
			novoNo = novoNo.getAnterior();
		}
	}
	
	public NoListaDuplaIterator<T> obterUltimo(){
		NoListaDuplaIterator<T> ultimo = primeiro;
		
		NoListaDuplaIterator<T> novoNo = primeiro;
		
		while(novoNo != null) {
			ultimo = novoNo;
			novoNo = novoNo.getProximo();
		}
		
		return ultimo;
	}
	
	public void liberar() {
		NoListaDuplaIterator<T> noAtual = primeiro.getProximo();
		
		while(noAtual != null) {
			noAtual.setAnterior(null);
			NoListaDuplaIterator<T> proximo = noAtual.getAnterior();
			noAtual.setProximo(null);
			
			noAtual = proximo;
		}
		
		this.setPrimeiro(null);
	}
	
	@Override
	public String toString() {
		NoListaDuplaIterator<T> atualNo = primeiro;
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
		return new IteradorListaDupla();
	}
	
	private class IteradorListaDupla implements Iterator<T> {

		private NoListaDuplaIterator<T> ponteiro = getPrimeiro();

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
