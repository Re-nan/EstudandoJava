package estudando.classes.Object;

/* Toda classe em Java herda de apenas uma classe, que também pode ser
 * chamada de SUPERCLASSE. Se você não herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object é a superclasse(classe mãe) de todas as classes do java
 *   
 * @author renan
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Object obj = new Object();
		String nome = "RENAN";
		Integer n1 = 10; 
		
		/* toString()
		 * As classes podem sobrescrever este método para mostrarem
		 * uma mensagem que as representem
		 * o método System.out.prinltn(), por exemplo, usa este método
		 */
		System.out.println();
		
		
		/* equals()
		 * É a forma que o java tem de comparar ojetos pelo seu conteúdo
		 * ao invés de comparar as referências(como acontece ao usarmos
		 * "==")
		 */
		System.out.println();
		
		
		


	}

}
