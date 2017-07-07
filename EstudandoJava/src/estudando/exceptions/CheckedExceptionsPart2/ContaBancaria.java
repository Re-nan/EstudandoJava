package estudando.exceptions.CheckedExceptionsPart2;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //O throws diz que este m�todo pode ou n�o lan�ar uma exce��o
    //o meu metodo pode lan�ar mais de uma exce��o
    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {

        if (valor <= 0) {
        	//Quando o fluxo chega em uma clausula throw o m�todo imediatamente para de funcionar
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
