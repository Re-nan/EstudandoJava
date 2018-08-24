package estudando.colecoes.Generics4;

public class Main {

	public static void main(String[] args) {
		
		// Criando uma Lista pela Classe NÃO PARAMETRIZADA, assumindo Object
		Lista listaObject = new Lista();
		
		listaObject.adicionar("a");
		listaObject.adicionar("b");
		listaObject.adicionar("c");
		
		String s1 = (String)listaObject.remover();
		String s2 = (String)listaObject.remover();
		String s3 = (String)listaObject.remover();
		
		System.out.println(s1 + ", " + s2 + ", " + s3);
		
		
		
		
		// Criando uma Lista de String pela Classe PARAMETRIZADA
		Lista<String> listaString = new Lista<>();
		
		listaString.adicionar("a");
		listaString.adicionar("b");
		listaString.adicionar("c");
		
		s1 = listaString.remover();
		s2 = listaString.remover();
		s3 = listaString.remover();
		
		System.out.println(s1 + ", " + s2 + ", " + s3);
		
		
		
		
		// Criando uma Lista de Integer(int) pela Classe PARAMETRIZADA
		Lista<Integer> listaInt = new Lista<>();
		
		listaInt.adicionar(10);
		listaInt.adicionar(15);
		listaInt.adicionar(20);
		
		int i1 = listaInt.remover();
		int i2 = listaInt.remover();
		int i3 = listaInt.remover();
		
		System.out.println(i1 + ", " + i2 + ", " + i3);
	}
}
