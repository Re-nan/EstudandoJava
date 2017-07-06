package estudando.exception.CheckedExceptionsPart2;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //O throws diz que este método pode ou não lançar uma exceção
    //o meu metodo pode lançar mais de uma exceção
    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {

        if (valor <= 0) {
        	//Quando o fluxo chega em uma clausula throw o método imediatamente para de funcionar
            throw new ValorNegativoException(valor);
        }

        if (this.saldo - valor < 0) {
            throw new SaldoInsuficienteException(valor, saldo);
        }

        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
