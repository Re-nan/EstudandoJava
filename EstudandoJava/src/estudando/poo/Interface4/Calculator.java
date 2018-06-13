package estudando.poo.Interface4;

public interface Calculator {

	// m�todo comum de uma interface, quem herda � obrigado a implementar
	double calculate();
	
	
	
	// Implementando um m�todo dentro de uma interface voc� deve utilizar o modificador default
	default double calculatePow(double x, int y) {
		return Math.pow(x, y);
	}
	
	/* PS: As classes que implementam esta interface n�o s�o obrigadas a implementarem este m�todo,
	 * elas ter�o acesso ao m�todo como se ele fosse um m�todo qualquer herdado de uma classe
	 */
	
	
	
	
	/* Criando um m�todo est�tico, similar ao default, por�m usa-se o modificador static, e a chamanda
	 * tem ser pela pr�pria interface, ex: Calculator.calculatePow2(10,2);
	 */
	static double calculatePow2(double x, int y) {
		return Math.pow(x, y);
	}
	
	
}
