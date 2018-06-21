package estudando.poo.Abstract2;

public abstract class Funcionario {

	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	/* public double getBonus() {
	 *	return salario * 0.2;
	 * }
	 *
	 * Não faz sentido termos a implementação de getBonus em Funcionario pois assim todos os funcionarios seja
	 * o Gerente ou o limpador de chão teriam o mesmo salário multiplicado pelo mesmo valor, e na regra de negócio
	 * cada cargo tem uma bonificação diferente. 
	 * 
	 * Portando devemos deixar a obrigação de cada funcionario ter um bonus a ser calculado deixando a classe e o método
	 * como abstrato e ainda ser calculado de forma diferente para cada Override/sobreescrita
	 * 
	 * Obs: Toda classe que tem pelo menos um método abstrato é obrigada a ser abstrata também
	 */
	
	public abstract double getBonus();

}
