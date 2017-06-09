package estudando.classes.ClasseString;

//Principais métodos da classe java.lang.String

public class Metodos {
	public static void main(String[] args) {
		
		String nome = "Renan";
		
		System.out.println("\ncharAt(int)");
		/* charAt(int) Retorna o caracter de uma posição */
		System.out.println(nome.charAt(0)); //retorna R
		
		
		System.out.println("\nindexOf(String)");
		/* indexOf(String) retorna a posição em que uma String aparece pela primeira vez na String principal */
		System.out.println(nome.indexOf('n')); //retorna 2
		
		
		System.out.println("\nlength()");
		/* length() Retorna o tamanho, a qtd de characters da String */
		System.out.println(nome.length()); //retorna 5
		
		
		
		System.out.println("\nsubString(int, int)");
		/* subString(int, int) Retorna uma parte da string como uma nova String, mediante uma posição inicial e final
		 *  String Renan retorna nan
		 * Perceba que 5 é uma posição sem letra, ele nunca trás a posição final
		 * Leia-se: Traga o que começa na posição 2 até tudo o que está antes da posição 5 
		 * 
		 * tanto faz usar a var nome como a String em HARD CODE, afinal ambas são String
		 */
		System.out.println("Renan".substring(2, 5)); //Retorna nan
		
		
		
		System.out.println("\ntoLowerCase()");
		/* toLowerCase() Retorna os caracteres em minúsculo */
		System.out.println(nome.toLowerCase()); //retorna renan
		
		System.out.println("\ntoUpperCase()");
		/* toUpperCase() Retorna os caracteres em maiúsculo */
		System.out.println(nome.toUpperCase()); // retorna RENAN
		
		
		
		System.out.println("\nsplit(String)");
		/* split(String) Divide a String de acordo com um caracter critério como vírgula, ponto, traço, underline e etc... 
		 * e retorna essa String em um vetor
		 * 
		 * Sempre que encontrar um - na string ele quarda esse valor em uma posição do nomeVet[] 
		 */
		nome = "RE-NA-N";
		String nomeVet[] = nome.split("-");
		
		for (int i = 0; i < nomeVet.length; i++) {
			System.out.println("Posição: " + i + "\n  Valor: " + nomeVet[i]);
		}


	}

}
