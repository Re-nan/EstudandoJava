package estudando.regex.PatternMatcher2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

	public static void main(String[] args) {

		/* Quero encontrar um determinado padr�o definido, dentro de um texto
		 * 
		 * - Pattern � o Padr�o que voc� quer buscar, a classe Patter possui o m�todo
		 * est�tico compile que recebe um regex, regex � o padr�o que voc� quer procurar,
		 * e retorna um obt do tipo Pattern No caso quero encontrar uma sequencia de uma
		 * ou mais letras minusculas que pode ser definido pelo regex ([a-z])+
		 * 
		 * - Matcher � quem vai efetivamente fazer a busca dentro da string Voc� chama o
		 * m�todo matcher pelo obj pattern que j� foi definido um padr�o O matcher
		 * possui um metodo find() que retorna verdadeiro enquanto existir algum padr�o
		 * daquele especificado, dentro dessa string, ele continua a executar o loop
		 * 
		 */

		Pattern p = Pattern.compile("([a-z])+");
		Matcher m = p.matcher("a1bc2def3");

		/* Quero mostrar a posi��o en que ele encontrou o padr�o E quero mostrar qual
		 * foi o padr�o encontrado
		 */
		while (m.find()) {
			System.out.println("Posi��o: " + m.start() + " Padr�o: " + m.group());
		}

		System.out.println();

		/* Quero substituir informa��es na string com base em um padr�o de procura O
		 * padr�o vai ser letras minusculas de a at� z elas as letras que encontrar ir�
		 * substituir por ?
		 */

		p = Pattern.compile("([a-z])");
		m = p.matcher("a1bc2def3");

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, "?");

		}

		
		
		/* Exibe faltando o numero 3 da string porque no final do processo, uma parte
		 * dessa string � se encaixava no padr�o, no caso o n�mero 3 portando no final
		 * do seu loop voc� deve chamar o appendTail() para pegar o final da string
		 */
		System.out.println(sb); // ?1??2???

		// O m�todo appendTail() justamente coloca o que falta da string
		m.appendTail(sb);
		System.out.println(sb); // ?1??2???3

	}

}
