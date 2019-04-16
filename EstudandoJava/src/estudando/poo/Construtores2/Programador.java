package estudando.poo.Construtores2;

/* Toda classe que herda outra classe
 * herda por padr�o seu construtor
 */

public class Programador extends Funcionario {

	public Programador() {
		System.out.println("Criando Programador");
	}
	
	
	
	/* O construtor acima � como se eu estivesse chamando 
	 * o Construtor da classe m�e implicitamente com a palavra 
	 * super()
	 */
	 
	//public Programador() {
	//	super();
	//	System.out.println("Criando Programador");
	//}

}
