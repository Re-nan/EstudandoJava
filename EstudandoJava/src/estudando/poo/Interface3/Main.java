package estudando.poo.Interface3;

/* Aqui temos uma sistema aonde só pode logar nele quem for Gerente, Diretor ou Cliente, quem não for NÃO PODE
 * 
 * Para se autenticar não precisa ser Funcionário, mas sim Gerente, Diretor ou Cliente, logo podemos isolar
 * essa característica/recurso do sistema.
 * 
 * A solução foi criar uma interface que permite se autenticar no sistema somente quem implementar ela
 * com isso eu atribuo ela somente para quem eu quero que se autentique no meu sistema, sendo assim
 * livrando da obrigação de que só pode logar quem for Funcionário
 * 
 * Quem quiser ser "autenticavel", precisa implementar o método autenticar da interface Autenticavel
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
		 * garantindo que A MESMA referencia como Diretor possa então acessar suas funções como Autenticavel
		 */  
		Autenticavel diretorAutenticavel = diretor;
		System.out.println(sistema.login(diretorAutenticavel));
		
		
		System.out.println(sistema.login(gerente));
		System.out.println(sistema.login(cliente));
		
		
	}

}
