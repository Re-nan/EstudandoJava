package estudando.Abstract2;

public class Gerente extends Funcionario {

	@Override
	public double getBonus() {
		
		//return this.salario * 2; //se salario em Funcionario fosse protected que vem de Funcionario
		// OU 
		return this.getSalario() * 4; 
	}

	public void cobrarEntrega() {

	}


}
