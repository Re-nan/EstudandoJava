package estudando.exceptions.CheckedExceptions3;

public class Conta {

protected double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("Valor Negativo");
		}
		
		this.saldo += valor;
	}
	
	public void sacar(double valor) throws Exception {		
		if(valor < 0) {
			throw new IllegalArgumentException("Valor Negativo");
		}
		
		if(saldo >= valor) {
			this.saldo -= valor;
		}else {
			throw new SaldoInsuficienteException(saldo);
		}
	}
	
	
}
