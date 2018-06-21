package estudando.poo.Abstract2;

/* Estamos utilizando aqui a classe TotalizadorDeBonus para o polimorfismo. Se n�o fosse ela,
 * ter�amos um grande preju�zo: precisar�amos criar um m�todo adicionar para receber o
 * bonus de cada um dos tipos de Funcionario, um para Gerente, um para Diretor, etc. 
 * Repare que perder esse poder � muito pior do que a pequena vantagem que a heran�a 
 * traz em herdar c�digo.
 * 
 * Por�m, em alguns sistemas, como � o nosso caso, usamos uma classe com apenas esses 
 * intuitos: de economizar um pouco c�digo e ganhar polimorfismo para criar m�todos 
 * mais gen�ricos, que se encaixem a diversos objetos.
 *  
 * Faz sentido ter um objeto do tipo Funcionario? Essa pergunta � diferente de saber 
 * se faz sentido ter uma refer�ncia do tipo Funcionario: nesse caso, faz sim e � 
 * muito �til.
 * 
 * Referenciando Funcionario temos o polimorfismo de refer�ncia, j� que podemos receber
 * qualquer objeto que seja um Funcionario. Por�m, dar new em Funcionario pode n�o 
 * fazer sentido, isto �, n�o queremos receber um objeto do tipo Funcionario, mas sim 
 * que aquela refer�ncia seja ou um Gerente, ou um Diretor, etc. Algo mais concreto 
 * que um Funcionario.
 */

public class TotalizadorDeBonus {
	
	private double total = 0;

	public double getTotal() {
		return total;
	}
	
	
	/* Recebe um funcionario qualquer, sendo assim tanto faz ele ser gerente, diretor ou faxineiro
	 * desde que seja um Funcionario e de que implemente o m�todo abstrato getBonus() de Funcionario, ta tudo certo
	 */
	public void adicionar(Funcionario f) {
		total += f.getBonus();
	}
	

}
