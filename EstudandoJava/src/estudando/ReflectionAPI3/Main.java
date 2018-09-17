package estudando.ReflectionAPI3;

import java.lang.reflect.Method;

/* Verificando a presença de Annotations utilizando a Reflection Api
 * 
 * Como fazer a leitura de Annotations usando a Reflection Api, no caso
 * executar ou não métodos definidos na classe MinhaCLasse
 * 
 * Como executar métodos apenas que estejam utilizando uma Annotation específica
 */

public class Main {

	public static void main(String[] args) throws Exception {

		MinhaClasse mc = new MinhaClasse();
		
		executar(mc);
		
	}

	
	
	/* Obtendo quais métodos estão anotados com o @Executar
	 * Se eu preciso de informação a respeito dos métodos, 
	 * então eu preciso da Reflection Api
	 * 
	 * O método getClass não é um método seguro pois ele não sabe se a classe que vem no parametro é
	 * do tipo MinhaClasse
	 */
	@SuppressWarnings("unchecked") //Para desaparecer o warning, 
	private static void executar(MinhaClasse mc) throws Exception {
		
		// Obetendo um obj Class do tipo MinhaClasse
		Class<MinhaClasse> c = (Class<MinhaClasse>) mc.getClass();
		
		// Obtendo um array do tipo Method com todos os métodos da Classe Minha Classe
		Method[] methods = c.getDeclaredMethods();
		
		//Varrendo o array methods do tipo Method
		for(Method elemento : methods){
			
			//Obtendo uma annotation de cada metodo
			//Se a Annotation for a @Executar então atribui ela em annot (Obtém a annotation @Executar do método, se ele tiver)
			Executar annot = elemento.getDeclaredAnnotation(Executar.class);
			
			// Se annot for diferente de nulo
			if(annot != null) {
				
				//Invoca o método que possui a Annotation, do obj mc do tipo MinhaClasse
				elemento.invoke(mc);
			} //fim if
			
		} // fim for
		
	} // fim executar()
	
	
}
