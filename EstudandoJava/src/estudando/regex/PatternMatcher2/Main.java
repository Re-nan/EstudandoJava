package estudando.regex.PatternMatcher2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {

		/* Quero encontrar um determinado padrão definido, dentro de um texto
		 * 
		 * - Pattern é o Padrão que você quer buscar, a classe Patter possui o método
		 * estático compile que recebe um regex, regex é o padrão que você quer procurar,
		 * e retorna um obt do tipo Pattern No caso quero encontrar uma sequencia de uma
		 * ou mais letras minusculas que pode ser definido pelo regex ([a-z])+
		 * 
		 * - Matcher é quem vai efetivamente fazer a busca dentro da string Você chama o
		 * método matcher pelo obj pattern que já foi definido um padrão O matcher
		 * possui um metodo find() que retorna verdadeiro enquanto existir algum padrão
		 * daquele especificado, dentro dessa string, ele continua a executar o loop
		 * 
		 */

		Pattern p = Pattern.compile("([a-z])+");
		Matcher m = p.matcher("a1bc2def3");

		/* Quero mostrar a posição en que ele encontrou o padrão E quero mostrar qual
		 * foi o padrão encontrado
		 */
		while (m.find()) {
			System.out.println("Posição: " + m.start() + " Padrão: " + m.group());
		}

		System.out.println();

		/* Quero substituir informações na string com base em um padrão de procura O
		 * padrão vai ser letras minusculas de a até z elas as letras que encontrar irá
		 * substituir por ?
		 */

		p = Pattern.compile("([a-z])");
		m = p.matcher("a1bc2def3");

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, "?");

		}

		
		
		/* Exibe faltando o numero 3 da string porque no final do processo, uma parte
		 * dessa string ñ se encaixava no padrão, no caso o número 3 portando no final
		 * do seu loop você deve chamar o appendTail() para pegar o final da string
		 */
		System.out.println(sb); // ?1??2???

		// O método appendTail() justamente coloca o que falta da string
		m.appendTail(sb);
		System.out.println(sb); // ?1??2???3

	}

}
