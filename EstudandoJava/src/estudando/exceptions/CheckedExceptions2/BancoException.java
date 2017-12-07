package estudando.exceptions.CheckedExceptions2;

//Criando classe exce��o para tratar saldo insuficiente

//Toda classe que herda de Exception, � uma exception

/* Essa notifica��o/warning � do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso s� interessa quando se est� trabalhando com serializa��o, se quiser eliminar a notifica��o, desative em preferences
 * ou adicione a nota��o @SuppressWarnings("serial"), mas � opcional, se quiser pode deixar sem
 */
public class BancoException extends Exception{

    //Herdando todos os construtores da classe Exception e os usando diretamente da superclasse
    public BancoException() {
    }

    public BancoException(String message) {
        super(message);
    }

    public BancoException(String message, Throwable cause) {
        super(message, cause);
    }

    public BancoException(Throwable cause) {
        super(cause);
    }

    public BancoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    
    
}
