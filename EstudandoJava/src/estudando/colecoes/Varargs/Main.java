package estudando.colecoes.Varargs;

/* varargs permitem que métodos possam receber um número variável de parametros
 * 
 */

public class Main {
	public static void main(String[] args) {
		
		System.out.println(somar()); //0
		System.out.println(somar(10,20)); //30
		System.out.println(somar(10,20,30)); //60
		
		/* perceba que pro java de fato é como se você passassse um array */
		int[] array = {1, 2,3, 4};
		System.out.println(somar(array)); //10
		
		
		
		System.out.println(somar2(10,5,5)); //20
		System.out.println(somar2(20,array)); //30;

	}
	
	
	
	
	
	
	/* varargs em ação
	 * o método somar pode receber 0 ou mais parametros do tipo int
	 * é como se você passasse um array como parametro que o tamanho do array já
	 * é definiddo pela qtd de parametros que você passa.
	 * 
	 * sempre que você usa varargs os parametros tem que ser do mesmo tipo, por isso
	 * é um array que vc passa internamente pro java
	 */
	 static int somar(int... valores){
		
		/* para implementar valores, pense... se é um vetor que você recebe como
		 * parametro, então tenho que varrer o vetor e somar tudo o que tiver nele
		 */
		int soma = 0;
		for(int valor: valores){
			soma += valor;
		}
		return soma;
	}
	 
	 /* você pode misturar varargs como parametros normais, porém os vargs TEM QUE
	  * serem sempre os ultimos parametros declarados no método
	  */
	 static int somar2(int n1, int... valores){
			
			/* para implementar valores, pense... se é um vetor que você recebe como
			 * parametro, então tenho que varrer o vetor e somar tudo o que tiver nele
			 */
			
			for(int valor: valores){
				n1 += valor;
			}
			return n1;
		}
	 

}
