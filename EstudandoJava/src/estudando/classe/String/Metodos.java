package estudando.classe.String;

//Principais m�todos da classe java.lang.String

public class Metodos {
	public static void main(String[] args) {
		
		String nome = "Renan";
		
		System.out.println("\ncharAt(int)");
		/* charAt(int) Retorna o caracter de uma posi��o */
		System.out.println(nome.charAt(0)); //retorna R
		
		
		System.out.println("\nindexOf(String)");
		/* indexOf(String) retorna a posi��o em que uma String aparece pela primeira vez na String principal */
		System.out.println(nome.indexOf('n')); //retorna 2
		
		
		System.out.println("\nlength()");
		/* length() Retorna o tamanho, a qtd de characters da String */
		System.out.println(nome.length()); //retorna 5
		
		
		
		System.out.println("\nsubString(int, int)");
		/* subString(int, int) Retorna uma parte da string como uma nova String, mediante uma posi��o inicial e final
		 *  String Renan retorna nan
		 * Perceba que 5 � uma posi��o sem letra, ele nunca tr�s a posi��o final
		 * Leia-se: Traga o que come�a na posi��o 2 at� tudo o que est� antes da posi��o 5 
		 * 
		 * tanto faz usar a var nome como a String em HARD CODE, afinal ambas s�o String
		 */
		System.out.println("Renan".substring(2, 5)); //Retorna nan
		
		
		
		System.out.println("\ntoLowerCase()");
		/* toLowerCase() Retorna os caracteres em min�sculo */
		System.out.println(nome.toLowerCase()); //retorna renan
		
		System.out.println("\ntoUpperCase()");
		/* toUpperCase() Retorna os caracteres em mai�sculo */
		System.out.println(nome.toUpperCase()); // retorna RENAN
		
		
		
		System.out.println("\nsplit(String)");
		/* split(String) Divide a String de acordo com um caracter crit�rio como v�rgula, ponto, tra�o, underline e etc... 
		 * e retorna essa String em um vetor
		 * 
		 * Sempre que encontrar um - na string ele quarda esse valor em uma posi��o do nomeVet[] 
		 */
		nome = "RE-NA-N";
		String nomeVet[] = nome.split("-");
		
		for (int i = 0; i < nomeVet.length; i++) {
			System.out.println("Posi��o: " + i + "\n  Valor: " + nomeVet[i]);
		}


	}

}
