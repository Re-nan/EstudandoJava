package estudando.colecoes.Generics4;

import java.util.ArrayList;
import java.util.List;

/* Criando uma classe que utiliza Generics
 * Esta classe é responsável por armazenar objs como se fosse um List
 * Podendo adicionar e remover objs da Lista
 */

/* T é o tipo definido para quem instancia esta classe
 * Poderia ser qualquer letra, mas escolhi o T de Type, ou seja o tipo de dado
 * Com isso sua classe lista não fica engessada ao tipo Object
 */

public class Lista<T> {

	private List<T> list = new ArrayList<>();
	
	//Adiciona o elemento a lista
	public void adicionar(T elemento) {
		list.add(elemento);
	}
	
	//Retorna o elemento removido
	public T remover() {
		T elemento = list.get(0);
		list.remove(0);
		return elemento;
	}
}
