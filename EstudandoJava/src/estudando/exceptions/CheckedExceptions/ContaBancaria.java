package estudando.exceptions.CheckedExceptions;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //O throws diz que este m�todo pode ou n�o lan�ar uma exce��o
    public void sacar(double valor) throws Exception{

        if(valor <= 0){
            //Quando o fluxo chega em uma clausula throw o m�todo imediatamente para de funcionar
            throw new Exception("O valor para saque � negativo!");
        }
        
        if(this.saldo - valor < 0){
            throw new Exception("O saldo � insuficiente!");
        }
        
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
}

