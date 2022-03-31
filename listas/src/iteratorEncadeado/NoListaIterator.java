package iteratorEncadeado;

public class NoListaIterator<T> {
	private T info;
	private NoListaIterator<T> proximo;
	
	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
	
	public NoListaIterator getProximo() {
		return proximo;
	}
	
	public void setProximo(NoListaIterator proximo) {
		this.proximo = proximo;
	}
}
