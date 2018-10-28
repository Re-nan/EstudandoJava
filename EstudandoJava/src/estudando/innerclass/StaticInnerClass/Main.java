package estudando.innerclass.StaticInnerClass;

/* Static Inner Class
 * 
 * - Não é realmente é uma inner class pq não tem um relacionamento com a outer class, mas ela
 * tem alguns elementos de inner class, ela é apenas uma classe declarada dentro de outra 
 * classe e só. Para criala basta criar a classe dentro de outra classe usando a palavra static
 * 
 * - Se você tiver um atributo na OuterClass ele não poderá ser acessado na StaticInnerClass
 * 
 * - Uma static inner class famosa é a Map.Entry cujos objs são retornados quando o método
 * entrySet() é invocado, em que Map faria o papel de uma outer class e Entry o de uma inner
 * class estática
 */

public class Main {

	public static void main(String[] args) {

		// Criando instancia da classe de fora
		MyOuterClass fora = new MyOuterClass();
		
		
		/* Criando instancia da classe de dentro
		 * Apesar da classe de fora estar referenciando a classe de dentro, ela é totalmente
		 * independente da classe de fora
		 */ 
		MyOuterClass.MyInnerClass dentro = new MyOuterClass.MyInnerClass();
		dentro.imprimir();
		
	}

}
