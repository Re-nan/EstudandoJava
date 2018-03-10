package estudando.regex.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		/* A classe Pattern representa uma expressão regular 
		 * E a classe Matcher é quem executa o processo de busca pelo padrão de dados fornecidos, é nela que tem a
		 * lógica da busca representado por você
		 */

		/* Pattern define o padrão que vou utilizar de busca, é a 'palavra' ou 'sequencia de caracteres' ou
		 * 'metacaracteres' que eu quero buscar dentro de uma string qualquer, ou seja no ex. eu busco pelo
		 * padrão em que começa com 'a' e que seja seguido por um ou mais caracteres 'b'
		 * 
		 * Matcher Define a string na qual você irá procurar o padrão definido no Pattern
		 */

		// "ab+" procura uma sequencia que comece com a e tenha seguido um ou mais b's
		Pattern p = Pattern.compile("ab+"); // compile("ab+") retorna uma instancia de Pattern já com um padrão
		Matcher m = p.matcher("aabbccab"); // m é um obj Matcher já com o padrão "ab+" especificado na string "aabbccab"

		/* Agora para procurar "ab+" dentro de "aabbccab" eu faço um while para varrer
		 * essa string até encontrar uma sequencia que se encaixe no meu padrão
		 * 
		 * enquanto find() ou seja enquanto encontrar o padrão naquela string, usamos o
		 * while pq o padrão pode ser encontrado mais de uma vez naquela string
		 * 
		 * E se encontrado então me retorne a posição inicial na string em que ele foi
		 * encontrado com o m.start()
		 * 
		 * E o group() retorna a string encontrada, ou seja ela sempre corresponderá ao
		 * padrão que você esta procurando
		 */
		System.out.println("Conteudo de p " + p);
		System.out.println("Conteudo de m " + m + "\n");

		while (m.find()) {
			int start = m.start();
			String group = m.group();

			// retorna a posição inicial onde o apdrão foi encontrado e o padrão encontrado
			System.out.println(start + " => " + group);

			/*
			 * retorno do while posição => padrão 1 => abb 6 => ab
			 */
		}

		System.out.println();

		/* Além de encontrar padrão a classe Matcher pode realizar substituições no
		 * texto com base em um padrão Ex. Toda vez que encontrar padrões de ab+
		 * substitua por XX
		 */

		/* m.appendReplacement(sb, "XX"); recebe um stringbuffer e a nova string que irá
		 * substituir Crio um stringbuffer que é onde será gerado a string de saída, a
		 * string já com a subtituição feita
		 * 
		 * ao substituir a string com os caracteres XX os demais caracteres ficam
		 * "soltos" e precisam serem juntados e para isso appendTail concatena os demais
		 * caracteres com os novos com XX
		 */
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "XXX"); // recebe um stringbuffer e a nova string que irá substituir
		}
		System.out.println("Antes: " + sb);
		m.appendTail(sb);
		System.out.println("Depois: " + sb);

		System.out.println();

		/* Existem outras soluções para substituição, os métodos replaceFirst() e
		 * replaceAll() da classe String também são bastante utilizados com base em
		 * padrões
		 */
		String s = "abc0deff1ghi2";

		/* replaceFirst pede como parametro o padrão para ser encontrado na string, e o
		 * novo valor que irá ser usado na substituição
		 */
		System.out.println(s.replaceFirst("\\d", "@")); // substitui por @ somente o primeiro numero de 0 a 9 que encontrar
		System.out.println(s.replaceAll("\\d", "@")); // substitui por @ todos os numeros 0 a 9 que encontrar

	}

}
