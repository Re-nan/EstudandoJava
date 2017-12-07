package estudando.exceptions.CheckedExceptions3;

public class SaldoInsuficienteException extends RuntimeException {

private final double saldoAtual;
	
	public SaldoInsuficienteException(double saldoAtual) {
		super("Saldo Insuficiente: " + saldoAtual);
		this.saldoAtual = saldoAtual;
	}
	
	public double getSaldoAtual() {
		return saldoAtual;
	}
	
}
