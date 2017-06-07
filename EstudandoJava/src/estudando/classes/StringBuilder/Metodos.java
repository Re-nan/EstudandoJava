package estudando.classes.StringBuilder;

//Principais métodos da classe java.lang.StringBuilder

public class Metodos {
	public static void main(String[] args) {
		
		StringBuilder nome = new StringBuilder("RENAN");
		String sobreNome = "PS";
		
		System.out.println("\nappend(String)");
		/* append(String) Concatena String, sempre insere no final da String */
		nome.append(sobreNome);
		System.out.println(nome); //Exibe RENANPS
		
		
		System.out.println("\ndelete(int, int)");
		/* delete(int, int) Remove parte de uma String 
		 * 
		 * Perceba que 7 é uma posição sem letra, ele nunca trás a posição final
		 * Leia-se: Remova o que começa na posição 5 até tudo o que está antes da posição 7
		 */
		nome.delete(5, 7);
		System.out.println(nome); //Exibe RENAN	
		
		
		System.out.println("\ninsert(int, String)");
		/* insert(int, String) Insere uma String em uma determinada posição mediante posição inicial
		 * e a String que você quer encaixar
		 * 
		 * Perceba que 5 é a posição vazia sem character
		 */
		nome.insert(5, " PS");
		System.out.println(nome); //Exibe RENAN PS
		
		
		System.out.println("\nreverse()");
		/* reverse() inverte os caracteres */
		nome.reverse();
		System.out.println(nome); //Exibe SP NANER
		
		
		System.out.println("\ntoString()");
		/* toString() retorna o conteúdo do obj como uma String */
		nome.toString();
		System.out.println(nome); //Exibe SP NANER
		
		
		
		
		

	}

}
