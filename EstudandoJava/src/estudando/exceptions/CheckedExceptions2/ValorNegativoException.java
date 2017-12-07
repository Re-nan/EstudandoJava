package estudando.exceptions.CheckedExceptions2;

//Criando classe exceção para tratar valor negativo

//Toda classe que herda de Exception, é uma exception

/* Essa notificação/warning é do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso só interessa quando se está trabalhando com serialização, se quiser eliminar a notificação, desative em preferences
 * ou adicione a notação @SuppressWarnings("serial"), mas é opcional, se quiser pode deixar sem
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
