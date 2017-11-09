package estudando.Abstract3;

public class ContaPoupanca extends Conta {

	@Override
	public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

	@Override
    public void depositar(double valor) {
        this.saldo += valor - 0.10;
    }
}
