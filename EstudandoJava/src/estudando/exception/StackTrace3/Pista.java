package estudando.exception.StackTrace3;

/* A classe Pista quem est� respons�vel pela inicializa��o do
 * obj do tipo Automovel
 * 
 * Ao ocorrer a exce��o do tipo AcimaVelocidadeMaximaException
 * ela lan�a uma nova exce��o do tipo PistaException pra fora
 * desse metodo
 */

public class Pista {

	public void iniciar() throws PistaException {

		Automovel a = new Automovel();

		try {

			a.acelerar(100);
			a.acelerar(90);

		} catch (AcimaVelocidadeMaximaException e) {

			throw new PistaException("problema na pista", e);
			/* Perceba que estou passando a exce��o original no construtor de PistaException
			 * Isso significa que PistaException carregar a exce��o orginal dentro dela
			 * 
			 * Isso chamamos de "Inner Exception", uma exce��o que causou outra exce��o
			 * Essa situa��o � para quando algu�m quiser tratar essa exce��o lan�ada
			 * e quiser acessar a exce��o interna com mais detalhes originalmente
			 */
		}
	}
}
