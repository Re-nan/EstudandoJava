package estudando.colecoes.Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* Conjuntos funcionam de forma semelhante a da Matemática
 * 
 * Conjuntos não permitem elementos duplicados como acontecem nas listas, se conter
 * elementos duplicado na seu conjunto ele vai sempre mostrar um só
 * 
 * A ordem dos elementos em um conjuntos pode não ser a mesma ordem da inserção, ou seja
 * o que tá no conjunto ta embaralhado, não existe uma relação direta com a ordem que eu
 * insiro com a ordem que eu varro para ler estes elementos
 * 
 * A primeira implementação de conjuntos que vamos ver é o HashSet
 * O HashSet é uma implementação de conjunto que não possui nenhuma garantia com relação à ordem
 * dos elementos, então com ele você não pode garantir nada com relação a ordem dos elementos
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {

		/* HASHSET */

		/* Criando um Conjunto chamando conjunto como se fosse um HashSet */
		Set conjunto = new HashSet(); //Quando não defino o tipo na criação ele fica como Object
		conjunto.add("R");
		conjunto.add("G");
		conjunto.add("C");
		conjunto.add("F");
		conjunto.add("F");
		
		/* Não exibe na ordem alfabética e não mostra elemento que foram duplicado */
		for(Object elemento : conjunto){
			System.out.println(elemento); //exibe R C F G
		}
		
		
		
		System.out.println();
		
		
		
		/* linkedHashSetSort
		 * Garante que ao iterar sobre os elementos, a ordem da iteração será a mesma da inserção
		 */
		Set conjunto2 = new LinkedHashSet(); 
		conjunto2.add("R");
		conjunto2.add("G");
		conjunto2.add("C");
		conjunto2.add("F");
		conjunto2.add("F");
		
		
		
		/* Exibe na mesma ordem de inserção, mas por ser um CONJUNTO também não retorna
		 * elementos duplicados
		 */
		for(Object elemento : conjunto2){
			System.out.println(elemento); //exibe R C F G
		}
		
		
		
		System.out.println();
		
		
		
		/* TreeSet
		 * Nele os elementos são ordenados por algum critério no momento em que são inseridos no
		 * conjunto, quando insere o elemento já vai pra posição correta
		 * Também faz uso do critério com Comparable ou Comparator
		 */
		Set conjunto3 = new TreeSet();
		conjunto3.add("R");
		conjunto3.add("G");
		conjunto3.add("C");
		conjunto3.add("F");
		conjunto3.add("F");
		
		/* Por padrão se não definfirmos um critério, ele insere na ordem alfabética, mas por ser
		 * um CONJUNTO também não retorna elementos duplicados
		 * 
		 * A classe String implementa Comparable então por padrão ela ordena na ordem alfabética
		 */
		for(Object elemento : conjunto3){
			System.out.println(elemento); //exibe C F G R
		}

		
	}
	
}
