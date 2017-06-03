package estudando.classes.Object;

/* Toda classe em Java herda de apenas uma classe, que tamb�m pode ser
 * chamada de SUPERCLASSE. Se voc� n�o herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object � a superclasse(classe m�e) de todas as classes do java
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
		 * As classes podem sobrescrever este m�todo para mostrarem
		 * uma mensagem que as representem
		 * o m�todo System.out.prinltn(), por exemplo, usa este m�todo
		 */
		System.out.println();
		
		
		/* equals()
		 * � a forma que o java tem de comparar ojetos pelo seu conte�do
		 * ao inv�s de comparar as refer�ncias(como acontece ao usarmos
		 * "==")
		 */
		System.out.println();
		
		
		


	}

}
