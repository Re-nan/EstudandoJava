package estudando.poo.Construtores2;

/* Toda classe que herda outra classe
 * herda por padrão seu construtor
 */

public class Programador extends Funcionario {

	public Programador() {
		System.out.println("Criando Programador");
	}
	
	
	
	/* O construtor acima é como se eu estivesse chamando 
	 * o Construtor da classe mãe implicitamente com a palavra 
	 * super()
	 */
	 
	//public Programador() {
	//	super();
	//	System.out.println("Criando Programador");
	//}

}
