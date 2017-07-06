package estudando.exception.CheckedExceptionsPart1;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //O throws diz que este método pode ou não lançar uma exceção
    public void sacar(double valor) throws Exception{

        if(valor <= 0){
            //Quando o fluxo chega em uma clausula throw o método imediatamente para de funcionar
            throw new Exception("O valor para saque é negativo!");
        }
        
        if(this.saldo - valor < 0){
            throw new Exception("O saldo é insuficiente!");
        }
        
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
}

