package estudando.Interface3;

public class SistemaInterno {

	/* Autenticavel a = new Gerente();
	 * posso aqui chamar o m�todo autentica!
	 * 
	 *  Mas o mais adequado � passarmos uma referencia autenticavel como parametro
	 */
	
	 boolean login(Autenticavel a) {
	     
		// pega senha de um lugar, ou de um scanner de polegar
		String  senha = "123";
				
	     boolean ok = a.autenticar(senha);
	     return ok;

	     // aqui eu posso chamar o autentica! 
	     // n�o necessariamente � um Funcionario!
	     // Mais ainda, eu n�o sei que objeto a 
	     // refer�ncia "a" est� apontando exatamente! Flexibilidade.
	  }
	
	 
}
