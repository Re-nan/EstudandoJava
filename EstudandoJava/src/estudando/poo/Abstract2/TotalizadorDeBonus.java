package estudando.Abstract2;

/* Estamos utilizando aqui a classe TotalizadorDeBonus para o polimorfismo. Se não fosse ela,
 * teríamos um grande prejuízo: precisaríamos criar um método adicionar para receber o
 * bonus de cada um dos tipos de Funcionario, um para Gerente, um para Diretor, etc. 
 * Repare que perder esse poder é muito pior do que a pequena vantagem que a herança 
 * traz em herdar código.
 * 
 * Porém, em alguns sistemas, como é o nosso caso, usamos uma classe com apenas esses 
 * intuitos: de economizar um pouco código e ganhar polimorfismo para criar métodos 
 * mais genéricos, que se encaixem a diversos objetos.
 *  
 * Faz sentido ter um objeto do tipo Funcionario? Essa pergunta é diferente de saber 
 * se faz sentido ter uma referência do tipo Funcionario: nesse caso, faz sim e é 
 * muito útil.
 * 
 * Referenciando Funcionario temos o polimorfismo de referência, já que podemos receber
 * qualquer objeto que seja um Funcionario. Porém, dar new em Funcionario pode não 
 * fazer sentido, isto é, não queremos receber um objeto do tipo Funcionario, mas sim 
 * que aquela referência seja ou um Gerente, ou um Diretor, etc. Algo mais concreto 
 * que um Funcionario.
 */

public class TotalizadorDeBonus {
	
	private double total = 0;

	public double getTotal() {
		return total;
	}
	
	
	/* Recebe um funcionario qualquer, sendo assim tanto faz ele ser gerente, diretor ou faxineiro
	 * desde que seja um Funcionario e de que implemente o método abstrato getBonus() de Funcionario, ta tudo certo
	 */
	public void adicionar(Funcionario f) {
		total += f.getBonus();
	}
	

}
