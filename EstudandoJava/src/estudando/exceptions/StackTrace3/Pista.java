package estudando.exception.StackTrace3;

/* A classe Pista quem está responsável pela inicialização do
 * obj do tipo Automovel
 * 
 * Ao ocorrer a exceção do tipo AcimaVelocidadeMaximaException
 * ela lança uma nova exceção do tipo PistaException pra fora
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
			/* Perceba que estou passando a exceção original no construtor de PistaException
			 * Isso significa que PistaException carregar a exceção orginal dentro dela
			 * 
			 * Isso chamamos de "Inner Exception", uma exceção que causou outra exceção
			 * Essa situação é para quando alguém quiser tratar essa exceção lançada
			 * e quiser acessar a exceção interna com mais detalhes originalmente
			 */
		}
	}
}
