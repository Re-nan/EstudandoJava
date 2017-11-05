package estudando.Abstract2;

public class SecretariaAgencia extends Secretaria {

	@Override
	public double getBonus() {
		return this.getSalario() * 2;
	}
	
}
