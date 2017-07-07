package estudando.exceptions.CheckedExceptionsPart2;

//Criando classe exce��o para tratar saldo insuficiente

//Toda classe que herda de Exception, � uma exception

/* Essa notifica��o/warning � do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso s� interessa quando se est� trabalhando com serializa��o, se quiser eliminar a notifica��o, desative em preferences
 * ou adicione a nota��o @SuppressWarnings("serial"), mas � opcional, se quiser pode deixar sem
 */
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
