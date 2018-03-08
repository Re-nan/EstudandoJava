package estudando.regex.MetacaracteresQuantificadores;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* EXPRESSÕES REGULARES ou REGEX é utilizado para encontrar padrões dentro um conjunto de informações
 * - Ex. Quero encontrar o padrão 'bc'(Pattern/Expression) dentro de 'abcabcabc'(Textual data)
 * Entenda que cada caractere possui um indice do zero ao tamanho da string
 * A expressão regular ela encontra exatamente o indice/posições aonde o seu padrão aparece ou seja, indice 1, 4 e 7
 * 
 * Existem 2 regras que devemos levar em consideração quando tabalhamos com expressões regulares
 * 1º A busca é sempre feita da esquerda para direita da informação
 * 2º Não pode reaproveitar padrões dentro de outros padroes, ou seja se o caracater já faz parte de um padrão 
 * encontrado, ele não pode fazer parte de outro padrão abca só aparece uma vez dentro de abcabca
 */

/* METACARACTERES
 * Serve para fazer uma busca mais dinamica dentro de uma string ex "a3 d5_?s"
 * 
 * \d dígitos de 0 a 9 significa que você está procurando por um número de 0 a 9 na sua string
 * Tenho isso na posição 1 e 4 (que foram: 3 e 5)
 * 
 * \s Espaço em branco significa que você está procurando por um espaço em branco na sua string
 * Tenho isso na posição 1 (que foi: o espaço em branco) 
 * 
 * \w Caracteres alfanuméricos(dígitos, letras de a a z maiusculas ou minusculas, e "_") 
 * Tenho isso na posição 0,1,3,4,5 e 7 (que foram: 3 d 5 _ s) 
 * 
 * \w\d Caracteres alfanuméricos seguido de um digito 
 * Tenho isso na posição 0 e 3 (que foram: a3 d5) 
 * 
 * . Qualquer caracter quando você define que você está buscando por um ponto, você está definidno que 
 * você está buscando por qualquer coisa 
 * 
 * DICA: Comsulte o javadoc da classe Pattern para conhecer melhor estes e outros metacaractres
 */

public class Main {
	public static void main(String[] args) {
		
		//METACARACTERES
		//String texto1 = "a3 d5_?s";
		
		/* \d uso se estou interessado em buscar por digitos de 0 a 9 dentro desse texto
		 * Resposta: Tenho isso na posição 1 e 4 (que foram: 3 e 5)
		 * 
		 * \w uso se estou interessado em buscar por caracteres alfanuméricos dentro desse texto
		 * Resposta: esse patrão retorna as posições 0,1,3,4,5,7
		 * 
		 * \s  uso se estou interessado em buscar por caracteres de espaço em branco dentro desse texto
		 * Resposta: Tenho isso na posição 1 (que foi: o espaço em branco) 
		 * 
		 * posso combinar elas
		 * \w\d uso se estou interessado em buscar por um caracter alfanumerico seguido de um digito 
		 * Resposta: Tenho isso na posição 0 e 3 (que foram: a3 d5) 
		 * 
		 * d\d uso se estou interessado em buscar por um caracter de letra d seguido de um dígito
		 * Resposta: Tenho isso na posição 3 (que foi: d5)
		 * 
		 * . uso para referir que estou buscando qualquer caracter, ou seja qualquer coisa 
 		 * Resposta: Tenho isso em todas as posições (que foram: a3 d5_?s)
		 * 
		 * DICA: Comsulte o javadoc da classe Pattern para conhecer melhor estes e outros metacaractres
		 */ 

		/* Outros tipos de Metacaracteres Importantes
		 * [abc] Quer dizer que estou procurando por um caracter 'a' ou 'b' ou 'c'e não  o texto 'abc' 
		 * [?1%] a mesma coisa, estou procurando pelo caracter ? ou número 1 ou um caracter de procentagem
		 * [a-f] Significa um range, que eu quero caracteres de a até f, ou seja aceito  a b c d e ou o f
		 * [a-f0-9] Significa que procuro por caracteres de a até f ou de 0 até 9
		 */
		
		
		/* A classe Pattern representa uma expressão regular A classe Matcher é quem
		 * executa o processo de busca pelo padrão de dados fornecidos, é nela que tem a
		 * lógica da busca representado por você
		 */

		/* Vamos conhecer as classes PATTERN e MATCHER
		 * 
		 * São as principais classes responsáveis por fazer o processo de Expressão Regular no java
		 * 
		 * A Pattern define o padrão que vou utilizar de busca, é a 'palavra' ou 'sequencia de caracteres' ou
		 * 'metacaracteres' que eu quero buscar dentro de uma string qualquer
		 * 
		 * E a Matcher Define a string na qual você irá procurar o padrão que foi definido no Pattern
		 */
		
		Pattern p = Pattern.compile("123"); // O padrão 123 pode ser encontrado 
		Matcher m = p.matcher("1234"); // dentro do texto 1234 ?
		
		// o find() retorna se encontrou 123 dentro de 1234
		System.out.println(m.find()); //true
		
		/* Quantificadores
		 * Permitem especificar padrões em sequência como zero ou mais digitos, uma ou mais letras, um ou nenhum
		 * espaço em branco e etc..
		 * * Significa 0 ou mais ocorrencias
		 * + Signicia uma ou mais ocorrencias, ou seja, ao menos uma deve existir
		 * ? Nenhuma ou uma ocorrência, não pode ter mais de uma
		 */
		
		//+
		Pattern p2 = Pattern.compile("5+"); //padrão esperado
		Matcher m2 = p2.matcher("5555"); //string passada
		System.out.println("É verdadeiro? " + m2.matches()); //true pq aceita um ou vários 5, mas tem q ter pelo menos um 5
		
		//*
		Pattern p3 = Pattern.compile("5+9*"); //padrão esperado
		Matcher m3 = p3.matcher("55"); //string passada
		System.out.println("É verdadeiro? " + m3.matches()); //true pq * espera nenhum ou um ou só 9 ou varios 9
		
		//?
		Pattern p4 = Pattern.compile("5+9*2?"); //padrão esperado
		Matcher m4 = p4.matcher("55999922"); //string passada
		System.out.println("É verdadeiro? " + m4.matches()); //false pq ? espera nenhum ou somente um 2, ñ pode ter mais de um
		
		/* Outro exemplo
		 * Vamos supor que você tem uma aplicação que aceita cpf em 3 tipos de formatos, são eles:
		 * "34509-390", "34509 309", "34509390", como você valida isso com experessão regular?
		 * \d\d\d\d\d([\s-])?\d\d\d
		 * Tenho 5x \d, ou sejam esperam numeros de 0 a 9 5x em sequencia
		 * [\s-] Tudo o que está dentro do colchetes é como se fosse um OU, então ou aceita 
		 * \s que é um espaço em branco ou um -
		 * ([\s-])? Signica que tudo o que ta entre parentes pode aparecer zero ou uma vez, e se aparecer
		 * uma vez, pode ser um espaço em branco ou um -
		 * Termino com 3x \d tem numeros de 0 a 9 em sequencia
		 */
		
		Pattern p5 = Pattern.compile("\\d\\d\\d\\d\\d([\\s-])?\\d\\d\\d"); //padrão esperado
		Matcher m5 = p5.matcher("36349-805"); //cpf passado	
		System.out.println("É um cpf verdadeiro? " + m5.matches());
		
		
	}

}
