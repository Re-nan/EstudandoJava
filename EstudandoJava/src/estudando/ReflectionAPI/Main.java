package estudando.ReflectionAPI;

/* Reflection Api ou conhecida também como Api de Reflexão, permite que suas classes
 * conheçam sobre suas estruturas internas(tudo o que a classe tem, como: quais são os
 * métodos, os atributos, os contrutores e etc..)
 * 
 * O ponto de entrada é um obj Class, que guarda informações sobre uma determinada classe
 * Existem várias formas de se adquirir um obj Class de uma determinada classe
 */

public class Main {

	public static void main(String[] args) throws Exception {

		/* MÉTODO 1
		 * Toda classe java possui esse atributo class
		 */
		Class c1 = String.class;
		
		
		/* MÉTODO 2
		 * O método estático forName() retorna um Class<?>, ou sejá um obj Class qualquer
		 * por isso esse método pode lançar uma exceção do tipo ClassNotFoundException
		 * Deve ser utilizado um try catch ou o método que está o utilizando deve 
		 * lançar um throws do tipo ClassNotFoundException 
		 */
		Class c2 = Class.forName("java.lang.String"); //Precisa ser o "fully qualified name" ou seja, o nome todo da classe
		
		
		/* MÉTODO 3
		 * Utilizando o retorno do atributo class para uma var do tipo Generics parametrizada com String, sendo
		 * assim obrigado ela a ser somento do tipo class vindo de uma String
		 */
		Class<String> c3 = String.class;
	
		
		/* MÉTODO 4
		 * Utilizando um typecast de class String para obtler um class de tipo String
		 */
		Class<String> c4 = (Class<String>) Class.forName("java.lang.String");
		
	}

}
