package estudando.exception.TryCatchFinally;

//Criando classe exce��o para tratar valor negativo

//Toda classe que herda de Exception, � uma exception

/* Essa notifica��o/warning � do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso s� interessa quando se est� trabalhando com serializa��o, se quiser eliminar a notifica��o, desative em preferences
 * ou adicione a nota��o @SuppressWarnings("serial"), mas � opcional, se quiser pode deixar sem
 */
@SuppressWarnings("serial")
public class ValorNegativoException extends Exception{
    
    private double valor;
    
    public ValorNegativoException(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }
}
