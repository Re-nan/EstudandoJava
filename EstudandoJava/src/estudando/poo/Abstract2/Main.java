package estudando.poo.Abstract2;

/* Hierarquia de classes
 * 
 * A classe abstract Funcionario � a classe m�e de todas
 * 
 * Abaixo dela temos como filha a classe abstract Secretaria, e de Secretaria temos as filhas SecretariaAgencia e
 * SecretariaAdministrativa, como Secretaria tamb�m � abstrata ent�o ela n�o precisa implementar os m�todos abstratos
 * de Funcionario, essa obriga��o fica paras as filhas de Secretaria desde que sejam classes concretas e n�o abstratas
 * 
 * Ainda abaixo de Funcionario temos as classes concretas Presidente e Gerente, ambas por serem concretas e herdarem
 * de Funcion�rio precisam implementar os m�todos que s�o abstract em Funcion�rio.
 * 
 * Abaixo de Presidente n�o temn ingu�m, por�m abaixo de Gerente tem Diretor e ele por herdar de Gerente, herda
 * consecutivamente o m�todo abstrato implementado de Gerente
 */

public class Main {
	public static void main(String[] args) {
		
		/* N�o faz sentido termos instancias de Funcionario pois Funcionario � uma coisa gen�rica, ABSTRATA
		 * ela n�o diz nada, n�o diz que tipo de funcionario �, por isso devemos sempre abstrair a regra de neg�cio
		 * 
		 * O polimorfismo � a capacidade de eu chamar esse meu gerente g1 tanto de Gerente como de Funcionario
		 */
		
		/* Funcionario gerente = new Gerente();
		 * gerente.cobrarEntrega();
		 * Da erro porque uma referencia Funcionario s� pode chamar m�todos que ela tem em comum com Gerente
		 * afinal... qualquer Funcionario poderia cobrarEntrega? K K K
		 */

		//Gerente
		Gerente gerente = new Gerente();
		gerente.setNome("Gerente");
		gerente.setSalario(1000);
		gerente.cobrarEntrega();
		System.out.println("Bonus do Gerente: " + gerente.getBonus());


		//Diretor
		Diretor diretor = new Diretor();
		diretor.setNome("Diretor");
		diretor.setSalario(6000);
		System.out.println("Bonus do Diretor: " + diretor.getBonus());
		
		
		//Presidente
		Presidente presidente = new Presidente();
		presidente.setNome("Presidente");
		presidente.setSalario(10000);
		System.out.println("Bonus do Presidente: " + presidente.getBonus());
		
		
		//SecretariaAgencia
		SecretariaAgencia secretariaAgencia = new SecretariaAgencia();
		secretariaAgencia.setNome("Secretaria Agencia");
		secretariaAgencia.setSalario(3000);
		System.out.println("Bonus do Secretaria Agencia: " + secretariaAgencia.getBonus());
		
		//secretariaAdministrativa
		SecretariaAdminstrativa secretariaAdministrativa = new SecretariaAdminstrativa();
		secretariaAdministrativa.setNome("Secretaria Administrativa");
		secretariaAdministrativa.setSalario(2000);
		System.out.println("Bonus do Secretaria Adminstrativa: " + secretariaAdministrativa.getBonus());
		
		
		//Totalizador de bonus de todos os Funcionarios
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adicionar(gerente);
		totalizador.adicionar(diretor);
		totalizador.adicionar(presidente);
		totalizador.adicionar(secretariaAgencia);
		totalizador.adicionar(secretariaAdministrativa);
		
		System.out.println("\nTotal de Bonus: " + totalizador.getTotal());

	}

}
