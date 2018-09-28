package estudando.ExpressoesLambda3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Utilizando express�es lambda na Collection API
 * 
 */

public class Main {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(4);
		lista.add(5);
		lista.add(2);
		lista.add(1);
		lista.add(3);
		
		// Iterando por foreach
		for(int item : lista) {
			System.out.print(item);
		}
		
		System.out.println();
		
		/* Iterando por expressoes lambda
		 * O m�todo forEach() serve para varrer os elementos de uma lista, o forEach() recebe uma
		 * interface Consumer como parametro, essa interface recebe um tipo parametrizado e n�o
		 * retorna nada, onde 'e' � cada item da lista
		 */
		lista.forEach(e -> System.out.print(e));
		
		System.out.println("\n");
		
		/* Ordenando um List pela classe Collections
		 * sort() recebe 2 parametros, uma lista e um Comparador, se omitido usa o default
		 */
		Collections.sort(lista);
		for(int item : lista) {
			System.out.print(item);
		}
		
		System.out.println();
		
		/* Ordenando um List por expressoes lambda
		 * O m�todo sort() serve para ordenar os elementos de uma lista, o sort() recebe uma
		 * interface Comparator como parametro, como a lista � de Integer e a classe Integer
		 * implementa a interface Comparable eu posso chamar o m�todo compareTo()
		 */
	
		lista.sort((x, y) -> x.compareTo(y)); //Ordem descrecente lista.sort((x, y) -> -x.compareTo(y)); basta negar
		lista.forEach(e -> System.out.print(e));
		
		System.out.println("\n");
		
		/* Substituindo todos os elementos de uma cole��o
		 * O m�todo ReplaceAll() substitui todos os elementos de uma cole��o de acordo com
		 * algum crit�rio que voc� define, esse crit�rio � definido atrav�s de um UnaryOperator
		 * A interface Function consegue receber dados de um tipo e tranformar eles em outro tipo,
		 * recebe uma informa��o e transforma em outra informa��o. A Interface UnaryOperator herda
		 * da interface Function, s� que a UnaryOperator transforma uma informa��o em outra, mas 
		 * mant�m o tipo 
		 */
		
		// Susbtituindo todos os elementos da lista por ser valor * 2
		lista.replaceAll(e -> e * 2);
		lista.forEach(e -> System.out.print(e));
		
		System.out.println("\n");
		
		/* Removendo elementos de uma cole��o
		 * O m�todo removeIf() remove elementos que atendam a um determinador crit�rio, utiliza 
		 * a interface funcional Predicate que tem um m�todo que recebe um parametro e retorna um
		 * boolean
		 */
		lista.removeIf(e -> e > 5); // removendo todos os numeros que sejam maior que 6
		lista.forEach(e -> System.out.print(e));
		
	}

}
