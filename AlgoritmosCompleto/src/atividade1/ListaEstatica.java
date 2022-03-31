package atividade1;

public class ListaEstatica {

	private Integer[] info;
	private Integer tamanho;

	/*
	 * ListaEstatica(): construtor da classe. Deve criar um vetor para guardar os
	 * dados e estabelecer que a lista está vazia;
	 */

	public ListaEstatica() {
		info = new Integer[10];
		tamanho = 0;
	}

	/*
	 * redimensionar(): este método deverá aumentar a capacidade de armazenamento da
	 * lista, criando um novo vetor com capacidade de armazenamento expandida em 10
	 * novas posições e copiar os dados do vetor original para o novo vetor criado.
	 * Por fim, o método redimensionar() deverá assumir que o novo vetor info é o
	 * vetor recentemente criado;
	 */

	public void redimensionar() {
		Integer[] novo = new Integer[info.length + 10];

		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}

		info = novo;

	}

	/*
	 * inserir(int): Deve inserir o número fornecido como argumento no vetor
	 * encapsulado pela lista. Caso o vetor encapsulado info não tenha mais posições
	 * livres, deve invocar o método privado redimensionar(), para expandir a
	 * capacidade de armazenamento da lista;
	 */

	public void inserir(Integer valor) {
		if (tamanho >= info.length) {
			redimensionar();
			info[tamanho] = valor;
		}

		info[tamanho] = valor;
		tamanho += 1;

	}

	/*
	 * exibir(): Deve exibir o conteúdo armazenado na lista, apresentando na tela o
	 * valor do primeiro número até o último número armazenado, nesta ordem;
	 */

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}

	/*
	 * buscar(int): Deve procurar se há um número igual ao fornecido como argumento.
	 * Caso seja encontrado, este método deverá retornar a posição do número no
	 * vetor (índice no vetor). Se não for localizado, deverá retornar -1;
	 */

	public Integer buscar(Integer valor) {
		Integer posicao = -1;
		for (int i = 0; i < tamanho; i++) {
			if (info[i] == valor) {
				return posicao = i;

			}
		}
		return posicao;
	}

	/*
	 * retirar(int): Deve retirar da lista o dado fornecido como argumento,
	 * deslocando todos os elementos das posições seguintes, uma posição para
	 * esquerda;
	 */
	public void retirar(Integer valor) {
		Integer position = -1;
		for (int i = 0; i < tamanho; i++) {
			if (info[i].equals(valor)) {
				position = i;
				break;
			}
		}
		if (position != -1) {
			for (int i = position; i < tamanho; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
	}

	/*
	 * liberar(): Deverá limpar a estrutura de dados de forma que o vetor info seja
	 * redimensionado novamente para que tenha capacidade de armazenar apenas 10
	 * elementos;
	 */

	public void liberar() {
		info = new Integer[10];
		tamanho = 0;
	}

	/*
	 * obterElemento(int): este método deverá retornar o número armazenado na
	 * posição fornecida como argumento. Caso o valor do parâmetro corresponda a uma
	 * posição inexistente ou não ocupada, este método deverá lançar a exceção
	 * IndexOutOfBoundsException.
	 * 
	 * FINALIZAR
	 */
	public Integer obterElemento(Integer posicao) throws IndexOutOfBoundsException {

		if (posicao < 0 || posicao > tamanho) {
			throw new IndexOutOfBoundsException("Posição inexistente: " + posicao);
		}
		return info[posicao];
		
	}

	public Boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	@Override
	public String toString() {
		String vetor = "";
		for (int i = 0; i < tamanho; i++) {
			vetor += info[i] + ",";
		}
		vetor = vetor.substring(0, vetor.length() -1);
		return vetor;

	}

}
