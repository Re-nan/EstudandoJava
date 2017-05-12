package estudando.PassagemParametroValorReferencia;

/**
 * O JAVA só permite passagem de parametros por CÓPIA, que significa que tudo o
 * que você passa como parâmetro é COPIADO, OU SEJA o conteúdo da var que você
 * está passando que é COPIADO. 
 */

public class Main {
	public static void main(String[] args) {

		Operacao o = new Operacao();

		int x = 10;
		o.trocar(x);
		System.out.println(x);// x vale 10 ou 20? É 10

		/*
		 * PASSAGEM POR PARAMETRO(CÓPIA DO VALOR) É quando você cria x com valor
		 * 10, está var é criada na stack, quando vc chama o metodo trocar
		 * passando essa var como parametro, O java cria uma cópia do valor de
		 * x, que é 10. Portando no método trocar(int n) o java cria a var n na
		 * stack, que recebe UMA CÓPIA do valor que DE QUEM INVOCOU, ou seja: de
		 * quem veio como parametro
		 * 
		 * Então tanto x como n recebem o valor 10, porém no meio do método n
		 * recebe 20, e x sempre continuará sendo 10, até que mude seu valor
		 */

		Valor valor1 = new Valor();

		valor1.v = 10;
		o.alterarValor1(valor1);
		System.out.println(valor1.v);// v vale 10 ou 20? É 20

		/*
		 * PASSAGEM POR REFERENCIA É quando ao invés do valor, você passa a
		 * mesma refência(sem cópia) da área de memória daquela váriavel como
		 * parametro, para que ela seja alterada dentro do método E ISSO NO JAVA
		 * NÃO EXISTE
		 * 
		 * O QUE EXISTE É
		 * 
		 * CÓPIA DE REFERÊNCIA a cópia da MESMA referencia para outra variavel,
		 * OU SEJA 2 variaveis(com a mesma referencia) apontando para O MESMO
		 * obj
		 * 
		 * então se umas das referências(uma das var) alterar o valor, TODAS as
		 * referencias(todas as var) que manipulam esse obj, tem seu valor
		 * alterado
		 */

		Valor valor2 = new Valor();

		valor2.v = 10;
		o.alterarValor2(valor2);
		System.out.println(valor2.v);// v vale 10 ou 20? AGORA É 10

		/*
		 * é 10 porque ao chamar esse novo método alterarValor2(), a váriavel do
		 * parametro que recebe uma cópia da referencia é usada para dar um new
		 * Valor() sendo assim referenciando um novo obj que foi criado na
		 * memória então dentro do método você está manipulando o novo obj e não
		 * mais o antigo.
		 * 
		 * Ps: se fosse uma passagem por referência mesmo o valor seria alterado
		 */

	}
}
