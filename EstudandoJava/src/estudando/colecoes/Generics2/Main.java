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
		
		/* Por padr�o todo list � do tipo Object ent�o ele armazena qualquer tipo de dado, 
		 * uma var Object pode ser qualquer dado, true, 2, "abc", 6.1 e quando voc� tenta
		 * recuperar algum dado, por mais que voc� veja o valor como um n�mero inteiro
		 * ou uma String, na verdade ele � um Object e retorna este dado em formato Object 
		 * obrigando o programador a fazer o cast desde dado para o espec�fico int, String
		 * ou outro que voc� precise
		 */ 
		
		//int i = listaSEM.get(2); Da erro porque 19 � Object e n�o int
		int i = (int)listaSEM.get(2);
		System.out.println(i);
		
			
		// Lista COM Generics
		List<String> listaCOM = new ArrayList<String>();
		listaCOM.add("Renan");
		listaCOM.add("Roger");
		//listaCOM.add(19); Da erro porque 19 � int e a lista est� restringida para Strings, o java faz a checagem do tipo em tempo de compila��o
		
	
		String nome = listaCOM.get(0); //J� retornou String, assim voc� evita o cast dos dados pois a lista j� est� parametrizada com String
		System.out.println(nome);
	
	
	}

}
