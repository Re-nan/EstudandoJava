package estudando.colecoes.Mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* MAPAS s�o utilizados quando precisamos mapear um chave valor, e chaves e valores de mapa podem
 * ser de qualquer tipo de obj
 * 
 * No java os mapas s�o representados pela interface Map de  java.util.Map
 * 
 */
public class Main {
	public static void main(String[] args) {

		/* HashMap
		 * A sua principal caracter�stica � a de que ele n�o possui nenhuma garantia com a rela��o
		 * � ordem das chaves do mapa, � muito similar ao conjunto HashSet
		 * 
		 * os m�todos put() e get() podem ser usados para adicionar e obter elementos do mapa
		 * respectivamente
		 * 
		 * A interface java.util.Map possui m�todos para retornar sua lista de chaves e de valores,
		 * e at� de cada entrada chave/valor do mapa
		 * 
		 * Lembrando que no java eu n�o posso criar cole��es com tipos primitivos, os Generics n�o
		 * trabalham com tipos primitivos, apenas com tipos referencias(classes e interfaces)
		 */
		
		Map<Integer, Produto> map = new HashMap<>();
		Produto p1 = new Produto(1, "Produto 1");
		Produto p2 = new Produto(2, "Produto 1");
		Produto p3 = new Produto(3, "Produto 1");
		
		/* Associando uma chave aos meus produtos
		 */
		map.put(1, p1);
		map.put(20, p2);
		map.put(3, p3);
		
		/* A grande vantagem de vc ter uma chave associada ao seu obj, � o de que ele � muito parecido
		 * com o indice de um array, eu passo o a chave e recebo o obj
		 */
		Produto p = map.get(3);
		System.out.println(p.toString() + "\n");
		
		/* Eu posso iterar pelos elementos com Iterator ou foreach, mas perceba que o map tem um conjunto
		 * de chaves do mapa 1,2, 3. o conjunto de valores p1,p2,p3 e tamb�m o conjunto de entrada que s�o
		 * os pares de chave e valor
		 */
		
		/* KeySet() retorna um conjunto de chaves, e este conjunto de chaves s�o armazenados dentro de um 
		 * outro conjunto do tipo Set que assim como HashMap n�o permite elementos duplicados
		 */
		Set<Integer> keys = map.keySet();
		for(Integer elemento : keys){
			System.out.println(elemento); //exibe somente as chaves do map, de qualquer ordem q ele quiser
		}
		
		
		System.out.println();
		
		/* Seu eu quiser iterar sobre os valores eu chamo o metodo values(), ele retorna uma Collection,
		 * Colletion � uma interface, tanto List como Set s�o interfaces que herdam da interface Collection
		 * s� que a Collection � mais Gen�rica, ent�o map.values() retorna uma Collection de Produtos
		 */
		Collection<Produto> values = map.values();
		for(Produto elemento : values){
			System.out.println(elemento); //exibe somente os valores do map que s�o os obj do tipo Produto que por padr�o j� chamam o toString()
		}
		
		
		System.out.println();
		
		
		/* map.entrySet() retorna as entradas do map, as entradas s�o compostas por uma chave e valor
		 * Existe uma Classe no java que fica dentro de Map chamada Entry, ent�o o que na vdd o metodo
		 * entrySet retorna � um conjunto dessa classe Set<Map.Entry<K,V>
		 */
		
		/* � um conjunto Set que recebe um Map que contem uma chave e valor */
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Produto> elemento : entries){
			System.out.println(elemento.getKey() + " => " + elemento.getValue());
		}
		
		
		
		
		/* LinkedHashMap diferente do HashMapMap, o linked mantem a mesma ordem de inser��o no map
		 * Ex
		 * <Integer, Produto> map = new LinkedHashMap<>();
		 */
		
		/* TreeMap<>() diferente do Hasmap e LinkedHashMap  o TreeMap ordena por padr�o no momento
		 * da inser��o das chaves
		 * 
		 * ent�o o ideal � de que ao criar seus mapas, voc� use com o TreeMap assim na hora de listar
		 * as chaves ele retorna com as chaves ordenadas
		 * Ex.
		 * <Integer, Produto> map = new TreeMap<>();
		 */
		
		

	}
	
	

}
