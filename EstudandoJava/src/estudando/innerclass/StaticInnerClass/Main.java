package estudando.innerclass.StaticInnerClass;

/* Static Inner Class
 * 
 * - N�o � realmente � uma inner class pq n�o tem um relacionamento com a outer class, mas ela
 * tem alguns elementos de inner class, ela � apenas uma classe declarada dentro de outra 
 * classe e s�. Para criala basta criar a classe dentro de outra classe usando a palavra static
 * 
 * - Se voc� tiver um atributo na OuterClass ele n�o poder� ser acessado na StaticInnerClass
 * 
 * - Uma static inner class famosa � a Map.Entry cujos objs s�o retornados quando o m�todo
 * entrySet() � invocado, em que Map faria o papel de uma outer class e Entry o de uma inner
 * class est�tica
 */

public class Main {

	public static void main(String[] args) {

		// Criando instancia da classe de fora
		MyOuterClass fora = new MyOuterClass();
		
		
		/* Criando instancia da classe de dentro
		 * Apesar da classe de fora estar referenciando a classe de dentro, ela � totalmente
		 * independente da classe de fora
		 */ 
		MyOuterClass.MyInnerClass dentro = new MyOuterClass.MyInnerClass();
		dentro.imprimir();
		
	}

}
