package estudando.classes.ClasseStringBuilder;

/* Como Strings s�o imut�veis, manipular a mesma String diversas vezes pode ocupar muita mem�ria desnecess�riamente
 * 
 * A classe StringBuilder � a mesma coisa que a classe String, a diferen�a � que ela � MULT�VEL, o que voc� faz no valor � replicado
 * na string ao inv�s de criar uma nova String em mem�ria para cada mudan�a como � feito na String normal
 * 
 * Possui alguns m�todos diferentes, ex para concatenar em String usamos o concat() em StringBuilder usamos o append()
 * 
 * Al�m de StringBuilder existe tamb�m a classe StringBuffer que tem exatamente a mesma fun��o, mas que possui todos os seus m�todos
 * sincronizados, demoram mais pra executar e n�o s�o t�o perform�ticos quanto StringBuilder
 */

public class Main {
	public static void main(String[] args) {
		
		StringBuilder alfabeto1 = new StringBuilder("abc");
		
		alfabeto1.append("def");
		alfabeto1.append("ghi");	
		System.out.println("Valor: " + alfabeto1); //Exibindo de um obj StringBuilder
		System.out.println("Classe: " + alfabeto1.getClass());
		
		/* Quando voc� usa um obj StringBuilder uma string s� � gerada quando voc� usa o toString() */
		String alfabeto2 = alfabeto1.toString();
		
		System.out.println("\nValor: " + alfabeto2.toString()); //Exibindo de um obj String
		System.out.println("Classe: " + alfabeto2.getClass());
		
		
		/* BONUS */
		System.out.println("A" + "B" + "C" + "D");
		/* Normalmente ao fazer uma concaten��o de strings o java iria criar uma nova string para cada concatena��o que ele
		 * encontrar, por�m neste caso a JVM percebe concatena��es na mesma linha e internamente transforma isso em StringBuilders
		 * poupando a cria��o de novos endere�os de mem�ria desnecess�rios no heap
		 */
		
	}

}
