package estudando.colecoes.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* É uma API que possui um conjunto de classes e interfaces para facilitar o trabalho com
 * coleções de dados
 * 
 * Com ela você pode criar listas com elementos duplicados, pode ordernar os elementros dentro
 * da lista como você bem entender
 * 
 * Todas as COLEÇÕES do java trabalham somente com tipos GENERICOS, isso quer dizer que elas
 * trabalham internamente com elementos do tipo OBJECT, portando quando é colocado um elemento
 * dentro da coleção, ele assume o tipo Object e quando ele é retornado da coleção também retorna
 * como Object
 * 
 * Por ArrayList trabalharar com elementos GENERICOS a lista pode conter qualquer valor,
 * seja tipo primitivo int, double, char, ou referencia String, Pessoa, Animal 
 * 
 * A lista cresce conforme o necessário, diferentemente do Array
 * 
 * 
 * 
 */

public class Main {
	public static void main(String[] args) {
		
		/* List no java é uma interface, existem diversas classes no java que implementam esta
		 * interface. Como List é uma interface e ArrayList implementa está interface então eu
		 * posso atribuir um obj ArrayList para uma variavel List(estou usando polimorfismo)
		 */ 
		
		/* Criando sem parametrização dos tipos você está indicando que ele será então do tipo
		 * Object e sendo assim ao retirar um elemento dessa lista você terá que fazer cast
		 */
		List lista = new ArrayList();
		
		
		/* o métdo add() permite adicionar um elemento ao fim da lista ou no meio como desejarmos
		 * o indice começa no zero 
		 */
		lista.add("Renan"); //indice 0
		lista.add("Roger"); //indice 2
		lista.add(1,"Bernardo"); //indice 1
		lista.add(19);
		lista.add('R');
		
		for(Object elemento : lista){
			System.out.println(elemento);
		}
		System.out.println();
		
		System.out.println("Tamanho da lista: " + lista.size()); //Retorna o tamanho da lista
		System.out.println("Elemento: " + lista.get(4)); //Retorna o elemento do indice que eu pedir
		System.out.println("indice: " + lista.indexOf('R')); //Retorna o indice do elemento que eu passar
		
		System.out.println();
		
		/* Para percorrer uma lista além foreach podemos usar também o que chamamos de ITERATOR
		 * A interface List tem o metodo Iterator que retorna um obj da interface Iteratore, lembrando que
		 * List é filho de Iterator, ou seja Iterator é super classe de List, uma interface que implementa outra
		 * 
		 * Como ArrayList implementa a interface List que por sua via implementa a interface Iterator um
		 * obj do tipo ArrayList tem acesso ao método Iterator que vem lá da interface Iterator
		 * 
		 * o metodo hasNext() checa se ainda existem elementos na sua lista ou não, ele retorna um boolean
		 * o metodo next() faz com que ele se mova para o próximo elemento da lista e retorne para quem fez a
		 * chamada do metodo
		 * 
		 */
		
		/* por estar trabalhando com vários tipos na mesma lista eu usando Object, mas se fosse uma lista de
		 * Strings eu poderia usar Strings, ou int se fosse uma lista só de números
		 */
		Iterator iter = lista.iterator();
		while(iter.hasNext()){
			Object nome =  iter.next();
			System.out.println(nome);
		}
		
		
		
	}
}