package estudando.Interface3;

/* Aqui temos uma sistema aonde s� pode logar nele quem for Gerente, Diretor ou Cliente, quem n�o for N�O PODE
 * 
 * Para se autenticar n�o precisa ser Funcion�rio, mas sim Gerente, Diretor ou Cliente, logo podemos isolar
 * essa caracter�stica/recurso do sistema.
 * 
 * A solu��o foi criar uma interface que permite se auentenciar no sistema somente quem implementar ela
 * com isso eu atribuo ela somente para quem eu quero que se autentique no meu sistema, sendo assim
 * livrando da obriga��o de que s� pode logar quem for Funcion�rio
 * 
 * Quem quiser ser "autenticavel", precisa implementar o m�todo autenticar da interface Autenticavel
 */

public class Main {
	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		
		Diretor diretor = new Diretor();
		diretor.setSenha("123");
		
		Gerente gerente = new Gerente();
		gerente.setSenha("123456");
		
		Cliente cliente = new Cliente();
		cliente.setSenha("123");
		
		
		/* Perceba que estou atribuindo uma referencia Diretor(diretor) para uma referencia Autenticavel(diretorAutenticavel), 
		 * garantindo que A MESMA referencia como Diretor possa ent�o acessar suas fun��es como Autenticavel
		 */  
		Autenticavel diretorAutenticavel = diretor;
		System.out.println(sistema.login(diretorAutenticavel));
		
		
		System.out.println(sistema.login(gerente));
		System.out.println(sistema.login(cliente));
		
		
	}

}
