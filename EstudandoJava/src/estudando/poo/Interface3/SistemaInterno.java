package estudando.poo.Interface3;

public class SistemaInterno {

	/* Autenticavel a = new Gerente();
	 * posso aqui chamar o método autentica!
	 * 
	 *  Mas o mais adequado é passarmos uma referencia autenticavel como parametro
	 */
	
	 boolean login(Autenticavel a) {
	     
		// pega senha de um lugar, ou de um scanner de polegar
		String  senha = "123";
				
	     boolean ok = a.autenticar(senha);
	     return ok;

	     // aqui eu posso chamar o autentica! 
	     // não necessariamente é um Funcionario!
	     // Mais ainda, eu não sei que objeto a 
	     // referência "a" está apontando exatamente! Flexibilidade.
	  }
	
	 
}
