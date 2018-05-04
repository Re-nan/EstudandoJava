package estudando.regex.Tokenizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Tokeniza��o
		 * � o processo de dividir uma grande quantidade de dados em peda�os menores, chamados tokens
		 * Um token � na verdade um subconjunto de um conjunto maior de dados, quem faz essa divis�o s�o
		 * os demilimitadores que geralmente s�o , ; - . ou outro que voc� definir como 0+ 
		 * Ex.
		 */
		System.out.println("a,b,c,d,e".replaceAll(",", "")); //Substitui todos os , por ""
		System.out.println("a0b00c000d0000e".replaceAll("0+", "")); //Substitui todos os 1 ou mais zeros por ""
		System.out.println("a.b.c.d.e".replaceAll("\\.", "")); 

		/* M�todo Split()
		 * A classe String possui um m�todo split() que � utilizado para dividir um texto em tokens baseado em um
		 * delimitador
		 * O m�todo split sempre retorna um array de Strings, ent�o voc� precisa jogar isso em um array
		 */
		String texto2 = "a<>b<>c<>d";
		String[] tokens = texto2.split("<>");
		for(String item : tokens){
			System.out.println(item);
		}
		
		/* Classe Scanner 
		 * A classe Scanner � excelente para trabalhar com tokeniza��o, as vantagens:
		 * - Os dados de entrada podeme star em arquivos streams ou strings
		 * - Controle no processo de tokeniza��o, que � feito em loop
		 * - Convers�o autom�tica para tipos primitivos
		 * Ex.
		 * Tenho um registro de um produto que cont�m id, nome, qtd e pre�o, divididos por ;
		 */
		
		String registro = "1; Produto 1; 3; 29,90";
		Scanner scanner = new Scanner(registro);
		
		// Definindo o delimitador que ser� utilizado, no caso o "; "
		scanner.useDelimiter("; "); 
		
		/* Definindo um locale ptBR do Brasil que � utilizado quando ele encontra datas e numeros, no caso o meu 
		 * 29,90 ser� considerado no formato brasileiro que � onde a virgula � utilizada para separar as casas decimais 
		 */
		scanner.useLocale(new Locale("pt", "BR")); 
		
		/* Todas vezes que chamo esses m�todos o scanner faz uma busca pelo pr�ximo elemento encontrado com base 
		 * no delimitador que voc� forneceu
		 */
		long id = scanner.nextLong(); //retorna o valor j� convertido para long
		String nome = scanner.next(); // retorna a string em si
		int qtd = scanner.nextInt(); // retona o valor j� convertido para int
		double valor = scanner.nextDouble(); // retona o valor j� convertido para double
		
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Qtd: " + qtd);
		System.out.println("Valor: " + valor);
		
		// Quando voc� precisa capturar os tokens mas n�o sabe a qtd que tem
		 
		List<Integer> listaNumeros = new ArrayList<Integer>();
		String numeros = "1,2,3,4,5";
		
		Scanner scan = new Scanner(numeros);
		scan.useDelimiter(",");
		
		/* O m�todo hasNext() verifica se ainda h� tokens, enquanto tiver tokens a serem processados o bloco while
		 * � executado, cada vez que um token � encontrado eu adiciono ele na minha lista de numeros atrav�s do m�todo
		 * add do meu list
		 */
		while(scan.hasNext()) {
			listaNumeros.add(scan.nextInt());
		}
	
	}
}
