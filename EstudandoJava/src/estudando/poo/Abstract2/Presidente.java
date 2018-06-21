package estudando.poo.Abstract2;

public class Presidente extends Funcionario {

	@Override
	public double getBonus() {
		return this.getSalario() * 5;
	}
}
