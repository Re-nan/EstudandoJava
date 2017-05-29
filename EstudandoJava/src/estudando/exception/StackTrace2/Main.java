package estudando.exception.StackTrace2;

public class Main {
	public static void main(String[] args) {

		Automovel a = new Automovel();

		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaVelocidadeMaximaException e) {

			System.out.println("Erro: Acima da velocidade Permitida");
			e.printStackTrace(); 								
		}
	}
}
