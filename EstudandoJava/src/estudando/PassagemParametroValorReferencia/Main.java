package estudando.PassagemParametroValorReferencia;

/* O JAVA s� permite passagem de parametros por C�PIA, que significa que tudo o
 * que voc� passa como par�metro � COPIADO, OU SEJA o conte�do da var que voc�
 * est� passando que � COPIADO. 
 */

public class Main {
	public static void main(String[] args) {

		Operacao o = new Operacao();

		int x = 10;
		o.trocar(x);
		System.out.println(x);// x vale 10 ou 20? � 10

		/* PASSAGEM DE PARAMETRO POR C�PIA DE VALOR � quando voc� cria x 
		 * com valor 10, est� var � criada na stack, quando vc chama o metodo
		 * trocar passando essa var como parametro, O java cria uma c�pia do 
		 * valor de x, que � 10. Portando no m�todo trocar(int n) o java cria a
		 * var n na stack, que recebe UMA C�PIA do valor DE QUEM INVOCOU, ou seja: 
		 * de quem veio como parametro
		 * 
		 * Ent�o tanto x como n recebem o valor 10, por�m no meio do m�todo n
		 * recebe 20, e x sempre continuar� sendo 10, at� que mude seu valor
		 */

		Valor valor1 = new Valor();

		valor1.v = 10;
		o.alterarValor1(valor1);
		System.out.println(valor1.v);// v vale 10 ou 20? � 20

		/* PASSAGEM DE PARAMETRO POR REFERENCIA � quando ao inv�s do valor da var 
		 * primitiva ou var tipo classe, voc� passa a mesma ref�ncia(sem c�pia) da
		 * �rea de mem�ria daquela v�riavel como parametro, ISSO NO JAVA 
		 * N�O EXISTE!
		 * 
		 * O QUE EXISTE �
		 * 
		 * PASSAGEM DE PARAMETRO POR C�PIA DE REFERENCIA a c�pia da MESMA referencia 
		 * para outra variavel(a do parametro), OU SEJA 2 variaveis(com a mesma referencia)
		 * apontando para O MESMO obj
		 * 
		 * ent�o se umas das refer�ncias(uma das var) alterar o valor, TODAS as
		 * referencias(todas as var) que manipulam esse obj, tem seu valor
		 * alterado, pois aponstam pro mesmo endere�o de mem�ria
		 */

		Valor valor2 = new Valor();

		valor2.v = 10;
		o.alterarValor2(valor2);
		System.out.println(valor2.v);// v vale 10 ou 20? AGORA � 10

		/* � 10 porque ao chamar esse novo m�todo alterarValor2(), a v�riavel do
		 * parametro que recebe uma c�pia da referencia � usada para dar um new
		 * Valor() sendo assim referenciando um novo obj que foi criado na
		 * mem�ria, ent�o dentro do m�todo voc� est� manipulando o novo obj e n�o
		 * mais o antigo.
		 */
		

		
		System.out.println();
		 
		Valor A = new Valor(); A.v = 100;
		Valor B = new Valor(); B = A; // A e B apontam pro mesmo endere�o de memoria
		A = null; // Mesmo que uma das duas receba null a outra continua viva
		System.out.println(B.v);// Exibe 100

	}
}
