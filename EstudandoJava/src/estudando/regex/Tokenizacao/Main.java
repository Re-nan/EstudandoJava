package estudando.regex.Tokenizacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Tokenização
		 * É o processo de dividir uma grande quantidade de dados em pedaços menores, chamados tokens
		 * Um token é na verdade um subconjunto de um conjunto maior de dados, quem faz essa divisão são
		 * os demilimitadores que geralmente são , ; - . ou outro que você definir como 0+ 
		 * Ex.
		 */
		System.out.println("a,b,c,d,e".replaceAll(",", "")); //Substitui todos os , por ""
		System.out.println("a0b00c000d0000e".replaceAll("0+", "")); //Substitui todos os 1 ou mais zeros por ""
		System.out.println("a.b.c.d.e".replaceAll("\\.", "")); 

		/* Método Split()
		 * A classe String possui um método split() que é utilizado para dividir um texto em tokens baseado em um
		 * delimitador
		 * O método split sempre retorna um array de Strings, então você precisa jogar isso em um array
		 */
		String texto2 = "a<>b<>c<>d";
		String[] tokens = texto2.split("<>");
		for(String item : tokens){
			System.out.println(item);
		}
		
		/* Classe Scanner 
		 * A classe Scanner é excelente para trabalhar com tokenização, as vantagens:
		 * - Os dados de entrada podeme star em arquivos streams ou strings
		 * - Controle no processo de tokenização, que é feito em loop
		 * - Conversão automática para tipos primitivos
		 * Ex.
		 * Tenho um registro de um produto que contém id, nome, qtd e preço, divididos por ;
		 */
		
		String registro = "1; Produto 1; 3; 29,90";
		Scanner scanner = new Scanner(registro);
		
		// Definindo o delimitador que será utilizado, no caso o "; "
		scanner.useDelimiter("; "); 
		
		/* Definindo um locale ptBR do Brasil que é utilizado quando ele encontra datas e numeros, no caso o meu 
		 * 29,90 será considerado no formato brasileiro que é onde a virgula é utilizada para separar as casas decimais 
		 */
		scanner.useLocale(new Locale("pt", "BR")); 
		
		/* Todas vezes que chamo esses métodos o scanner faz uma busca pelo próximo elemento encontrado com base 
		 * no delimitador que você forneceu
		 */
		long id = scanner.nextLong(); //retorna o valor já convertido para long
		String nome = scanner.next(); // retorna a string em si
		int qtd = scanner.nextInt(); // retona o valor já convertido para int
		double valor = scanner.nextDouble(); // retona o valor já convertido para double
		
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Qtd: " + qtd);
		System.out.println("Valor: " + valor);
		
		// Quando você precisa capturar os tokens mas não sabe a qtd que tem
		 
		List<Integer> listaNumeros = new ArrayList<Integer>();
		String numeros = "1,2,3,4,5";
		
		Scanner scan = new Scanner(numeros);
		scan.useDelimiter(",");
		
		/* O método hasNext() verifica se ainda há tokens, enquanto tiver tokens a serem processados o bloco while
		 * é executado, cada vez que um token é encontrado eu adiciono ele na minha lista de numeros através do método
		 * add do meu list
		 */
		while(scan.hasNext()) {
			listaNumeros.add(scan.nextInt());
		}
	
	}
}
