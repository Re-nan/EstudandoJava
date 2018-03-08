package estudando.regex.MetacaracteresQuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* EXPRESS�ES REGULARES ou REGEX � utilizado para encontrar padr�es dentro um conjunto de informa��es
 * - Ex. Quero encontrar o padr�o 'bc'(Pattern/Expression) dentro de 'abcabcabc'(Textual data)
 * Entenda que cada caractere possui um indice do zero ao tamanho da string
 * A express�o regular ela encontra exatamente o indice/posi��es aonde o seu padr�o aparece ou seja, indice 1, 4 e 7
 * 
 * Existem 2 regras que devemos levar em considera��o quando tabalhamos com express�es regulares
 * 1� A busca � sempre feita da esquerda para direita da informa��o
 * 2� N�o pode reaproveitar padr�es dentro de outros padroes, ou seja se o caracater j� faz parte de um padr�o 
 * encontrado, ele n�o pode fazer parte de outro padr�o abca s� aparece uma vez dentro de abcabca
 */

/* METACARACTERES
 * Serve para fazer uma busca mais dinamica dentro de uma string ex "a3 d5_?s"
 * 
 * \d d�gitos de 0 a 9 significa que voc� est� procurando por um n�mero de 0 a 9 na sua string
 * Tenho isso na posi��o 1 e 4 (que foram: 3 e 5)
 * 
 * \s Espa�o em branco significa que voc� est� procurando por um espa�o em branco na sua string
 * Tenho isso na posi��o 1 (que foi: o espa�o em branco) 
 * 
 * \w Caracteres alfanum�ricos(d�gitos, letras de a a z maiusculas ou minusculas, e "_") 
 * Tenho isso na posi��o 0,1,3,4,5 e 7 (que foram: 3 d 5 _ s) 
 * 
 * \w\d Caracteres alfanum�ricos seguido de um digito 
 * Tenho isso na posi��o 0 e 3 (que foram: a3 d5) 
 * 
 * . Qualquer caracter quando voc� define que voc� est� buscando por um ponto, voc� est� definidno que 
 * voc� est� buscando por qualquer coisa 
 * 
 * DICA: Comsulte o javadoc da classe Pattern para conhecer melhor estes e outros metacaractres
 */

