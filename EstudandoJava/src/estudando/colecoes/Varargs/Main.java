package estudando.colecoes.Varargs;

/* varargs permitem que m�todos possam receber um n�mero vari�vel de parametros
 * 
 */

public class Main {
	public static void main(String[] args) {
		
		System.out.println(somar()); //0
		System.out.println(somar(10,20)); //30
		System.out.println(somar(10,20,30)); //60
		
		/* perceba que pro java de fato � como se voc� passassse um array */
		int[] array = {1, 2,3, 4};
		System.out.println(somar(array)); //10
		
		
		
		System.out.println(somar2(10,5,5)); //20
		System.out.println(somar2(20,array)); //30;

	}
	
	
	
	
	
	
	/* varargs em a��o
	 * o m�todo somar pode receber 0 ou mais parametros do tipo int
	 * � como se voc� passasse um array como parametro que o tamanho do array j�
	 * � definiddo pela qtd de parametros que voc� passa.
	 * 
	 * sempre que voc� usa varargs os parametros tem que ser do mesmo tipo, por isso
	 * � um array que vc passa internamente pro java
	 */
	 static int somar(int... valores){
		
		/* para implementar valores, pense... se � um vetor que voc� recebe como
		 * parametro, ent�o tenho que varrer o vetor e somar tudo o que tiver nele
		 */
		int soma = 0;
		for(int valor: valores){
			soma += valor;
		}
		return soma;
	}
	 
	 /* voc� pode misturar varargs como parametros normais, por�m os vargs TEM QUE
	  * serem sempre os ultimos parametros declarados no m�todo
	  */
	 static int somar2(int n1, int... valores){
			
			/* para implementar valores, pense... se � um vetor que voc� recebe como
			 * parametro, ent�o tenho que varrer o vetor e somar tudo o que tiver nele
			 */
			
			for(int valor: valores){
				n1 += valor;
			}
			return n1;
		}
	 

}
