package estudando.ExpressoesLambda2;

/* Eu só consigo trabalhar com expressões lambda se eu também estiver trabalhando
 * com interfaces funcionais
 */

public class Main {

	public static void main(String[] args) {

		/* Implementando interface pelo modo Classe Anonima
		 * Com esse modo vc não reaproveita esse código em outros lugares
		 * além de ser muito sujo, lambdas vieram para simplificar o código
		 */
		
		Calculator calc = new Calculator() {
			
			@Override
			public void calculate(int x) {
				x = x * x;
				System.out.println(x);
			}
		};
		calc.calculate(10); //100

		
		// Implementando interface Calculator pelo modo Expressões Lambda com retorno void
		
		calc = x -> {
			x = x * x;
			System.out.println(x);
		};
		calc.calculate(10); //100
		
		// OU tudo em uma linha
		//calc = x -> System.out.println(x * x);
		//calc.calculate(10);
		
		
		System.out.println();
		
		// Implementando interface Calculator2 pelo modo Expressões Lambda com retorno int
		Calculator2 calc2 = x -> x * x; 
		int result = calc2.calculate(2);
		System.out.println(result); //4
		
		// Se sua função retorna algo, e se vc usar a palavra return, obrigatoriamente vc tem q usar chaves
		calc2 = x -> {
			return x * x; 
		};
		result = calc2.calculate(2);
		System.out.println(result); //4
	}

}
