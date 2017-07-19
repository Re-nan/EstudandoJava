package estudando.colecoes.Mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* MAPAS são utilizados quando precisamos mapear um chave valor, e chaves e valores de mapa podem
 * ser de qualquer tipo de obj
 * 
 * No java os mapas são representados pela interface Map de  java.util.Map
 * 
 */
public class Main {
	public static void main(String[] args) {

		/* HashMap
		 * A sua principal característica é a de que ele não possui nenhuma garantia com a relação
		 * à ordem das chaves do mapa, é muito similar ao conjunto HashSet
		 * 
		 * os métodos put() e get() podem ser usados para adicionar e obter elementos do mapa
		 * respectivamente
		 * 
		 * A interface java.util.Map possui métodos para retornar sua lista de chaves e de valores,
		 * e até de cada entrada chave/valor do mapa
		 * 
		 * Lembrando que no java eu não posso criar coleções com tipos primitivos, os Generics não
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
		
		/* A grande vantagem de vc ter uma chave associada ao seu obj, é o de que ele é muito parecido
		 * com o indice de um array, eu passo o a chave e recebo o obj
		 */
		Produto p = map.get(3);
		System.out.println(p.toString() + "\n");
		
		/* Eu posso iterar pelos elementos com Iterator ou foreach, mas perceba que o map tem um conjunto
		 * de chaves do mapa 1,2, 3. o conjunto de valores p1,p2,p3 e também o conjunto de entrada que são
		 * os pares de chave e valor
		 */
		
		/* KeySet() retorna um conjunto de chaves, e este conjunto de chaves são armazenados dentro de um 
		 * outro conjunto do tipo Set que assim como HashMap não permite elementos duplicados
		 */
		Set<Integer> keys = map.keySet();
		for(Integer elemento : keys){
			System.out.println(elemento); //exibe somente as chaves do map, de qualquer ordem q ele quiser
		}
		
		
		System.out.println();
		
		/* Seu eu quiser iterar sobre os valores eu chamo o metodo values(), ele retorna uma Collection,
		 * Colletion é uma interface, tanto List como Set são interfaces que herdam da interface Collection
		 * só que a Collection é mais Genérica, então map.values() retorna uma Collection de Produtos
		 */
		Collection<Produto> values = map.values();
		for(Produto elemento : values){
			System.out.println(elemento); //exibe somente os valores do map que são os obj do tipo Produto que por padrão já chamam o toString()
		}
		
		
		System.out.println();
		
		
		/* map.entrySet() retorna as entradas do map, as entradas são compostas por uma chave e valor
		 * Existe uma Classe no java que fica dentro de Map chamada Entry, então o que na vdd o metodo
		 * entrySet retorna é um conjunto dessa classe Set<Map.Entry<K,V>
		 */
		
		/* é um conjunto Set que recebe um Map que contem uma chave e valor */
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Produto> elemento : entries){
			System.out.println(elemento.getKey() + " => " + elemento.getValue());
		}
		
		
		
		
		/* LinkedHashMap diferente do HashMapMap, o linked mantem a mesma ordem de inserção no map
		 * Ex
		 * <Integer, Produto> map = new LinkedHashMap<>();
		 */
		
		/* TreeMap<>() diferente do Hasmap e LinkedHashMap  o TreeMap ordena por padrão no momento
		 * da inserção das chaves
		 * 
		 * então o ideal é de que ao criar seus mapas, você use com o TreeMap assim na hora de listar
		 * as chaves ele retorna com as chaves ordenadas
		 * Ex.
		 * <Integer, Produto> map = new TreeMap<>();
		 */
		
		

	}
	
	

}
