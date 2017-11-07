package estudando.Abstract2;

public class Diretor extends Gerente {

	@Override
	public double getBonus() {
		return this.getSalario() * 3;
	}
}
