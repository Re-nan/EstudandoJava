package estudando.poo.Abstract3;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		// aqui voc� imprime o saldo anterior
		System.out.println("Saldo anterior: " + c.getSaldo());
		
		// atualiza a conta com a taxa selic,
		c.atualizar(this.selic);
		
		// e depois imprime o saldo final(Saldo atualizado com a selic)
		System.out.println("Saldo atualizado com a selic: " + c.getSaldo());
		
		// lembrando de somar o saldo final ao atributo saldoTotal
		this.saldoTotal += c.getSaldo();
	}

	// outros m�todos, colocar o getter para saldoTotal!
	public double getSaldoTotal() {
		return saldoTotal;
	}
	
}
