package estudando.exceptions.StackTrace3;

public class Main {
	public static void main(String[] args) {

		Pista p = new Pista();

		try {

			p.iniciar();

		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
//		estudando.exception.StackTrace3.PistaException: problema na pista
//		at estudando.exception.StackTrace3.Pista.iniciar(Pista.java:24)
//		at estudando.exception.StackTrace3.Main.main(Main.java:10)
//	Caused by: estudando.exception.StackTrace3.AcimaVelocidadeMaximaException: Excedeu a velocidade máxima
//		at estudando.exception.StackTrace3.Automovel.acelerar(Automovel.java:11)
//		at estudando.exception.StackTrace3.Pista.iniciar(Pista.java:20)
//		... 1 more
		
		/* Perceba que a Stack Trace já ficou um pouco maior, vamos entender o que aconteceu...
		 * 
		 * Basicamente quando você trabalha com exceções internas(inner exceptions) em algum ponto da
		 * Stack Trace você vai encontrar o "Caused by", o Caused by é justamente o local que mostra
		 * pra você quem foi a exceção original
		 * 
		 * A linha de baixo do Caused by mostra a Classe e linha da exceção original 
		 *
		 *Em Stack Traces enormes quanto mais você ir lendo a Stack Trace de cima para baixo, você vai
		 * chegando mais próximo da exceção original
		 */	
	}
}
