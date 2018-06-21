package estudando.Abstract2;

/* Hierarquia de classes
 * 
 * A classe abstract Funcionario é a classe mãe de todas
 * 
 * Abaixo dela temos como filha a classe abstract Secretaria, e de Secretaria temos as filhas SecretariaAgencia e
 * SecretariaAdministrativa, como Secretaria também é abstrata então ela não precisa implementar os métodos abstratos
 * de Funcionario, essa obrigação fica paras as filhas de Secretaria desde que sejam classes concretas e não abstratas
 * 
 * Ainda abaixo de Funcionario temos as classes concretas Presidente e Gerente, ambas por serem concretas e herdarem
 * de Funcionário precisam implementar os métodos que são abstract em Funcionário.
 * 
 * Abaixo de Presidente não temn inguém, porém abaixo de Gerente tem Diretor e ele por herdar de Gerente, herda
 * consecutivamente o método abstrato implementado de Gerente
 */

public class Main {
	public static void main(String[] args) {
		
		/* Não faz sentido termos instancias de Funcionario pois Funcionario é uma coisa genérica, ABSTRATA
		 * ela não diz nada, não diz que tipo de funcionario é, por isso devemos sempre abstrair a regra de negócio
		 * 
		 * O polimorfismo é a capacidade de eu chamar esse meu gerente g1 tanto de Gerente como de Funcionario
		 */
		
		/* Funcionario gerente = new Gerente();
		 * gerente.cobrarEntrega();
		 * Da erro porque uma referencia Funcionario só pode chamar métodos que ela tem em comum com Gerente
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
