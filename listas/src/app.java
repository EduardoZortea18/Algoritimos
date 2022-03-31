import iteratorDuplamenteEncadeado.ListaDupla;
import iteratorEncadeado.ListaEncadeada;
import iteratorEstatico.ListaEstatica;

public class app {

	public static void main(String[] args) {
		ListaEstatica<Integer> listaEstatica = new ListaEstatica<Integer>();
		listaEstatica.inserir(1);
		listaEstatica.inserir(2);
		listaEstatica.inserir(3);
		listaEstatica.inserir(4);
		listaEstatica.inserir(5);
		
		System.out.println("Estatica");
		
		for(Integer num : listaEstatica){
			System.out.println(num);
		}
		
		ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<Integer>();
		listaEncadeada.inserir(1);
		listaEncadeada.inserir(2);
		listaEncadeada.inserir(3);
		listaEncadeada.inserir(4);
		listaEncadeada.inserir(5);
		
		System.out.println("Encadeada");
		
		for(Integer num : listaEncadeada){
			System.out.println(num);
		}
		
		ListaDupla<Integer> listaDupla = new ListaDupla<Integer>();
		listaDupla.inserir(1);
		listaDupla.inserir(2);
		listaDupla.inserir(3);
		listaDupla.inserir(4);
		listaDupla.inserir(5);
		
		System.out.println("Duplamente Encadeada");
		
		for(Integer num : listaDupla){
			System.out.println(num);
		}
	}

}
