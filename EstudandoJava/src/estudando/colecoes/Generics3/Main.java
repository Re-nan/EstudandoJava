package estudando.colecoes.Generics3;

import java.util.ArrayList;
import java.util.List;

/* GENERICS e as SUBCLASSES
 * � comum um array pai receber um array filho
 * Mas com Genecrics isso n�o acontece pois um List Pai n�o pode receber um List
 * filho pois quando trabalhos com List<Tipo> o tipo fica atrelhado a List 
 * independente de houver heran�a ou n�o 
 */

public class Main {

	public static void main(String[] args) {

		// Atribui��o de array havendo Heran�a entre os tipos
		
		Cachorro[] cachorros = new Cachorro[2]; //Criando array com 2 espa�os tipo Cachorro
		cachorros[0] = new Cachorro("Nick"); //Adicionando cachorro Nick
		cachorros[1] = new Cachorro("Alf"); //Adicionando cachorro Alf
		
		for(Cachorro elemento : cachorros) {
			System.out.println(elemento.getNome() + " " + elemento.latir()); //exibindo cachorros
		}
		
		Animal[] animais = cachorros; //atribui��o de arrays tendo Heran�a entre os tipos
		/* Passando array cachorros para array animais
		 * Passando cada obj Cachorro para o array animais
		 * Como se fosse Animal[] animais = new Cachorro[2]
		 * Voc� s� pode acessar o que Animal tem em comum com Cachorro
		 */
				
		for(Animal elemento : animais) {
			//System.out.println(elemento.getNome() + " " + elemento.latir()); // Animais n�o pode acessar latir() de Cachorro
			System.out.println(elemento.getNome());
		}
		
		System.out.println();
		
		// Atribui��o de Lists havendo Heran�a entre os Generics
		List<Cachorro> cachorros2 = new ArrayList<Cachorro>();
		cachorros2.add(new Cachorro("Nick"));
		cachorros2.add(new Cachorro("Alf"));
		
		for(Cachorro elemento : cachorros2) {
			System.out.println(elemento.getNome() + " " + elemento.latir());
		}
		
		/* Por mais que Cachorro seja uma lista de subclasse de Animal, voc� n�o pode atribuir
		 * uma lista de uma classe filha para uma classe Pai, em genereics voc� s� pode trabalhar
		 * com atribui��o de tipos de dados parametrizados iguais
		 */
		//List<Animal> animais2 = cachorros2;
		
		
	}

}
