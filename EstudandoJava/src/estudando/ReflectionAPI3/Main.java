package estudando.ReflectionAPI3;

import java.lang.reflect.Method;

/* Verificando a presen�a de Annotations utilizando a Reflection Api
 * 
 * Como fazer a leitura de Annotations usando a Reflection Api, no caso
 * executar ou n�o m�todos definidos na classe MinhaCLasse
 * 
 * Como executar m�todos apenas que estejam utilizando uma Annotation espec�fica
 */

public class Main {

	public static void main(String[] args) throws Exception {

		MinhaClasse mc = new MinhaClasse();
		
		executar(mc);
		
	}

	
	
	/* Obtendo quais m�todos est�o anotados com o @Executar
	 * Se eu preciso de informa��o a respeito dos m�todos, 
	 * ent�o eu preciso da Reflection Api
	 * 
	 * O m�todo getClass n�o � um m�todo seguro pois ele n�o sabe se a classe que vem no parametro �
	 * do tipo MinhaClasse
	 */
	@SuppressWarnings("unchecked") //Para desaparecer o warning, 
	private static void executar(MinhaClasse mc) throws Exception {
		
		// Obetendo um obj Class do tipo MinhaClasse
		Class<MinhaClasse> c = (Class<MinhaClasse>) mc.getClass();
		
		// Obtendo um array do tipo Method com todos os m�todos da Classe Minha Classe
		Method[] methods = c.getDeclaredMethods();
		
		//Varrendo o array methods do tipo Method
		for(Method elemento : methods){
			
			//Obtendo uma annotation de cada metodo
			//Se a Annotation for a @Executar ent�o atribui ela em annot (Obt�m a annotation @Executar do m�todo, se ele tiver)
			Executar annot = elemento.getDeclaredAnnotation(Executar.class);
			
			// Se annot for diferente de nulo
			if(annot != null) {
				
				//Invoca o m�todo que possui a Annotation, do obj mc do tipo MinhaClasse
				elemento.invoke(mc);
			} //fim if
			
		} // fim for
		
	} // fim executar()
	
	
}
