package estudando.poo.Interface4;

public interface Calculator {

	// método comum de uma interface, quem herda é obrigado a implementar
	double calculate();
	
	
	
	// Implementando um método dentro de uma interface você deve utilizar o modificador default
	default double calculatePow(double x, int y) {
		return Math.pow(x, y);
	}
	
	/* PS: As classes que implementam esta interface não são obrigadas a implementarem este método,
	 * elas terão acesso ao método como se ele fosse um método qualquer herdado de uma classe
	 */
	
	
	
	
	/* Criando um método estático, similar ao default, porém usa-se o modificador static, e a chamanda
	 * tem de ser pela própria interface, ex: Calculator.calculatePow2(10,2);
	 */
	static double calculatePow2(double x, int y) {
		return Math.pow(x, y);
	}
	
	
}
