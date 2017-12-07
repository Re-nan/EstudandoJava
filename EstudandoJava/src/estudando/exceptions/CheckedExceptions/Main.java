package estudando.exceptions.CheckedExceptionsPart1;

/* na ContaBancaria ocorre o lan�amento de uma das exceptions atrav�s de um dos 
 * throw new Exception("O valor para saque � negativo!");
 * ou
 * throw new Exception("O saldo � insuficiente!");
 * ao ocorrer, ele lan�a para quem chamou, e quem chamou foi a classe Banco
 * e a Banco como n�o tem try catch mas sim "throws" ao lado do nome da classe
 * lan�a para quem a chamou, e quem chamou foi o m�todo main da classe Main
 * e nesse sim ocorrer o try catch tratando essa exce��o e trazendo consigo
 * uma das mensagem que estavam no trhow new Exception("etc...")
 * 
 */

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        try {
            banco.realizarOperacao();
        } catch (Exception ex) {
        	/* Perceba que esse ex.getMessage() tr�s consigo um dos
        	 * throw new... da clase ContaBancaria
        	 */
            System.out.println("Ocorreu um Erro: " + ex.getMessage());
        }
    }
}
