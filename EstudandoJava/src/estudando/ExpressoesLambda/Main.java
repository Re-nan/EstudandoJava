package estudando.ExpressoesLambda;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* Expressões Lambda, vieram no Java 8. Deriva do conceito matemático cálculo lambda
 * - As expressões lambda trazem o java mais próximo do paradigma de programação funcional
 * - Assim como na POO, o foco é no obj e na troca de mensagens entre eles através de métodos
 * Já na Programação Funcional: o foco é na função, ela é soberana, é a peça chave.
 * - Expressões Lambda: é um conceito usado na programação funcional, uma expressão lambda
 * pode ser considerada como um obj na memória, a expressão possue parametros e processa 
 * informação retornando para o obj na memória, podendo ser referenciada por uma variavel
 * - Pode ser passada como parametro para métodos e utilizada como retorno
 * - Em java uma expressão lambda é utilizada em substituição a uma inner class anônima(é
 * uma classe SemNome que é subclasse de outra classe, ou uma classe que implementa uma
 * interface) com isso você tem um código mais simples e limpo
 */

public class Main {

	public static void main(String[] args) {

		/* Uma expressão lambda é representada com parametros na esquerda seguido do
		 * operador arrow -> e o corpo entre chaves (Parametros) -> {Corpo}
		 * 
		 * Posso ter zero ou mais parametros, tudo o que é antes da seta -> é o
		 * parametro Em uma expressão lambda o nome do método tanto faz, você não vê ele
		 */ 
		 
		// Exemplos de sintaxe, utilizando a interface criada Testable

		// Recebe um parametro e e retorna true se ele for maior que 10
		Testable t = e -> e > 10;

		// Se tiver um parametro só, o parentes é opcional
		Testable t2 = (e) -> (e > 10);

		// especificando o tipo de parametro explicitamente, obrigado uso dos parantes
		Testable t3 = (int e) -> e > 10;

		// Se tiver mais de uma intrução é obrigatorio o uso de chaves, pra uma só, é opcional
		Testable t4 = e -> {
			return e > 10;
		};
		
		
		// Exemplos de sintaxe, utilizando a interface criada Calculator
		
		// Preciso usar os parentes por ter mais de, retorna a multiplicação entre os parametros
		Calculator c = (x, y) -> x * y;
		
		// Por ter mais de uma instrução, faz o uso das chaves
		Calculator c2 = (x, y) -> {
			x = x + 1;
			y = y - 1;
			return x + y;
		};
		
		

		/* Uma expressão lambda pode ser atribuída a uma var de uma interface funcional
		 * Essa var funcional TEM QUE SER uma interface funcional
		 * 
		 * Interface Funcional, possuem 2 características: 
		 * - Precisa ser uma interface, não pode ser uma classe 
		 * - Só pode ter apenas um método, não existe com dois ou mais
		 */

		// Ex. de Interfaces Funcionais, pois possuem só 1 método

		Runnable r = () -> System.out.println("ABC");
		// Funciona pq o Run() não retorna nada e não recebe parametro
		  
		 
		Comparable<String> c3 = s -> 0;
		/* Funciona pq o comparaTo() recebe um parametro a ser comparado e retorna um
		 * número, no caso foi escolhido o zero
		 */ 
		
		Comparator<String> c4 = (s1, s2) -> s1.compareTo(s2);
		/* Funciona porque o método compareTo() recebe 2 parametros a serem comparados
		 */ 
		
		ActionListener l = e -> System.out.println("123");
		/* Funciona pq o actionPerformed recebe um evento como o do click de um botão e
		 * não retorna nada, essa interface é utilizada no swing
		 */ 
		 
		/* Perceba que o nome dos métodos estão implícitos pois só tem eles para serem
		 * executados dentro das interfaces
		 * 
		 * Quando trabalhos com interfaces funcionais, existe uma annotation que devemos
		 * conhecer, que é a @FunctionalInterface essa annotation define uma interface
		 * como uma interface funcional, não é obrigatória, mas se você a utilizar o
		 * compilador vai checar se a interface possui somente 1 método
		 */

		// Interfaces Funcionais que foram criadas no Java 8

		/* @FunctionalInterface 
		 * Predicate<T> 
		 * Possui o método test que recebe um tipo T,
		 * T é tipo a ser testado, e retorna um boolean com base em alguma condição
		 */
		
		Predicate<String> p = s -> s.length() > 5; 
		// Retorna true se o tamanho da String for maior que 5 ou falso se for menor

		/* @FunctionalInterface 
		 * Consumer<T> 
		 * Possui o método accept que recebe um tipo T, T é tipo a ser passado como
		 * parametro, processa/executa alguma coisa, e retorne void
		 */
		
		Consumer<Integer> c5 = i -> System.out.println(i);

		
		/* @FunctionalInterface 
		 * Function<T, R> 
		 * T é o tipo de origem, e R é o tipo a ser retornado Possui o método apply que
		 * recebe um tipo T que representa origem, e recebe um R que representa o tipo
		 * de retorno, e retorna o tipo R o mesmo que foi passado como parametro É uma
		 * interface de transformação, usada para tranformar uma informação em outra
		 */
		Function<String, Integer> f = s -> Integer.parseInt(s); // Tranforma uma String em um int

		
		/* Novas funcionalidades na Collection API
		 * Foi adicionado o método forEach(Consumer<T>) que recebe como parametro uma
		 * interface funcional Consumer que é uma interface feita para receber alguma
		 * coisa, processar, e não retornar nada
		 */
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		// exibe cada item da coleção
		lista.forEach(item -> System.out.print(item));
		
		System.out.println();
		
		/* Foi adicionado o método removeIf(Predicate<T>) que recebe como parametro uma
		 * interface funcional Predicate que que é uma interface feita para receber alguma
		 * coisa, processar, e retornar um boolean
		 * No caso, o método removeIf remove um item da lista que satisfaça uma condição
		 */

		// Removendo da lista todos os elementos que sejam par
		lista.removeIf(item -> (item % 2) == 0);
		lista.forEach(item -> System.out.print(item));
		
		System.out.println("\n");
		
		/* Referencias à métodos
		 * Permite converter métodos já existentes em expressões lambda
		 * Ex: as 2 formas fazem a mesma coisa
		 */
		lista.forEach(item -> System.out.print(item));
		System.out.println();
		lista.forEach(System.out::print);
		
		/* A novidade são os dois pontos, são chamados de double colon
		 * Eles fazem que os parametros da expressão lambda sejam repassados para o método
		 * Você deve interpretar esse codigo lista.forEach(System.out::print); como:
		 * pra cada item de lista chame o método println de System.out passando como parametro
		 * o mesmo parametro que a expressão lambda receber, ou seja 'item', é sempre o
		 * método depois dos ::, e a classe a qual esse método pertence antes do dos ::, e
		 * os :: seria o elemento em site a ser aplicado esse método
		 */
		
		System.out.println("\n");
		
		
		/* Closures
		 * Expressões lambda possuem a capcidade de acessarem variaveis defindas externamente
		 * ou seja são variaveis defindas externamente, fora dela. 
		 * Variaveis externas acessadas por expressões lambda são implicitamente definidas
		 * como final, ou seja não pode ter seu valor alterado
		 * 
		 * Porém se a váriavel externa for atributo de uma classe, o final implícito não se
		 * aplica, ai o valor a ser considerado é do momento da execução, no caso o que estiver
		 * dentro do método junto com a expressão lambda
		 */
		int mult = 2;
		Function<Integer, Integer> f2 = (x -> x * mult);
		System.out.println(f2.apply(6));
	}

}
