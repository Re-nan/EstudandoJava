package estudando.colecoes.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* � uma API que possui um conjunto de classes e interfaces para facilitar o trabalho com
 * cole��es de dados
 * 
 * Com ela voc� pode criar listas com elementos duplicados, pode ordernar os elementros dentro
 * da lista como voc� bem entender
 * 
 * Todas as COLE��ES do java trabalham somente com tipos GENERICOS, isso quer dizer que elas
 * trabalham internamente com elementos do tipo OBJECT, portando quando � colocado um elemento
 * dentro da cole��o, ele assume o tipo Object e quando ele � retornado da cole��o tamb�m retorna
 * como Object
 * 
 * Por ArrayList trabalharar com elementos GENERICOS a lista pode conter qualquer valor,
 * seja tipo primitivo int, double, char, ou referencia String, Pessoa, Animal 
 * 
 * A lista cresce conforme o necess�rio, diferentemente do Array
 * 
 */

public class Main {
	public static void main(String[] args) {
		
		/* List no java � uma interface, existem diversas classes no java que implementam esta
		 * interface. Como List � uma interface e ArrayList implementa est� interface ent�o eu
		 * posso atribuir um obj ArrayList para uma variavel List(estou usando polimorfismo)
		 */ 
		
		/* Criando sem parametriza��o dos tipos voc� est� indicando que ele ser� ent�o do tipo
		 * Object e sendo assim ao retirar um elemento dessa lista voc� ter� que fazer cast
		 */
		List lista = new ArrayList();
		
		
		/* o m�tdo add() permite adicionar um elemento ao fim da lista ou no meio como desejarmos
		 * o indice come�a no zero 
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
		
		/* Para percorrer uma lista al�m do foreach podemos usar tamb�m o que chamamos de ITERATOR
		 * A interface List tem o metodo Iterator que retorna um obj da interface Iterator, lembrando que
		 * List � filho de Iterator, ou seja Iterator � super classe de List, uma interface que implementa outra
		 * 
		 * Como ArrayList implementa a interface List que por sua via implementa a interface Iterator um
		 * obj do tipo ArrayList tem acesso ao m�todo Iterator que vem l� da interface Iterator
		 * 
		 * o metodo hasNext() checa se ainda existem elementos na sua lista ou n�o, ele retorna um boolean
		 * o metodo next() faz com que ele se mova para o pr�ximo elemento da lista e retorne para quem fez a
		 * chamada do metodo
		 * 
		 */
		
		/* por estar trabalhando com v�rios tipos na mesma lista e usando Object, mas se fosse uma lista de
		 * Strings eu poderia usar Strings, ou int se fosse uma lista s� de n�meros
		 */
		Iterator iter = lista.iterator();
		while(iter.hasNext()){
			Object nome =  iter.next();
			System.out.println(nome);
		}
		
		
		
	}
}