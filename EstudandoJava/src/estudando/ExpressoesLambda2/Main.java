package estudando.ExpressoesLambda2;

/* Eu s� consigo trabalhar com express�es lambda se eu tamb�m estiver trabalhando
 * com interfaces funcionais
 */

public class Main {

	public static void main(String[] args) {

		/* Implementando interface pelo modo Classe Anonima
		 * Com esse modo vc n�o reaproveita esse c�digo em outros lugares
		 * al�m de ser muito sujo, lambdas vieram para simplificar o c�digo
		 */
		
		Calculator calc = new Calculator() {
			
			@Override
			public void calculate(int x) {
				x = x * x;
				System.out.println(x);
			}
		};
		calc.calculate(10); //100

		
		// Implementando interface Calculator pelo modo Express�es Lambda com retorno void
		
		calc = x -> {
			x = x * x;
			System.out.println(x);
		};
		calc.calculate(10); //100
		
		// OU tudo em uma linha
		//calc = x -> System.out.println(x * x);
		//calc.calculate(10);
		
		
		System.out.println();
		
		// Implementando interface Calculator2 pelo modo Express�es Lambda com retorno int
		Calculator2 calc2 = x -> x * x; 
		int result = calc2.calculate(2);
		System.out.println(result); //4
		
		// Se sua fun��o retorna algo, e se vc usar a palavra return, obrigatoriamente vc tem q usar chaves
		calc2 = x -> {
			return x * x; 
		};
		result = calc2.calculate(2);
		System.out.println(result); //4
	}

}
