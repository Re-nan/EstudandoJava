package estudando.exceptions.StackTrace3;

public class Main {
	public static void main(String[] args) {

		Automovel a = new Automovel();

		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaVelocidadeMaximaException e) {

			System.out.println("Erro: Acima da velocidade Permitida");
			e.printStackTrace(); // Caso queira, mesmo tratando o erro, voc� pode
									// pedir para exibir a Stack Trace
		}
	}

	// Erro: Acima da velocidade Permitida
	// estudando.exception.StackTrace.AcimaVelocidadeMaximaException: Excedeu a
	// velocidade m�xima
	// at estudando.exception.StackTrace.Automovel.acelerar(Automovel.java:11)
	// at estudando.exception.StackTrace.Main.main(Main.java:42)

	/* Mais uma vez a aplica��o come�ou na classe Main com o m�todo main, ai
	 * dentro do m�todo main na linha 10 foi chamado o m�todo acelerar
	 * 
	 * Dentro da classe Automovel na linha 11 ao atender a clausula do if
	 * foi lan�ado uma exce��o para AcimaVelocidadeMaximaException
	 * 
	 * De volta a classe Main o m�todo tratou a exce��o com try catch e o
	 * "e.printStackTrace();" monstrou o processo de execu��o na Stack Trace
	 */ 
}
