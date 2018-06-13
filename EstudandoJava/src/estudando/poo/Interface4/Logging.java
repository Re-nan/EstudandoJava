package estudando.poo.Interface4;

/* O objetivo desses m�todos � armazenar msgs de logs dentro do BD, por�m eles tem
 * a mesma estrutura, eu deveria centralizar um mesmo c�digo que se repete, s� que no java 8 
 * com m�todos default e static eu n�o conseguia fazer isso, eu tinha que duplicar esta l�gica
 * para n�o ficar uma l�gica duplicada. J� coma  introdu��o do modificador private no java 9
 * eu posso centralizar essa l�gica e reaproveitar ela
 * 
 */

public interface Logging {

	default void logInfo(String msg) {
		// Conecta no DB
		// Grava o log (INFO)
		// Fecha a conex�o 
		log("INFO: " + msg);
	}
	
	default void logError(String msg) {
		// Conecta no DB
		// Grava o log (ERROR)
		// Fecha a conex�o
		log("ERROR: " + msg);
	}
	
	// Protege e centraliza a l�gica em um lugar comum, o m�todo � somente da interface
	private void log(String msg) {
		// Conecta no DB
		// Grava o log
		// Fecha a conex�o 
	}
}
