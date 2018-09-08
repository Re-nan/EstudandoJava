package estudando.ReflectionAPI;

/* Reflection Api ou conhecida tamb�m como Api de Reflex�o, permite que suas classes
 * conhe�am sobre suas estruturas internas(tudo o que a classe tem, como: quais s�o os
 * m�todos, os atributos, os contrutores e etc..)
 * 
 * O ponto de entrada � um obj Class, que guarda informa��es sobre uma determinada classe
 * Existem v�rias formas de se adquirir um obj Class de uma determinada classe
 */

public class Main {

	public static void main(String[] args) throws Exception {

		/* M�TODO 1
		 * Toda classe java possui esse atributo class
		 */
		Class c1 = String.class;
		
		
		/* M�TODO 2
		 * O m�todo est�tico forName() retorna um Class<?>, ou sej� um obj Class qualquer
		 * por isso esse m�todo pode lan�ar uma exce��o do tipo ClassNotFoundException
		 * Deve ser utilizado um try catch ou o m�todo que est� o utilizando deve 
		 * lan�ar um throws do tipo ClassNotFoundException 
		 */
		Class c2 = Class.forName("java.lang.String"); //Precisa ser o "fully qualified name" ou seja, o nome todo da classe
		
		
		/* M�TODO 3
		 * Utilizando o retorno do atributo class para uma var do tipo Generics parametrizada com String, sendo
		 * assim obrigado ela a ser somento do tipo class vindo de uma String
		 */
		Class<String> c3 = String.class;
	
		
		/* M�TODO 4
		 * Utilizando um typecast de class String para obtler um class de tipo String
		 */
		Class<String> c4 = (Class<String>) Class.forName("java.lang.String");
		
	}

}
