package estudando.poo.Abstract2;

public class SecretariaAdminstrativa extends Secretaria {

	@Override
	public double getBonus() {
		return this.getSalario() * 2;
	}
	
}
