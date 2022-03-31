package atividade5;

public class NoListaForEach<T> {

	private T info;

	private NoListaForEach<T> proximo;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NoListaForEach<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoListaForEach<T> proximo) {
		this.proximo = proximo;
	}

}
