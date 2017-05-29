package estudando.exception.StackTrace3;

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
//	Caused by: estudando.exception.StackTrace3.AcimaVelocidadeMaximaException: Excedeu a velocidade m�xima
//		at estudando.exception.StackTrace3.Automovel.acelerar(Automovel.java:11)
//		at estudando.exception.StackTrace3.Pista.iniciar(Pista.java:20)
//		... 1 more
		
		/* Perceba que a Stack Trace j� ficou um pouco maior, vamos entender o que aconteceu...
		 * 
		 * Basicamente quando voc� trabalha com exce��es internas(inner exceptions) em algum ponto da
		 * Stack Trace voc� vai encontrar o "Caused by", o Caused by � justamente o local que mostra
		 * pra voc� quem foi a exce��o original
		 * 
		 * A linha de baixo do Caused by mostra a Classe e linha da exce��o original 
		 *
		 *Em Stack Traces enormes quanto mais voc� ir lendo a Stack Trace de cima para baixo, voc� vai
		 * chegando mais pr�ximo da exce��o original
		 */	
	}
}
