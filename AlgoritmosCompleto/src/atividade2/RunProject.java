package atividade2;

public class RunProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaEstatica<Integer> estatica = new ListaEstatica<>();

		for (int i = 0; i < 7; i++) {
			estatica.inserir(i + 2);
		}

		System.out.println(estatica.toString());

		estatica.inverter();
		
		System.out.println(estatica.toString());

	}

}
