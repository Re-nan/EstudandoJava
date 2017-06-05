package estudando.classes.StringBuilder;

/* Como Strings são imutáveis, manipular a mesma String diversas vezes pode ocupar muita memória desnecessáriamente
 * 
 * A classe StringBuilder é a mesma coisa que a classe String, a diferença é que ela é MULTÁVEL, o que você faz no valor é replicado
 * na string ao invés de criar uma nova String em memória para cada mudança como é feito na String normal
 * 
 * Possui alguns métodos diferentes, ex para concatenar em String usamos o concat() em StringBuilder usamos o append()
 * 
 * Além de StringBuilder existe também a classe StringBuffer que tem exatamente a mesma função, mas que possui todos os seus métodos
 * sincronizados, demoram mais pra executar e não são tão performáticos quanto StringBuilder
 */

public class Main {
	public static void main(String[] args) {
		
		StringBuilder alfabeto1 = new StringBuilder("abc");
		
		alfabeto1.append("def");
		alfabeto1.append("ghi");	
		System.out.println("Valor: " + alfabeto1); //Exibindo de um obj StringBuilder
		System.out.println("Classe: " + alfabeto1.getClass());
		
		/* Quando você usa um obj StringBuilder uma string só é gerada quando você usa o toString() */
		String alfabeto2 = alfabeto1.toString();
		
		System.out.println("\nValor: " + alfabeto2.toString()); //Exibindo de um obj String
		System.out.println("Classe: " + alfabeto2.getClass());
		
	}

}
