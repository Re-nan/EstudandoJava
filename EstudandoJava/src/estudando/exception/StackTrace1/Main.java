package estudando.exception.StackTrace1;

/* Stack Trace(Rastreio de pilha) fornece a causa das exceções, o ponto
 * onde a exceção aconteceu. A Stack Trace se inicia de baixo para cima.
 *
 * Em Stack Trace maiores pe aconselhável olhar a primeira linha do topo 
 * ela é causa mais genérica da exceção, ai você vai descendo pra próxima
 * linha até encontrar um Caused by e depois o outro e assim por diante
 */

public class Main {  
	public static void main(String[] args) throws Exception {

		Automovel a = new Automovel();
		
			a.acelerar(100);
			a.acelerar(90);
		
	}
	
	  // Exception in thread "main" estudando.exception.StackTrace.AcimaVelocidadeMaximaException: Excedeu a velocidade máxima
	  // at estudando.exception.StackTrace.Automovel.acelerar(Automovel.java:11) 
	  // at estudando.exception.StackTrace.Main.main(Main.java:14)
	 
	/*
	 * A aplicação se iniciou Classe "Main" no pacote
	 * "estudando.exception.StackTrace" e executou o método "main" e dentro do
	 * método main executou o método acelerar na linha 18
	 * 
	 * Na classe Automovel ao executar o método acelerar ele atendeu a estrutura
	 * if e lançou a exception AcimaVelocidadeMaximaException na linha 11
	 * 
	 * Ao voltar pra classe Main ele CRASHOU a aplicação estourando uma
	 * Exception com a mensagem Excedeu a velocidade máxima, porque ninguém
	 * tratou a exceção com um try catch, entao ele a lançou pra fora, deixando
	 * a JVM crashar a aplicação
	 */
}