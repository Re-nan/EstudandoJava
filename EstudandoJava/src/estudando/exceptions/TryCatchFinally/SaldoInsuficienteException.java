package estudando.exceptions.TryCatchFinally;

//Criando classe exceção para tratar saldo insuficiente

//Toda classe que herda de Exception, é uma exception

/* Essa notificação/warning é do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso só interessa quando se está trabalhando com serialização, se quiser eliminar a notificação, desative em preferences
 * ou adicione a notação @SuppressWarnings("serial"), mas é opcional, se quiser pode deixar sem
 */
@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception{
    
    private double valor;
    private double saldo;
    
    public SaldoInsuficienteException(double valor, double saldo){
        this.valor = valor;
        this.saldo = saldo;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
}
