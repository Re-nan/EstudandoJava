package estudando.PassagemParametroValorReferencia;

/**
 * Recebe qualquer valor e troca por 20
 */
public class Operacao {

	void trocar(int n) {
		n = 20;
	}

	void alterarValor1(Valor valor) {
		valor.v = 20;
	}

	void alterarValor2(Valor valor) {
		valor = new Valor();
		valor.v = 20;
	}
}