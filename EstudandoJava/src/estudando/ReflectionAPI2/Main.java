package estudando.ReflectionAPI2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* Um obj Class pode representar também outros elementos que não sejam Classe,
 * como Interfaces e Enuns, ou seja class é um nome geral que o java usa para
 * representar uma estrutura  
 * 
 * A partir de um obj class é possível descobrir quais são os atributos,
 * construtores e métodos 
 * 
 * getFields() Retorna um array de atributos
 * getField() Retorna um atributo específico
 * getConstructors() Retorna um array de Construtores
 * getConstructor() Retorna um construtor específico
 * getMethods() Retorna um array de métodos
 * getMethod() Retorna um método específico
 * 
 * Entenda que este obj class representa a classe que ele veio
 * A partir deste obj class você vai conseguir acessar a estrura da classe do
 * qual ele representa		 
 */

public class Main {

	public static void main(String[] args) throws Exception {
			
		// Criando um obj Class do tipo Televisão
		Class<Televisao> tvClass = Televisao.class;
		
		// Obtendo um array do tipo Field com todos os atributos da classe Televisão
		Field[] fields = tvClass.getDeclaredFields();
		
		for (Field field : fields) {
			// Exibindo o nome e o tipo dos atributos
			System.out.println(field.getName() + " => " + field.getType());
		}
		
		
		System.out.println();
		
		
		// Obtendo um array do tipo Method com todos os métodos da classe Televisão
		Method[] methods = tvClass.getDeclaredMethods();
		
		for (Method method : methods) {
			// // Exibindo o nome, o tipo de retorno e os parametros dos métodos
			System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameters()));
		}
		
		
		System.out.println();
		
		
		// Criando um obj/instancia de Televisão
		Televisao tv1 = new Televisao();
		
		
		// Obtendo método ligar com nenhum parametro
		Method ligar = tvClass.getDeclaredMethod("ligar");
		// Invocando método ligar do obj tv1
		ligar.invoke(tv1);
		
		
		// Obtendo método mudarCanal com um parametro do tipo int
		Method mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);
		// Invocando o método mudarCanal do obj tv1 passando 25 como parametro
		mudarCanal.invoke(tv1, 25);
		
		
		// Obtendo método desligar com nenhum parametro
		Method desligar = tvClass.getDeclaredMethod("desligar");
		// Invocando método desligar do obj tv1
		desligar.invoke(tv1);
		
		
		System.out.println();
		
		
		/* Com a Reflection API é possível instanciar objetos quando conhecemos apenas
		 * o nome da classe As vezes não temos acesso a classe em si
		 * 
		 * Na esquerda temos que ter uma superClasse ou a mesma classe do forName, ocorrendo o polimorfismo
		 * Class<superClasse> classObj = (Class<superClasse>) Class.forName("estudando.ReflectionAPI.ClasseFilha");
		 * 
		 * Na esquerda temos um obj da Interface ou Superclasse e na direita criamos uma instancia a partir do obj Class de uma Classe filha da Superclasse
		 * superClasse SuperClasseObj = (superClasse) classObj.getDeclaredConstructor().newInstance();
		 * 
		 * A ideia é mantermos a superclasse como polimorfismo fazendo chamada ao mesmo metodo mas que se comporta
		 * diferente conforme a classe que é passada no forName()
		 */
		
		/* Criando um obj Televisão com a Reflection API
		 * Warning dizendo que a classe que vem como parametro no forName() pode talvez não ser 
		 * possível fazer o cast para o mesmo tipo que o irá  receber
		 */ 
		Class<Televisao> classTv = (Class<Televisao>) Class.forName("estudando.ReflectionAPI2.Televisao");
		Televisao objTv = (Televisao) classTv.getDeclaredConstructor().newInstance();
		objTv.ligar();
		
	}

}
