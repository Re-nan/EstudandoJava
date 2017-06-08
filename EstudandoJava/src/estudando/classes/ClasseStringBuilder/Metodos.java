package estudando.classes.ClasseStringBuilder;

//Principais m�todos da classe java.lang.StringBuilder

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
		 * Perceba que 7 � uma posi��o sem letra, ele nunca tr�s a posi��o final
		 * Leia-se: Remova o que come�a na posi��o 5 at� tudo o que est� antes da posi��o 7
		 */
		nome.delete(5, 7);
		System.out.println(nome); //Exibe RENAN	
		
		
		System.out.println("\ninsert(int, String)");
		/* insert(int, String) Insere uma String em uma determinada posi��o mediante posi��o inicial
		 * e a String que voc� quer encaixar
		 * 
		 * Perceba que 5 � a posi��o vazia sem character
		 */
		nome.insert(5, " PS");
		System.out.println(nome); //Exibe RENAN PS
		
		
		System.out.println("\nreverse()");
		/* reverse() inverte os caracteres */
		nome.reverse();
		System.out.println(nome); //Exibe SP NANER
		
		
		System.out.println("\ntoString()");
		/* toString() retorna o conte�do do obj como uma String */
		nome.toString();
		System.out.println(nome); //Exibe SP NANER
		
		

	}

}
