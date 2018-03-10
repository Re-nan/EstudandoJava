package estudando.regex.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		/* A classe Pattern representa uma express�o regular 
		 * E a classe Matcher � quem executa o processo de busca pelo padr�o de dados fornecidos, � nela que tem a
		 * l�gica da busca representado por voc�
		 */

		/* Pattern define o padr�o que vou utilizar de busca, � a 'palavra' ou 'sequencia de caracteres' ou
		 * 'metacaracteres' que eu quero buscar dentro de uma string qualquer, ou seja no ex. eu busco pelo
		 * padr�o em que come�a com 'a' e que seja seguido por um ou mais caracteres 'b'
		 * 
		 * Matcher Define a string na qual voc� ir� procurar o padr�o definido no Pattern
		 */

		// "ab+" procura uma sequencia que comece com a e tenha seguido um ou mais b's
		Pattern p = Pattern.compile("ab+"); // compile("ab+") retorna uma instancia de Pattern j� com um padr�o
		Matcher m = p.matcher("aabbccab"); // m � um obj Matcher j� com o padr�o "ab+" especificado na string "aabbccab"

		/* Agora para procurar "ab+" dentro de "aabbccab" eu fa�o um while para varrer
		 * essa string at� encontrar uma sequencia que se encaixe no meu padr�o
		 * 
		 * enquanto find() ou seja enquanto encontrar o padr�o naquela string, usamos o
		 * while pq o padr�o pode ser encontrado mais de uma vez naquela string
		 * 
		 * E se encontrado ent�o me retorne a posi��o inicial na string em que ele foi
		 * encontrado com o m.start()
		 * 
		 * E o group() retorna a string encontrada, ou seja ela sempre corresponder� ao
		 * padr�o que voc� esta procurando
		 */
		System.out.println("Conteudo de p " + p);
		System.out.println("Conteudo de m " + m + "\n");

		while (m.find()) {
			int start = m.start();
			String group = m.group();

			// retorna a posi��o inicial onde o apdr�o foi encontrado e o padr�o encontrado
			System.out.println(start + " => " + group);

			/*
			 * retorno do while posi��o => padr�o 1 => abb 6 => ab
			 */
		}

		System.out.println();

		/* Al�m de encontrar padr�o a classe Matcher pode realizar substitui��es no
		 * texto com base em um padr�o Ex. Toda vez que encontrar padr�es de ab+
		 * substitua por XX
		 */

		/* m.appendReplacement(sb, "XX"); recebe um stringbuffer e a nova string que ir�
		 * substituir Crio um stringbuffer que � onde ser� gerado a string de sa�da, a
		 * string j� com a subtitui��o feita
		 * 
		 * ao substituir a string com os caracteres XX os demais caracteres ficam
		 * "soltos" e precisam serem juntados e para isso appendTail concatena os demais
		 * caracteres com os novos com XX
		 */
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			m.appendReplacement(sb, "XXX"); // recebe um stringbuffer e a nova string que ir� substituir
		}
		System.out.println("Antes: " + sb);
		m.appendTail(sb);
		System.out.println("Depois: " + sb);

		System.out.println();

		/* Existem outras solu��es para substitui��o, os m�todos replaceFirst() e
		 * replaceAll() da classe String tamb�m s�o bastante utilizados com base em
		 * padr�es
		 */
		String s = "abc0deff1ghi2";

		/* replaceFirst pede como parametro o padr�o para ser encontrado na string, e o
		 * novo valor que ir� ser usado na substitui��o
		 */
		System.out.println(s.replaceFirst("\\d", "@")); // substitui por @ somente o primeiro numero de 0 a 9 que encontrar
		System.out.println(s.replaceAll("\\d", "@")); // substitui por @ todos os numeros 0 a 9 que encontrar

	}

}
