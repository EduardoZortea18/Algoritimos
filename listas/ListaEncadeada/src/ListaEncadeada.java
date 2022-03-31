
public class ListaEncadeada<T> {
	private NoLista<T> primeiro;	

	public ListaEncadeada() {
	}
	
	public NoLista getPrimeiro() {
		return primeiro;
	}
	
	public void inserir(T info) {
		NoLista novoNo = new NoLista();
		novoNo.setInfo(info);
		novoNo.setProximo(primeiro);
		this.primeiro = novoNo;
	}
	
	public void exibir() {
		NoLista algumNo = primeiro;
		
		while(algumNo != null) {
			System.out.println(algumNo.getInfo());
			algumNo = algumNo.getProximo();
		}
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public NoLista buscar(T info) {
		NoLista<T> algumNo = primeiro;
		
		while(algumNo != null) {
			if(algumNo.getInfo().equals(info)) {
				return algumNo;
			}
			
			algumNo = algumNo.getProximo();
		}
		
		return null;
	}
	
	public void retirar(T info) {
		NoLista<T> anterior = null;
		NoLista<T> algumNo = primeiro;
		
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
		NoLista proximo = primeiro;
		
		while(proximo != null) {
			count++;
			proximo = proximo.getProximo();
		}
		
		return count;
	}
	
	public NoLista<T> obterNo(int index){
		if(index > obterComprimento() ||index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		NoLista<T> atualNo = primeiro;
		NoLista<T> noRetornado = null;
		
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
		NoLista atualNo = primeiro;
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
