package estudando.colecoes.Generics5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Bebida> bebidas = new ArrayList<Bebida>();
		
		bebidas.add(new Cafe());
		bebidas.add(new Cha());
		
		System.out.println("*** prepararBebidas(bebidas) ***");
		prepararBebidas(bebidas);
		
		
		System.out.println("\n*** prepararBebidas(chas) ***");
		List<Cha> chas = new ArrayList<Cha>();
		chas.add(new Cha());
		prepararBebidas(chas);
		
		System.out.println("\n*** prepararBebidas(cafes) ***");
		List<Cafe> cafes = new ArrayList<Cafe>();
		cafes.add(new Cafe());
		prepararBebidas(cafes);
		
		
		System.out.println("\n*** prepararBebidas2(chas) ***");
		prepararBebidas2(chas);
		
		//System.out.println("\n*** prepararBebidas2(bebidas) ***");
		//prepararBebidas2(bebidas); Erro porque na lista bebidas tem Cafe
		
		System.out.println("\n*** prepararBebidas3(chas) ***");
		prepararBebidas3(chas);
	}
	
	
	
	/* Trabalhando com WILDCARD(curinga)
	 * Foram introduzidos para deixar em aberto o tipo parametrizado, pois no Generics voc� s�
	 * pode atribuir um tipo ao outro se o tipo for o mesmo, o Wildcard veio para tirar essa limita��o
	 * Ele � representado por um ?
	 * 
	 * Ex. O metodo exige como parametro uma collection de qualquer tipo
	 * 
	 * public void imprimir(Collection<?> c) {
	 * 		for(Object o : c){
	 * 			System.out.println(o);
	 * 		}
	 * }
	 * 
	 * se eu deixasse String no lugar do ? eu s� poderia chamar esse m�todo passando uma collection
	 * de String, iria engessar o m�todo, j� com o wildcard ? eu assumo o tipo de dado que for passado
	 * 
	 */

	
	/* Aceita qualquer dado como parametro desde que ele seja subclasse(herde) de Bebida 
	 * ou a pr�pria classe Bebida. No caso como Bebida � um interface o parametro exige tipos
	 * que implementem a interface Bebida
	 * Quando a palavra extends � utilizado voc� n�o conseguira colocar elementos dentro da
	 * cole��o, o java n�o deixa por ser uma inser��o que n�o � segura, afinal ele n�o sabe o
	 * tipo de dado do novo elemento que ser� adicionado em uma lista que j� est� tipada
	 * 
	 */
	private static void prepararBebidas(List<? extends Bebida> bebidas) {
		//bebidas.add(new Cha()); //Erro afinal o Java n�o sabe qual tipo ser� adicionado na lista
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}
	
	/* Aceita qualquer dado como parametro desde que ele seja uma superclasse(m�e) ou esteja acima 
	 * do tipo parametrizado no caso Bebida, Object, ou o pr�prio Cha
	 * Quando voc� utiliza voc� pode adicionar elementos a cole��o, por�m s� elementos que sejam do
	 * mesmo tipo do argumento, no caso o Cha, pois esse ele tem a certeza de que � garantido
	 */
	private static void prepararBebidas2(List<? super Cha> bebidas) {
		//bebidas.add(new Cha()); Permite usar pois  Cha � garantido

		for (Object obj : bebidas) {
			Cha cha = (Cha) obj; //Cuidado ao especificar um tipo no cast
			cha.preparar();
		}
		
	}
	/* Quando voc� tem um wildcard sozinho � como se o seu metodo fosse
	 * private static void prepararBebidas3(List<? extends Object> bebidas) {...}
	 * 
	 */
	private static void prepararBebidas3(List<?> bebidas) {
		for (Object obj : bebidas) {
			Cha cha = (Cha) obj; //Cuidado ao especificar um tipo no cast
			cha.preparar();
		}
	}
	
}
