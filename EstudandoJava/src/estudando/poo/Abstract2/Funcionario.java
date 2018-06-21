package estudando.Abstract2;

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
	 * N�o faz sentido termos a implementa��o de getBonus em Funcionario pois assim todos os funcionarios seja
	 * o Gerente ou o limpador de ch�o teriam o mesmo sal�rio multiplicado pelo mesmo valor, e na regra de neg�cio
	 * cada cargo tem uma bonifica��o diferente. 
	 * 
	 * Portando devemos deixar a obriga��o de cada funcionario ter um bonus a ser calculado deixando a classe e o m�todo
	 * como abstrato e ainda ser calculado de forma diferente para cada Override/sobreescrita
	 * 
	 * Obs: Toda classe que tem pelo menos um m�todo abstrato � obrigada a ser abstrata tamb�m
	 */
	
	public abstract double getBonus();

}
