package iteratorDuplamenteEncadeado;

public class NoListaDuplaIterator<T> {
	private T info;
	private NoListaDuplaIterator<T> proximo;
	private NoListaDuplaIterator<T> anterior;
	
	public NoListaDuplaIterator<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoListaDuplaIterator<T> anterior) {
		this.anterior = anterior;
	}

	public NoListaDuplaIterator<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoListaDuplaIterator<T> proximo) {
		this.proximo = proximo;
	}

	public T getInfo() {
		return info;
	}
	
	public void setInfo(T info) {
		this.info = info;
	}
}
