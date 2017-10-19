package estudando.colecoes.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* A partir da veers�o 5 do java foi introduzindo os GENERICS
 * Os generics permitemr restringir os tipos de dados em cole��es, s� sabemos que todas as cole��es
 * do java s�o gen�ricas, elas trabalham s� com tipo Object, quando voc� usa generics voc� consegue
 * restringir um tipo de dado para um mais espec�fico, ent�o voc� n�o precisa trabalhar apenas com
 * Object e sim com o tipo de dado que voc� especificou
 * 
 * VANTAGENS
 * 1 - Por trabalhar com o tipo de dado que voc� especificou, voc� evita o cast(que poderia ser feito
 * de forma errada) portando quando voc� obter um elemento da lista ele j� vai vir no tipo que voc� 
 * est� esperando e n�o no tipo Object
 * 
 * 2 - O generics faz a verifica��o de tipo de dado no momento da compila��o, se voc� colocar um 
 * elemento na sua cole���o de um tipo que voc� n�o especificou, o c�digo nem vai compilar
 * 
 * 3 - Iterar sobre listas com um tipo j� definido � mais f�cil do que com tipos Objects 
 * 
 * 
 * O Generics permite que voc� PARAMETRIZE os dados dentro das suas cole��es, das suas listas
 * usar Generics � justamente restringir o tipo de dado que vai ter na lista
 */
public class Main {
	public static void main(String[] args) {
		
		/* definindo uma ArrayList especificando que vai ser uma lista de tipos String */
		List<String> lista = new ArrayList<String>();
		
		/* Tamb�m pode ser feito deste modo usando a nota��o que chamamos de diamond por se parecer
		 * com um diamante <> {?} 
		 */
		List<String> lista2 = new ArrayList<>();
		
		
		/* Atribuindo um tipo String na lista de Strings */
		lista.add("RENAN");
		lista.add("Bernardo");
		//lista.set(2,"ROGER"); o SET substitui o valor do indice pelo novo valor
		lista.add(2,"ROGER");
		lista.add(3, "Nick"); // o add poem o valor no indice, e o que tava antes no indice ele empurra pra direita/baixo
		
		/* Da erro o java avisa em tempo de compila��o que essa lista s� pode receber tipos
		 * Strings e n�o de inteiros
		 * lista.add(2);
		 */
		
		/* Perceba que estou atribuindo este retorno a um tipo String sem precisar fazer cast
		 * de Object
		 */
		String nome = lista.get(0);
		
		
		/* Declarando um Iterator que itera sobre objs do tipo String, ao usar o iter.next() j�
		 * vai ser retornado pra mim um tipo String, ent�o n�o precisa fazer o cast para um tipo
		 * String
		 * 
		 * Iterator � um obj que voc� cria para iterar sobre os elementos da lista
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
		 * O java permite que os elementos de um Arraylist sejam ordenados de acordo com algum criterio
		 * No caso de listas a classe Collection tem o m�todo est�tico sort que ordena as lista
		 * Collection.sort(lista)
		 * 
		 * A ordena��o s� funciona se os elementos da lista implementarem a interface java.lang.Comparable
		 * OU
		 * se for utilizado um Comparator (java.util.Comparator)
		 * 
		 * Em qualquer uma destas situa��es obrigam o programador implementar a regra de como estes elementos
		 * ser�o ordenador, ent�o quando voc� implementa as interfaces Comparable ou Comparator, voc� deve
		 * sobreescrever o m�todo indicando qual elemento deve vir antes do outro
		 */
		
		Collections.sort(lista); //ordenando pelo padr�o
		for(String elemento : lista){
			nome = elemento;
			System.out.println(nome);
		}
		
		
		

	}

}
