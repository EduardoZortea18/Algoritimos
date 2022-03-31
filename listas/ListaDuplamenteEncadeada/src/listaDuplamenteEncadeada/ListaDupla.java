package listaDuplamenteEncadeada;

public class ListaDupla<T> {
	private NoListaDupla<T> primeiro;

	public ListaDupla() {
		primeiro = null;
	}

	public NoListaDupla<T> getPrimeiro() {
		return primeiro;
	}
	
	public void setPrimeiro(NoListaDupla<T> primeiro) {
		this.primeiro = primeiro;
	}

	public void inserir(T valor) {
		NoListaDupla<T> novoNo = new NoListaDupla<T>();
		novoNo.setInfo(valor);
		novoNo.setProximo(primeiro);
		novoNo.setAnterior(null);
		
		if(primeiro != null) {
			primeiro.setAnterior(novoNo);
		}
		
		this.setPrimeiro(novoNo);
	}
	
	public NoListaDupla<T> buscar(T valor){
		NoListaDupla<T> noAtual = primeiro;
		
		while(noAtual != null) {
			if(noAtual.getInfo().equals(valor)) {
				return noAtual;
			}
			
			noAtual = noAtual.getProximo();
		}
		
		return null;
	}
	
	public void retirar(T valor) {
		NoListaDupla<T> noAtual = this.buscar(valor);
		
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
		NoListaDupla<T> novoNo = obterUltimo();
		
		while(novoNo != null) {
			System.out.println(novoNo.getInfo());
			novoNo = novoNo.getAnterior();
		}
	}
	
	public NoListaDupla<T> obterUltimo(){
		NoListaDupla<T> ultimo = primeiro;
		
		NoListaDupla<T> novoNo = primeiro;
		
		while(novoNo != null) {
			ultimo = novoNo;
			novoNo = novoNo.getProximo();
		}
		
		return ultimo;
	}
	
	public void liberar() {
		NoListaDupla<T> noAtual = primeiro;
		
		while(noAtual != null) {
			noAtual.setAnterior(null);
			NoListaDupla<T> proximo = noAtual.getProximo();
			noAtual.setProximo(null);
			
			noAtual = proximo;
		}
		
		this.setPrimeiro(null);
	}
	
	@Override
	public String toString() {
		NoListaDupla<T> atualNo = primeiro;
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
}
