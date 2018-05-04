package estudando.classes.ClasseObject;

/* Toda classe em Java herda de apenas uma classe, que também pode ser
 * chamada de SUPERCLASSE. Se você não herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object é a superclasse(classe mãe) de todas as classes do java
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
		 * Sempre que você passa um obj para dentro do println() ele vai
		 * chamar o toString do obj
		 */
		System.out.println();
		
		
		/* equals()
		 * É a forma que o java tem de comparar objetos pelo seu conteúdo
		 * ao invés de comparar as referências(como acontece ao usarmos
		 * "==") Lembrando que o == compara se o endereço de memória dos
		 * obj são os mesmos
		 */
		System.out.println();
		
		/* hashCode()
		 * O java cria vários baldes, um que só aceita objs com hash, 5,
		 * outro que só com 10 e outro que só aceita objs com hash 15
		 * 
		 * ao tirar o hash de um obj ele ve o numero e atribui ao balde
		 * do numero sorteado, em um balde eu posso ter mais de um obj
		 * com o mesmo hash
		 * 
		 * Eu posso ter vários objs com o mesmo hash, o que diferencia
		 * é que ai entra o método equals encontra o elemento que você
		 * está comparando dentro daquele balde
		 * 
		 * Resumindo: ele chama o hashCode() primeiro para identificar 
		 * o local que ta e depois o equals
		 * 
		 * a regra é, se você for implementar o hashCode para criar sua 
		 * prória lógica de hash, você deve implementar o equals também
		 * e vice e versa, se implementou o equals na sua classe, então
		 * implemente o hashCode também, essa é a boa prática, mas se
		 * quiser pode usar o hashCode e equals como já são por padrão
		 */
		
		
		


	}

}
