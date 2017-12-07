package estudando.exceptions.CheckedExceptions2;

//Criando classe exceção para tratar saldo insuficiente

//Toda classe que herda de Exception, é uma exception

/* Essa notificação/warning é do proprio eclipse
 * "The serializable class ValorNegativoExceptions does not declare a static final serialVersionUID field of type long"
 * isso só interessa quando se está trabalhando com serialização, se quiser eliminar a notificação, desative em preferences
 * ou adicione a notação @SuppressWarnings("serial"), mas é opcional, se quiser pode deixar sem
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
