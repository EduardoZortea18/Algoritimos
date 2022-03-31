package atividade1;

public class RunProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEstatica estatica = new ListaEstatica();

		for (int i = 0; i < 5; i++) {
			estatica.inserir(i + 431);
		}

		System.out.println(estatica.getTamanho());

		System.out.println(estatica.estaVazia());

		estatica.retirar(432);

		System.out.println(estatica.toString());
		
		System.out.println(estatica.obterElemento(2));

	}

}
