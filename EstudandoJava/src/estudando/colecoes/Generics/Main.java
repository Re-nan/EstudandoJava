package estudando.colecoes.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* A partir da veersão 5 do java foi introduzindo os GENERICS
 * Os generics permitemr estringir os tipos de dados em coleções, só sabemos que todas as coleções
 * do java são genéricas, elas trabalham só com tipo Object, quando você usa generics você consegue
 * restringir um tipo de dado para um mais específico, então você não precisa trabalhar apenas com
 * Object e sim com o tipo de dado que você especificou
 * 
 * VANTAGENS
 * 1 - Por trabalhar com o tipo de dado que você especificou, você evita o cast(que poderia ser feito
 * de forma errada) portando quando você obter um elemento da lista ele já vai vir no tipo que você 
 * está esperando e não no tipo Object
 * 
 * 2 - O generics faz a verificação de tipo de dado no momento da compilação, se você colocar um 
 * elemento na sua coleçção de um tipo que você não especificou, o código nem vai compilar
 * 
 * 3 - Iterar sobre listas com um tipo já definido é mais fácil do que com tipos Objects 
 * 
 * 
 * O Generics permite que você PARAMETRIZE os dados dentro das suas coleções, das suas listas
 * usar Generics é justamente restringir o tipo de dado que vai ter na lista
 */
public class Main {
	public static void main(String[] args) {
		
		/* definindo uma ArrayList especificando que vai ser uma lista de tipos String */
		List<String> lista = new ArrayList<String>();
		
		/* Também pode ser feito deste modo usando a notação que chamamos de diamond por se parecer
		 * com um diamante <> {?} 
		 */
		List<String> lista2 = new ArrayList<>();
		
		
		/* Atribuindo um tipo String na lista de Strings */
		lista.add("RENAN");
		lista.add("Bernardo");
		//lista.set(2,"ROGER"); o SET substitui o valor do indice pelo novo valor
		lista.add(2,"ROGER");
		lista.add(3, "Nick"); // o add poem o valor no indice e o que tava antes no indice ele empurra pra direita/baixo
		
		/* Da erro o java avisa em tempo de compilação que essa lista só pode receber tipos
		 * Strings e não de inteiros
		 * lista.add(2);
		 */
		
		/* Perceba que estou atribuindo este retorno a um tipo String sem precisar fazer cast
		 * de Object
		 */
		String nome = lista.get(0);
		
		
		/* Declarando um Iterator que itera sobre objs do tipo String, ao usar o iter.next() já
		 * vai ser retornado pra mim um tipo String, então não precisa fazer o cast para um tipo
		 * String
		 * 
		 * Iterator é um obj que você cria para iterar sobre os elementos da lista
		 */
		Iterator<String> iter = lista.iterator();
		while(iter.hasNext()){
			nome = iter.next();
		}
		
		/* foreach */
		for(String elemento : lista){
			nome = elemento;
			System.out.println(nome);
		}
		
		System.out.println();
		
		
		/* ORDERNANDO ELEMENTOS NA LISTA
		 * O java permite que os elementos de um Arraylist sejam ordenador de acordo com algum criterio
		 * No caso de listas a classe Collection tem o método estático sort que ordena as lista
		 * Collection.sort(lista)
		 * 
		 * A ordenação só funciona se os elementos da lista implementarem a interface java.lang.Comparable
		 * OU
		 * se for utilizado um Comparator (java.util.Comparator)
		 * 
		 * Em qualquer uma destas situações obrigam o programador implementar a regra de como estes elementos
		 * serão ordenador, então quando você implementa as interfaces Comparable ou Comparator, você deve
		 * sobreescrever o método indicando qual elemento deve vir antes do outro
		 */
		
		Collections.sort(lista); //ordenando pelo padrão
		for(String elemento : lista){
			nome = elemento;
			System.out.println(nome);
		}
		
		
		

	}

}
