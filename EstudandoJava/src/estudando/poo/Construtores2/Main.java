package estudando.poo.Construtores2;

public class Main {

	public static void main(String[] args) {

		// Chamando s� o construtor de Funcion�rio
		Funcionario f1 = new Funcionario();
		System.out.println("\n");
		
		

		/* Chamando o construtor de Funcion�rio e
		 * o de Programador tamb�m
		 */
		Programador f3 = new Programador();
		System.out.println("\n");

		
		
		/* Chamando o construtor de Funcion�rio e
		 * o de Programador tamb�m, pois por mais
		 * que a referencia seja de Funcionario
		 * ala aponta na verdade para um construtor
		 * do tipo Programador
		 */
		Funcionario f2 = new Programador();

	}

}
