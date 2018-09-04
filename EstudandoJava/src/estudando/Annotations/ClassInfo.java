package estudando.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* São definidas como se fosse uma interface com um @ antes, seguido de seus atributos com parentes()
 * e usadas como: @ClassInfo(autor = "renan",  data = "20/08/2018")
 * 
 * 
 * Quando a annotation possui apenas um elemento, ele pode ter o nome como value e ser omitido quando
 * a anotação é usada 
 * public @interface ClassInfo2 {
 * 	
 * 		String value();
 * }
 * e usada como: @nomeAnnotation("ValorAtributo") 
 * 
 * 
 * 
 * @RETETION quando estamos definindo uma anotação, nós podemos anotar a proópria anotação
 * a anotação @Retetion configira como a anotação deve se comportar perante ao compilador e à JVM
 * Existem vários tipos de retetion:
 * 
 * RetetionPolicy.RUNTIME
 * A anotação pode ser lida em tempo de execução pela JVM, ler a anotação em tempo de execução
 * significa usar a Reflection API
 * 
 * RetetionPolicy.CLASS
 * A anotação é lida pelo compilador mas não pode ser lida em tempo de execução, o java percebe a
 * anotação apenas enquanto está compilando o código, vai pro .class
 * 
 * RetetionPolicy.SOURCE
 * A anotação é ignorada pelo compilador, fica disponível só no código fonte, não vai pro .class 
 * 
 * 
 * 
 * @TARGET Indica em qual elemento a annotation pode ser aplicada, serve para limitar em qual local
 * a annotation poderá ser utilizada
 * 
 * ElementType.TYPE
 * Pode ser usada para anotar classes, interfaces ou enum 
 * 
 * ElementType.METHOD
 * Pode ser usada para anotar apenas métodos
 * 
 * ElementType.FIELD
 * Pode ser usada para anotar apenas atraibutos de classes
 */ 
 
/* Annotations mais conhecidas
 * 
 * @Override 
 * Indica que um método sobreescreve outro
 * É opcional, mas quando utilizada gera erro se o método anotado não estiver sobreescrevendo um
 * método da superclasse, é uma checagem de boa prática
 * 
 * @SupressWarnings
 * É utilizada para remover mensagens de warning do código
 * O seu uso mais comum é utilizado para remover mensagens de conversão de tipos quando o Generics
 * é utilizado
 * Pode ser usada para classes, métodos, atributos e até trechos de códigos  
 * Ex. @SupressWarnings("unchecked")
 */

@Target(ElementType.TYPE) // Diz que ClassInfo pode ser usado apenas para anotar classes, interfaces ou enums
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {

	String autor();
	String data();
	int versao() default 1; //default significa que se eu não especificar este elemento então quero utilizar o valor padrão 1

}