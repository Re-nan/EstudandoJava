package estudando.exceptions.StackTrace1;

/* Stack Trace(Rastreio de pilha) fornece a causa das exce��es, o ponto
 * onde a exce��o aconteceu. A Stack Trace se inicia de baixo para cima.
 *
 * Em Stack Trace maiores � aconselh�vel olhar a primeira linha do topo 
 * ela � causa mais gen�rica da exce��o, ai voc� vai descendo pra pr�xima
 * linha at� encontrar um Caused by e depois o outro e assim por diante
 */

public class Main {  
	public static void main(String[] args) throws Exception {

		Automovel a = new Automovel();
		
			a.acelerar(100);
			a.acelerar(90);
		
	}
	
	  // Exception in thread "main" estudando.exception.StackTrace.AcimaVelocidadeMaximaException: Excedeu a velocidade m�xima
	  // at estudando.exception.StackTrace.Automovel.acelerar(Automovel.java:11) 
	  // at estudando.exception.StackTrace.Main.main(Main.java:14)
	 
	/*
	 * A aplica��o se iniciou Classe "Main" no pacote
	 * "estudando.exception.StackTrace" e executou o m�todo "main" e dentro do
	 * m�todo main executou o m�todo acelerar na linha 18
	 * 
	 * Na classe Automovel ao executar o m�todo acelerar ele atendeu a estrutura
	 * if e lan�ou a exception AcimaVelocidadeMaximaException na linha 11
	 * 
	 * Ao voltar pra classe Main ele CRASHOU a aplica��o estourando uma
	 * Exception com a mensagem Excedeu a velocidade m�xima, porque ningu�m
	 * tratou a exce��o com um try catch, entao ele a lan�ou pra fora, deixando
	 * a JVM crashar a aplica��o
	 */
}