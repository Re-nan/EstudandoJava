package estudando.PassagemParametroValorReferencia;

/**
 * O JAVA s� permite passagem de parametros por C�PIA, que significa que tudo o
 * que voc� passa como par�metro � COPIADO, OU SEJA o conte�do da var que voc�
 * est� passando que � COPIADO. 
 */

public class Main {
	public static void main(String[] args) {

		Operacao o = new Operacao();

		int x = 10;
		o.trocar(x);
		System.out.println(x);// x vale 10 ou 20? � 10

		/*
		 * PASSAGEM POR PARAMETRO(C�PIA DO VALOR) � quando voc� cria x com valor
		 * 10, est� var � criada na stack, quando vc chama o metodo trocar
		 * passando essa var como parametro, O java cria uma c�pia do valor de
		 * x, que � 10. Portando no m�todo trocar(int n) o java cria a var n na
		 * stack, que recebe UMA C�PIA do valor que DE QUEM INVOCOU, ou seja: de
		 * quem veio como parametro
		 * 
		 * Ent�o tanto x como n recebem o valor 10, por�m no meio do m�todo n
		 * recebe 20, e x sempre continuar� sendo 10, at� que mude seu valor
		 */

		Valor valor1 = new Valor();

		valor1.v = 10;
		o.alterarValor1(valor1);
		System.out.println(valor1.v);// v vale 10 ou 20? � 20

		/*
		 * PASSAGEM POR REFERENCIA � quando ao inv�s do valor, voc� passa a
		 * mesma ref�ncia(sem c�pia) da �rea de mem�ria daquela v�riavel como
		 * parametro, para que ela seja alterada dentro do m�todo E ISSO NO JAVA
		 * N�O EXISTE
		 * 
		 * O QUE EXISTE �
		 * 
		 * C�PIA DE REFER�NCIA a c�pia da MESMA referencia para outra variavel,
		 * OU SEJA 2 variaveis(com a mesma referencia) apontando para O MESMO
		 * obj
		 * 
		 * ent�o se umas das refer�ncias(uma das var) alterar o valor, TODAS as
		 * referencias(todas as var) que manipulam esse obj, tem seu valor
		 * alterado
		 */

		Valor valor2 = new Valor();

		valor2.v = 10;
		o.alterarValor2(valor2);
		System.out.println(valor2.v);// v vale 10 ou 20? AGORA � 10

		/*
		 * � 10 porque ao chamar esse novo m�todo alterarValor2(), a v�riavel do
		 * parametro que recebe uma c�pia da referencia � usada para dar um new
		 * Valor() sendo assim referenciando um novo obj que foi criado na
		 * mem�ria ent�o dentro do m�todo voc� est� manipulando o novo obj e n�o
		 * mais o antigo.
		 * 
		 * Ps: se fosse uma passagem por refer�ncia mesmo o valor seria alterado
		 */

	}
}
