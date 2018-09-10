package estudando.ReflectionAPI2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* Um obj Class pode representar tamb�m outros elementos que n�o sejam Classe,
 * como Interfaces e Enuns, ou seja class � um nome geral que o java usa para
 * representar uma estrutura  
 * 
 * A partir de um obj class � poss�vel descobrir quais s�o os atributos,
 * construtores e m�todos 
 * 
 * getFields() Retorna um array de atributos
 * getField() Retorna um atributo espec�fico
 * getConstructors() Retorna um array de Construtores
 * getConstructor() Retorna um construtor espec�fico
 * getMethods() Retorna um array de m�todos
 * getMethod() Retorna um m�todo espec�fico
 * 
 * Entenda que este obj class representa a classe que ele veio
 * A partir deste obj class voc� vai conseguir acessar a estrura da classe do
 * qual ele representa		 
 */

public class Main {

	public static void main(String[] args) throws Exception {
			
		// Criando um obj Class do tipo Televis�o
		Class<Televisao> tvClass = Televisao.class;
		
		// Obtendo um array do tipo Field com todos os atributos da classe Televis�o
		Field[] fields = tvClass.getDeclaredFields();
		
		for (Field field : fields) {
			// Exibindo o nome e o tipo dos atributos
			System.out.println(field.getName() + " => " + field.getType());
		}
		
		
		System.out.println();
		
		
		// Obtendo um array do tipo Method com todos os m�todos da classe Televis�o
		Method[] methods = tvClass.getDeclaredMethods();
		
		for (Method method : methods) {
			// // Exibindo o nome, o tipo de retorno e os parametros dos m�todos
			System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameters()));
		}
		
		
		System.out.println();
		
		
		// Criando um obj/instancia de Televis�o
		Televisao tv1 = new Televisao();
		
		
		// Obtendo m�todo ligar com nenhum parametro
		Method ligar = tvClass.getDeclaredMethod("ligar");
		// Invocando m�todo ligar do obj tv1
		ligar.invoke(tv1);
		
		
		// Obtendo m�todo mudarCanal com um parametro do tipo int
		Method mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);
		// Invocando o m�todo mudarCanal do obj tv1 passando 25 como parametro
		mudarCanal.invoke(tv1, 25);
		
		
		// Obtendo m�todo desligar com nenhum parametro
		Method desligar = tvClass.getDeclaredMethod("desligar");
		// Invocando m�todo desligar do obj tv1
		desligar.invoke(tv1);
		
		
		System.out.println();
		
		
		/* Com a Reflection API � poss�vel instanciar objetos quando conhecemos apenas
		 * o nome da classe As vezes n�o temos acesso a classe em si
		 * 
		 * Na esquerda temos que ter uma superClasse ou a mesma classe do forName, ocorrendo o polimorfismo
		 * Class<superClasse> classObj = (Class<superClasse>) Class.forName("estudando.ReflectionAPI.ClasseFilha");
		 * 
		 * Na esquerda temos um obj da Interface ou Superclasse e na direita criamos uma instancia a partir do obj Class de uma Classe filha da Superclasse
		 * superClasse SuperClasseObj = (superClasse) classObj.getDeclaredConstructor().newInstance();
		 * 
		 * A ideia � mantermos a superclasse como polimorfismo fazendo chamada ao mesmo metodo mas que se comporta
		 * diferente conforme a classe que � passada no forName()
		 */
		
		/* Criando um obj Televis�o com a Reflection API
		 * Warning dizendo que a classe que vem como parametro no forName() pode talvez n�o ser 
		 * poss�vel fazer o cast para o mesmo tipo que o ir�  receber
		 */ 
		Class<Televisao> classTv = (Class<Televisao>) Class.forName("estudando.ReflectionAPI2.Televisao");
		Televisao objTv = (Televisao) classTv.getDeclaredConstructor().newInstance();
		objTv.ligar();
		
	}

}
