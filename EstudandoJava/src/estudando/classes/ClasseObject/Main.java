package estudando.classes.ClasseObject;

/* Toda classe em Java herda de apenas uma classe, que tamb�m pode ser
 * chamada de SUPERCLASSE. Se voc� n�o herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object � a superclasse(classe m�e) de todas as classes do java
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
		 * Sempre que voc� passa um obj para dentro do println() ele vai
		 * chamar o toString do obj
		 */
		System.out.println();
		
		
		/* equals()
		 * � a forma que o java tem de comparar objetos pelo seu conte�do
		 * ao inv�s de comparar as refer�ncias(como acontece ao usarmos
		 * "==") Lembrando que o == compara se o endere�o de mem�ria dos
		 * obj s�o os mesmos
		 */
		System.out.println();
		
		/* hashCode()
		 * O java cria v�rios baldes, um que s� aceita objs com hash, 5,
		 * outro que s� com 10 e outro que s� aceita objs com hash 15
		 * 
		 * ao tirar o hash de um obj ele ve o numero e atribui ao balde
		 * do numero sorteado, em um balde eu posso ter mais de um obj
		 * com o mesmo hash
		 * 
		 * Eu posso ter v�rios objs com o mesmo hash, o que diferencia
		 * � que ai entra o m�todo equals encontra o elemento que voc�
		 * est� comparando dentro daquele balde
		 * 
		 * Resumindo: ele chama o hashCode() primeiro para identificar 
		 * o local que ta e depois o equals
		 * 
		 * a regra �, se voc� for implementar o hashCode para criar sua 
		 * pr�ria l�gica de hash, voc� deve implementar o equals tamb�m
		 * e vice e versa, se implementou o equals na sua classe, ent�o
		 * implemente o hashCode tamb�m, essa � a boa pr�tica, mas se
		 * quiser pode usar o hashCode e equals como j� s�o por padr�o
		 */
		
		
		


	}

}
