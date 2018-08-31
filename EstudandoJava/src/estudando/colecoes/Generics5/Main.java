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
	 * Foram introduzidos para deixar em aberto o tipo parametrizado, pois no Generics você só
	 * pode atribuir um tipo ao outro se o tipo for o mesmo, o Wildcard veio para tirar essa limitação
	 * Ele é representado por um ?
	 * 
	 * Ex. O metodo exige como parametro uma collection de qualquer tipo
	 * 
	 * public void imprimir(Collection<?> c) {
	 * 		for(Object o : c){
	 * 			System.out.println(o);
	 * 		}
	 * }
	 * 
	 * se eu deixasse String no lugar do ? eu só poderia chamar esse método passando uma collection
	 * de String, iria engessar o método, já com o wildcard ? eu assumo o tipo de dado que for passado
	 * 
	 */

	
	/* Aceita qualquer dado como parametro desde que ele seja subclasse(herde) de Bebida 
	 * ou a própria classe Bebida. No caso como Bebida é um interface o parametro exige tipos
	 * que implementem a interface Bebida
	 * Quando a palavra extends é utilizado você não conseguira colocar elementos dentro da
	 * coleção, o java não deixa por ser uma inserção que não é segura, afinal ele não sabe o
	 * tipo de dado do novo elemento que será adicionado em uma lista que já está tipada
	 * 
	 */
	private static void prepararBebidas(List<? extends Bebida> bebidas) {
		//bebidas.add(new Cha()); //Erro afinal o Java não sabe qual tipo será adicionado na lista
		for (Bebida b : bebidas) {
			b.preparar();
		}
	}
	
	/* Aceita qualquer dado como parametro desde que ele seja uma superclasse(mãe) ou esteja acima 
	 * do tipo parametrizado no caso Bebida, Object, ou o próprio Cha
	 * Quando você utiliza você pode adicionar elementos a coleção, porém só elementos que sejam do
	 * mesmo tipo do argumento, no caso o Cha, pois esse ele tem a certeza de que é garantido
	 */
	private static void prepararBebidas2(List<? super Cha> bebidas) {
		//bebidas.add(new Cha()); Permite usar pois  Cha é garantido

		for (Object obj : bebidas) {
			Cha cha = (Cha) obj; //Cuidado ao especificar um tipo no cast
			cha.preparar();
		}
		
	}
	/* Quando você tem um wildcard sozinho é como se o seu metodo fosse
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
