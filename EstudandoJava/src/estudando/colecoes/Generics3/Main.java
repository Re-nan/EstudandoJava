package estudando.colecoes.Generics3;

import java.util.ArrayList;
import java.util.List;

/* GENERICS e as SUBCLASSES
 * É comum um array pai receber um array filho
 * Mas com Genecrics isso não acontece pois um List Pai não pode receber um List
 * filho pois quando trabalhos com List<Tipo> o tipo fica atrelhado a List 
 * independente de houver herança ou não 
 */

public class Main {

	public static void main(String[] args) {

		// Atribuição de array havendo Herança entre os tipos
		
		Cachorro[] cachorros = new Cachorro[2]; //Criando array com 2 espaços tipo Cachorro
		cachorros[0] = new Cachorro("Nick"); //Adicionando cachorro Nick
		cachorros[1] = new Cachorro("Alf"); //Adicionando cachorro Alf
		
		for(Cachorro elemento : cachorros) {
			System.out.println(elemento.getNome() + " " + elemento.latir()); //exibindo cachorros
		}
		
		Animal[] animais = cachorros; //atribuição de arrays tendo Herança entre os tipos
		/* Passando array cachorros para array animais
		 * Passando cada obj Cachorro para o array animais
		 * Como se fosse Animal[] animais = new Cachorro[2]
		 * Você só pode acessar o que Animal tem em comum com Cachorro
		 */
				
		for(Animal elemento : animais) {
			//System.out.println(elemento.getNome() + " " + elemento.latir()); // Animais não pode acessar latir() de Cachorro
			System.out.println(elemento.getNome());
		}
		
		System.out.println();
		
		// Atribuição de Lists havendo Herança entre os Generics
		List<Cachorro> cachorros2 = new ArrayList<Cachorro>();
		cachorros2.add(new Cachorro("Nick"));
		cachorros2.add(new Cachorro("Alf"));
		
		for(Cachorro elemento : cachorros2) {
			System.out.println(elemento.getNome() + " " + elemento.latir());
		}
		
		/* Por mais que Cachorro seja uma lista de subclasse de Animal, você não pode atribuir
		 * uma lista de uma classe filha para uma classe Pai, em genereics você só pode trabalhar
		 * com atribuição de tipos de dados parametrizados iguais
		 */
		//List<Animal> animais2 = cachorros2;
		
		
	}

}
