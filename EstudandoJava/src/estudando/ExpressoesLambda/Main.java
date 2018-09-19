package estudando.ExpressoesLambda;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* Express�es Lambda, vieram no Java 8. Deriva do conceito matem�tico c�lculo lambda
 * - As express�es lambda trazem o java mais pr�ximo do paradigma de programa��o funcional
 * - Assim como na POO, o foco � no obj e na troca de mensagens entre eles atrav�s de m�todos
 * J� na Programa��o Funcional: o foco � na fun��o, ela � soberana, � a pe�a chave.
 * - Express�es Lambda: � um conceito usado na programa��o funcional, uma express�o lambda
 * pode ser considerada como um obj na mem�ria, a express�o possue parametros e processa 
 * informa��o retornando para o obj na mem�ria, podendo ser referenciada por uma variavel
 * - Pode ser passada como parametro para m�todos e utilizada como retorno
 * - Em java uma express�o lambda � utilizada em substitui��o a uma inner class an�nima(�
 * uma classe SemNome que � subclasse de outra classe, ou uma classe que implementa uma
 * interface) com isso voc� tem um c�digo mais simples e limpo
 */

public class Main {

	public static void main(String[] args) {

		/* Uma express�o lambda � representada com parametros na esquerda seguido do
		 * operador arrow -> e o corpo entre chaves (Parametros) -> {Corpo}
		 * 
		 * Posso ter zero ou mais parametros, tudo o que � antes da seta -> � o
		 * parametro Em uma express�o lambda o nome do m�todo tanto faz, voc� n�o v� ele
		 */ 
		 
		// Exemplos de sintaxe, utilizando a interface criada Testable

		// Recebe um parametro e e retorna true se ele for maior que 10
		Testable t = e -> e > 10;

		// Se tiver um parametro s�, o parentes � opcional
		Testable t2 = (e) -> (e > 10);

		// especificando o tipo de parametro explicitamente, obrigado uso dos parantes
		Testable t3 = (int e) -> e > 10;

		// Se tiver mais de uma intru��o � obrigatorio o uso de chaves, pra uma s�, � opcional
		Testable t4 = e -> {
			return e > 10;
		};
		
		
		// Exemplos de sintaxe, utilizando a interface criada Calculator
		
		// Preciso usar os parentes por ter mais de, retorna a multiplica��o entre os parametros
		Calculator c = (x, y) -> x * y;
		
		// Por ter mais de uma instru��o, faz o uso das chaves
		Calculator c2 = (x, y) -> {
			x = x + 1;
			y = y - 1;
			return x + y;
		};
		
		

		/* Uma express�o lambda pode ser atribu�da a uma var de uma interface funcional
		 * Essa var funcional TEM QUE SER uma interface funcional
		 * 
		 * Interface Funcional, possuem 2 caracter�sticas: 
		 * - Precisa ser uma interface, n�o pode ser uma classe 
		 * - S� pode ter apenas um m�todo, n�o existe com dois ou mais
		 */

		// Ex. de Interfaces Funcionais, pois possuem s� 1 m�todo

		Runnable r = () -> System.out.println("ABC");
		// Funciona pq o Run() n�o retorna nada e n�o recebe parametro
		  
		 
		Comparable<String> c3 = s -> 0;
		/* Funciona pq o comparaTo() recebe um parametro a ser comparado e retorna um
		 * n�mero, no caso foi escolhido o zero
		 */ 
		
		Comparator<String> c4 = (s1, s2) -> s1.compareTo(s2);
		/* Funciona porque o m�todo compareTo() recebe 2 parametros a serem comparados
		 */ 
		
		ActionListener l = e -> System.out.println("123");
		/* Funciona pq o actionPerformed recebe um evento como o do click de um bot�o e
		 * n�o retorna nada, essa interface � utilizada no swing
		 */ 
		 
		/* Perceba que o nome dos m�todos est�o impl�citos pois s� tem eles para serem
		 * executados dentro das interfaces
		 * 
		 * Quando trabalhos com interfaces funcionais, existe uma annotation que devemos
		 * conhecer, que � a @FunctionalInterface essa annotation define uma interface
		 * como uma interface funcional, n�o � obrigat�ria, mas se voc� a utilizar o
		 * compilador vai checar se a interface possui somente 1 m�todo
		 */

		// Interfaces Funcionais que foram criadas no Java 8

		/* @FunctionalInterface 
		 * Predicate<T> 
		 * Possui o m�todo test que recebe um tipo T,
		 * T � tipo a ser testado, e retorna um boolean com base em alguma condi��o
		 */
		
		Predicate<String> p = s -> s.length() > 5; 
		// Retorna true se o tamanho da String for maior que 5 ou falso se for menor

		/* @FunctionalInterface 
		 * Consumer<T> 
		 * Possui o m�todo accept que recebe um tipo T, T � tipo a ser passado como
		 * parametro, processa/executa alguma coisa, e retorne void
		 */
		
		Consumer<Integer> c5 = i -> System.out.println(i);

		
		/* @FunctionalInterface 
		 * Function<T, R> 
		 * T � o tipo de origem, e R � o tipo a ser retornado Possui o m�todo apply que
		 * recebe um tipo T que representa origem, e recebe um R que representa o tipo
		 * de retorno, e retorna o tipo R o mesmo que foi passado como parametro � uma
		 * interface de transforma��o, usada para tranformar uma informa��o em outra
		 */
		Function<String, Integer> f = s -> Integer.parseInt(s); // Tranforma uma String em um int

		
		/* Novas funcionalidades na Collection API
		 * Foi adicionado o m�todo forEach(Consumer<T>) que recebe como parametro uma
		 * interface funcional Consumer que � uma interface feita para receber alguma
		 * coisa, processar, e n�o retornar nada
		 */
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		// exibe cada item da cole��o
		lista.forEach(item -> System.out.print(item));
		
		System.out.println();
		
		/* Foi adicionado o m�todo removeIf(Predicate<T>) que recebe como parametro uma
		 * interface funcional Predicate que que � uma interface feita para receber alguma
		 * coisa, processar, e retornar um boolean
		 * No caso, o m�todo removeIf remove um item da lista que satisfa�a uma condi��o
		 */

		// Removendo da lista todos os elementos que sejam par
		lista.removeIf(item -> (item % 2) == 0);
		lista.forEach(item -> System.out.print(item));
		
		System.out.println("\n");
		
		/* Referencias � m�todos
		 * Permite converter m�todos j� existentes em express�es lambda
		 * Ex: as 2 formas fazem a mesma coisa
		 */
		lista.forEach(item -> System.out.print(item));
		System.out.println();
		lista.forEach(System.out::print);
		
		/* A novidade s�o os dois pontos, s�o chamados de double colon
		 * Eles fazem que os parametros da express�o lambda sejam repassados para o m�todo
		 * Voc� deve interpretar esse codigo lista.forEach(System.out::print); como:
		 * pra cada item de lista chame o m�todo println de System.out passando como parametro
		 * o mesmo parametro que a express�o lambda receber, ou seja 'item', � sempre o
		 * m�todo depois dos ::, e a classe a qual esse m�todo pertence antes do dos ::, e
		 * os :: seria o elemento em site a ser aplicado esse m�todo
		 */
		
		System.out.println("\n");
		
		
		/* Closures
		 * Express�es lambda possuem a capcidade de acessarem variaveis defindas externamente
		 * ou seja s�o variaveis defindas externamente, fora dela. 
		 * Variaveis externas acessadas por express�es lambda s�o implicitamente definidas
		 * como final, ou seja n�o pode ter seu valor alterado
		 * 
		 * Por�m se a v�riavel externa for atributo de uma classe, o final impl�cito n�o se
		 * aplica, ai o valor a ser considerado � do momento da execu��o, no caso o que estiver
		 * dentro do m�todo junto com a express�o lambda
		 */
		int mult = 2;
		Function<Integer, Integer> f2 = (x -> x * mult);
		System.out.println(f2.apply(6));
	}

}
