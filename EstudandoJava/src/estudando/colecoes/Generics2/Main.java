package estudando.colecoes.Generics2;

import java.util.ArrayList;
import java.util.List;

/* Exemplo do uso de listas COM e SEM o uso de Generics
 */

public class Main {

	public static void main(String[] args) {

		// Lista SEM Generics
		List listaSEM = new ArrayList();
		listaSEM.add("abc");
		listaSEM.add("def");
		listaSEM.add(19);
		
		/* Por padrão todo list é do tipo Object então ele armazena qualquer tipo de dado, 
		 * uma var Object pode ser qualquer dado, true, 2, "abc", 6.1 e quando você tenta
		 * recuperar algum dado, por mais que você veja o valor como um número inteiro
		 * ou uma String, na verdade ele é um Object e retorna este dado em formato Object 
		 * obrigando o programador a fazer o cast desde dado para o específico int, String
		 * ou outro que você precise
		 */ 
		
		//int i = listaSEM.get(2); Da erro porque 19 é Object e não int
		int i = (int)listaSEM.get(2);
		System.out.println(i);
		
			
		// Lista COM Generics
		List<String> listaCOM = new ArrayList<String>();
		listaCOM.add("Renan");
		listaCOM.add("Roger");
		//listaCOM.add(19); Da erro porque 19 é int e a lista está restringida para Strings, o java faz a checagem do tipo em tempo de compilação
		
	
		String nome = listaCOM.get(0); //Já retornou String, assim você evita o cast dos dados pois a lista já está parametrizada com String
		System.out.println(nome);
	
	
	}

}
