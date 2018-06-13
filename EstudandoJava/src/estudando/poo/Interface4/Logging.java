package estudando.poo.Interface4;

/* O objetivo desses métodos é armazenar msgs de logs dentro do BD, porém eles tem
 * a mesma estrutura, eu deveria centralizar um mesmo código que se repete, só que no java 8 
 * com métodos default e static eu não conseguia fazer isso, eu tinha que duplicar esta lógica
 * para não ficar uma lógica duplicada. Já coma  introdução do modificador private no java 9
 * eu posso centralizar essa lógica e reaproveitar ela
 * 
 */

public interface Logging {

	default void logInfo(String msg) {
		// Conecta no DB
		// Grava o log (INFO)
		// Fecha a conexão 
		log("INFO: " + msg);
	}
	
	default void logError(String msg) {
		// Conecta no DB
		// Grava o log (ERROR)
		// Fecha a conexão
		log("ERROR: " + msg);
	}
	
	// Protege e centraliza a lógica em um lugar comum, o método é somente da interface
	private void log(String msg) {
		// Conecta no DB
		// Grava o log
		// Fecha a conexão 
	}
}
