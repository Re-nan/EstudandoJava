package estudando.exceptions.StackTrace2;

public class Main {
	public static void main(String[] args) {

		Automovel a = new Automovel();

		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaVelocidadeMaximaException e) {

			System.out.println("Erro: Acima da velocidade Permitida");
			e.printStackTrace(); // Caso queira, mesmo tratando o erro, você pode
									// pedir para exibir a Stack Trace
		}
	}

	// Erro: Acima da velocidade Permitida
	// estudando.exception.StackTrace.AcimaVelocidadeMaximaException: Excedeu a
	// velocidade máxima
	// at estudando.exception.StackTrace.Automovel.acelerar(Automovel.java:11)
	// at estudando.exception.StackTrace.Main.main(Main.java:42)

	/* Mais uma vez a aplicação começou na classe Main com o método main, ai
	 * dentro do método main na linha 10 foi chamado o método acelerar
	 * 
	 * Dentro da classe Automovel na linha 11 ao atender a clausula do if
	 * foi lançado uma exceção para AcimaVelocidadeMaximaException
	 * 
	 * De volta a classe Main o método tratou a exceção com try catch e o
	 * "e.printStackTrace();" monstrou o processo de execução na Stack Trace
	 */ 
}
