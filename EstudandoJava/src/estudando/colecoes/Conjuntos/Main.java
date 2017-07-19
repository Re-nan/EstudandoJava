package estudando.colecoes.Conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

/* Conjuntos funcionam de forma semelhante a da Matem�tica
 * 
 * Conjuntos n�o permitem elementos duplicados como acontecem nas listas, se conter
 * elementos duplicado na seu conjunto ele vai sempre mostrar um s�
 * 
 * A ordem dos elementos em um conjuntos pode n�o ser a mesma ordem da inser��o, ou seja
 * o que t� no conjunto ta embaralhado, n�o existe uma rela��o direta com a ordem que eu
 * insiro com a ordem que eu varro para ler estes elementos
 * 
 * A primeira implementa��o de conjuntos que vamos ver � o HashSet
 * O HashSet � uma implementa��o de conjunto que n�o possui nenhuma garantia com rela��o � ordem
 * dos elementos, ent�o com ele voc� n�o pode garantir nada com rela��o a ordem dos elementos
 * 
 * 
 */
public class Main {
	public static void main(String[] args) {

		/* HASHSET */

		/* Criando um Conjunto chamando conjunto como se fosse um HashSet */
		Set conjunto = new HashSet(); //Quando n�o defino o tipo na cria��o ele fica como Object
		conjunto.add("R");
		conjunto.add("G");
		conjunto.add("C");
		conjunto.add("F");
		conjunto.add("F");
		
		/* N�o exibe na ordem alfab�tica e n�o mostra elemento que foram duplicado */
		for(Object elemento : conjunto){
			System.out.println(elemento); //exibe R C F G
		}
		
		
		
		System.out.println();
		
		
		
		/* linkedHashSetSort
		 * Garante que ao iterar sobre os elementos, a ordem da itera��o ser� a mesma da inser��o
		 */
		Set conjunto2 = new LinkedHashSet(); 
		conjunto2.add("R");
		conjunto2.add("G");
		conjunto2.add("C");
		conjunto2.add("F");
		conjunto2.add("F");
		
		
		
		/* Exibe na mesma ordem de inser��o, mas por ser um CONJUNTO tamb�m n�o retorna
		 * elementos duplicados
		 */
		for(Object elemento : conjunto2){
			System.out.println(elemento); //exibe R C F G
		}
		
		
		
		System.out.println();
		
		
		
		/* TreeSet
		 * Nele os elementos s�o ordenados por algum crit�rio no momento em que s�o inseridos no
		 * conjunto, quando insere o elemento j� vai pra posi��o correta
		 * Tamb�s faz uso do crit�rio com Comparable ou Comparator
		 */
		Set conjunto3 = new TreeSet();
		conjunto3.add("R");
		conjunto3.add("G");
		conjunto3.add("C");
		conjunto3.add("F");
		conjunto3.add("F");
		
		/* Por padr�o se n�o definfirmos um crit�rio, ele insere na ordem alfab�tica, mas por ser
		 * um CONJUNTO tamb�m n�o retorna elementos duplicados
		 * 
		 * A classe String implmenta Comparable ent�o por padr�o ela ordena na ordem alfab�tica
		 */
		for(Object elemento : conjunto3){
			System.out.println(elemento); //exibe C F G R
		}

		
	}
	
}
