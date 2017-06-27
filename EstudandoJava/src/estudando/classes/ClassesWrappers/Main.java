package estudando.classes.ClassesWrappers;

/* Classes Wrappers ou conhecidas tamb�m como classes embrulhadoras
 * S�o classes que representam os tipos primitivos "no mundo dos objetos"
 * 
 * Quando eu trabalho com cole��es de dados, tipos primitivos n�o podem serem
 * adicionados l�, apenas objetos. Ent�o eu posso por tipos primitivos desde
 * que eles estejam em sua forma de classes wrappers
 * 
 * Existem m�todos e parametros que retornam apenas objetos e nestes casos tamb�m
 * n�o poderia passar tipos primitivos, mas poderiam passar em sua forma wrappers
 * 
 * As classes wrappers possuem diversos metodos utilitarios para tipos primitvos,
 * como por exemplo converter tipos primitivos para String e vice versa
 * 
 * --- Tabelas de Tipos Primitivos e sua Respectiva classe Wrapper ---
 * boolean - Boolean
 * byte	   - Byte
 * short   - Short
 * char	   - Character
 * int	   - Integer
 * float   - Float
 * long	   - Long
 * double  - Double
 * 
 * 
 * Importante: objs wrappers s�o imutaveis, logo seu valor n�o pode ser alterado
 * se eu quiser alterar o seu valor � necess�rio construir o obj novamente
 */

public class Main {
	public static void main(String[] args) {
		
		/* Criando um wrapper do tipo Integer cujo o valor � 10
		 * Existem 2 formas, passando o int ou a String que representa o n�mero inteiro
		 * como parametro 
		 */
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		
		
		/* Criando um wrapper do tipo Double cujo o valor � 30.3 */
		Double d1 = new Double(30.3);
		Double d2 = new Double("30.3");
		
		/* Criando um wrapper do tipo Character cujo o valor � 'a' */
		Character c1 = new Character('a');

		/* Outras forms de criar Wrappers */
		/* chamando o metodo estatico valueOf(internamente ele constroi o obj e retorna pra gente) */
		Integer i3 = Integer.valueOf("10");
		Double d3 = Double.valueOf(30.3);
		
		/* Com o valueOf() eu posso passar tamb�m a base que eu quero, que no caso o valor 10 e
		 * a base 2, que � a base bin�ria, ou seja exibe "2" que � "10" em bin�rio
		 */
		Integer i4 = Integer.valueOf("10", 2);
		
		
		/* as classes Wrapper possuem utilit�rios de convers�o de dados /* 
		/* Criando um obj wrapper do tipo Integer que representa o n�mero 10
		 * Convertendo o valor Integer do obj wrapper em um valor do tipo int
		 */
		Integer i5 = new Integer(10);
		int i6 = i5.intValue();
		float f = i5.floatValue(); //pegando o int e passando como float
		
		
		/* O m�todo parseInt � um m�todo est�tico que converte uma string para um int */
		int i7 = Integer.parseInt("10");
		
		/* mesma coisa com double */
		double d4 = Double.parseDouble("4.5");
		
		
		/* CUIDADO ao passar Strings como parametros, isto lan�a uma exce��o
		 * por n�o ser o valor que ele est� esperando para converter
		 */
		//int i8 = Integer.parseInt("abc");
		


	}

}
