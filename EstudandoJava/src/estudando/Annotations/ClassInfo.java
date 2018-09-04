package estudando.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* S�o definidas como se fosse uma interface com um @ antes, seguido de seus atributos com parentes()
 * e usadas como: @ClassInfo(autor = "renan",  data = "20/08/2018")
 * 
 * 
 * Quando a annotation possui apenas um elemento, ele pode ter o nome como value e ser omitido quando
 * a anota��o � usada 
 * public @interface ClassInfo2 {
 * 	
 * 		String value();
 * }
 * e usada como: @nomeAnnotation("ValorAtributo") 
 * 
 * 
 * 
 * @RETETION quando estamos definindo uma anota��o, n�s podemos anotar a pro�pria anota��o
 * a anota��o @Retetion configira como a anota��o deve se comportar perante ao compilador e � JVM
 * Existem v�rios tipos de retetion:
 * 
 * RetetionPolicy.RUNTIME
 * A anota��o pode ser lida em tempo de execu��o pela JVM, ler a anota��o em tempo de execu��o
 * significa usar a Reflection API
 * 
 * RetetionPolicy.CLASS
 * A anota��o � lida pelo compilador mas n�o pode ser lida em tempo de execu��o, o java percebe a
 * anota��o apenas enquanto est� compilando o c�digo, vai pro .class
 * 
 * RetetionPolicy.SOURCE
 * A anota��o � ignorada pelo compilador, fica dispon�vel s� no c�digo fonte, n�o vai pro .class 
 * 
 * 
 * 
 * @TARGET Indica em qual elemento a annotation pode ser aplicada, serve para limitar em qual local
 * a annotation poder� ser utilizada
 * 
 * ElementType.TYPE
 * Pode ser usada para anotar classes, interfaces ou enum 
 * 
 * ElementType.METHOD
 * Pode ser usada para anotar apenas m�todos
 * 
 * ElementType.FIELD
 * Pode ser usada para anotar apenas atraibutos de classes
 */ 
 
/* Annotations mais conhecidas
 * 
 * @Override 
 * Indica que um m�todo sobreescreve outro
 * � opcional, mas quando utilizada gera erro se o m�todo anotado n�o estiver sobreescrevendo um
 * m�todo da superclasse, � uma checagem de boa pr�tica
 * 
 * @SupressWarnings
 * � utilizada para remover mensagens de warning do c�digo
 * O seu uso mais comum � utilizado para remover mensagens de convers�o de tipos quando o Generics
 * � utilizado
 * Pode ser usada para classes, m�todos, atributos e at� trechos de c�digos  
 * Ex. @SupressWarnings("unchecked")
 */

@Target(ElementType.TYPE) // Diz que ClassInfo pode ser usado apenas para anotar classes, interfaces ou enums
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {

	String autor();
	String data();
	int versao() default 1; //default significa que se eu n�o especificar este elemento ent�o quero utilizar o valor padr�o 1

}