public class Main {
	public static void main(String[] args) {
		
		//METACARACTERES
		//String texto1 = "a3 d5_?s";
		
		/* \d uso se estou interessado em buscar por digitos de 0 a 9 dentro desse texto
		 * Resposta: Tenho isso na posi��o 1 e 4 (que foram: 3 e 5)
		 * 
		 * \w uso se estou interessado em buscar por caracteres alfanum�ricos dentro desse texto
		 * Resposta: esse patr�o retorna as posi��es 0,1,3,4,5,7
		 * 
		 * \s  uso se estou interessado em buscar por caracteres de espa�o em branco dentro desse texto
		 * Resposta: Tenho isso na posi��o 1 (que foi: o espa�o em branco) 
		 * 
		 * posso combinar elas
		 * \w\d uso se estou interessado em buscar por um caracter alfanumerico seguido de um digito 
		 * Resposta: Tenho isso na posi��o 0 e 3 (que foram: a3 d5) 
		 * 
		 * d\d uso se estou interessado em buscar por um caracter de letra d seguido de um d�gito
		 * Resposta: Tenho isso na posi��o 3 (que foi: d5)
		 * 
		 * . uso para referir que estou buscando qualquer caracter, ou seja qualquer coisa 
 		 * Resposta: Tenho isso em todas as posi��es (que foram: a3 d5_?s)
		 * 
		 * DICA: Comsulte o javadoc da classe Pattern para conhecer melhor estes e outros metacaractres
		 */ 

		/* Outros tipos de Metacaracteres Importantes
		 * [abc] Quer dizer que estou procurando por um caracter 'a' ou 'b' ou 'c'e n�o  o texto 'abc' 
		 * [?1%] a mesma coisa, estou procurando pelo caracter ? ou n�mero 1 ou um caracter de procentagem
		 * [a-f] Significa um range, que eu quero caracteres de a at� f, ou seja aceito  a b c d e ou o f
		 * [a-f0-9] Significa que procuro por caracteres de a at� f ou de 0 at� 9
		 */
		
		
		/* A classe Pattern representa uma express�o regular A classe Matcher � quem
		 * executa o processo de busca pelo padr�o de dados fornecidos, � nela que tem a
		 * l�gica da busca representado por voc�
		 */

		/* Vamos conhecer as classes PATTERN e MATCHER
		 * 
		 * S�o as principais classes respons�veis por fazer o processo de Express�o Regular no java
		 * 
		 * A Pattern define o padr�o que vou utilizar de busca, � a 'palavra' ou 'sequencia de caracteres' ou
		 * 'metacaracteres' que eu quero buscar dentro de uma string qualquer
		 * 
		 * E a Matcher Define a string na qual voc� ir� procurar o padr�o que foi definido no Pattern
		 */
		
		Pattern p = Pattern.compile("123"); // O padr�o 123 pode ser encontrado 
		Matcher m = p.matcher("1234"); // dentro do texto 1234 ?
		
		// o find() retorna se encontrou 123 dentro de 1234
		System.out.println(m.find()); //true
		
		/* Quantificadores
		 * Permitem especificar padr�es em sequ�ncia como zero ou mais digitos, uma ou mais letras, um ou nenhum
		 * espa�o em branco e etc..
		 * * Significa 0 ou mais ocorrencias
		 * + Signicia uma ou mais ocorrencias, ou seja, ao menos uma deve existir
		 * ? Nenhuma ou uma ocorr�ncia, n�o pode ter mais de uma
		 */
		
		//+
		Pattern p2 = Pattern.compile("5+"); //padr�o esperado
		Matcher m2 = p2.matcher("5555"); //string passada
		System.out.println("� verdadeiro? " + m2.matches()); //true pq aceita um ou v�rios 5, mas tem q ter pelo menos um 5
		
		//*
		Pattern p3 = Pattern.compile("5+9*"); //padr�o esperado
		Matcher m3 = p3.matcher("55"); //string passada
		System.out.println("� verdadeiro? " + m3.matches()); //true pq * espera nenhum ou um ou s� 9 ou varios 9
		
		//?
		Pattern p4 = Pattern.compile("5+9*2?"); //padr�o esperado
		Matcher m4 = p4.matcher("55999922"); //string passada
		System.out.println("� verdadeiro? " + m4.matches()); //false pq ? espera nenhum ou somente um 2, � pode ter mais de um
		
		/* Outro exemplo
		 * Vamos supor que voc� tem uma aplica��o que aceita cpf em 3 tipos de formatos, s�o eles:
		 * "34509-390", "34509 309", "34509390", como voc� valida isso com experess�o regular?
		 * \d\d\d\d\d([\s-])?\d\d\d
		 * Tenho 5x \d, ou sejam esperam numeros de 0 a 9 5x em sequencia
		 * [\s-] Tudo o que est� dentro do colchetes � como se fosse um OU, ent�o ou aceita 
		 * \s que � um espa�o em branco ou um -
		 * ([\s-])? Signica que tudo o que ta entre parentes pode aparecer zero ou uma vez, e se aparecer
		 * uma vez, pode ser um espa�o em branco ou um -
		 * Termino com 3x \d tem numeros de 0 a 9 em sequencia
		 */
		
		Pattern p5 = Pattern.compile("\\d\\d\\d\\d\\d([\\s-])?\\d\\d\\d"); //padr�o esperado
		Matcher m5 = p5.matcher("36349-805"); //cpf passado	
		System.out.println("� um cpf verdadeiro? " + m5.matches());
		
		
	}

}
