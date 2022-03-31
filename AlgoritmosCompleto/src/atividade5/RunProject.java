package atividade5;

public class RunProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaEncadeadaForEach<Integer> each = new ListaEncadeadaForEach<Integer>();
		
		each.inserir(10);
		each.inserir(50);
		each.inserir(70);
		each.inserir(678);
		
//		System.out.println(each.toString());

		for(Integer a : each) {
			System.out.println(a);
		}
		
	}

}
