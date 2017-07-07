package estudando.exceptions.CheckedExceptionsPart1;

/* na ContaBancaria ocorre o lançamento de uma das exceptions através de um dos 
 * throw new Exception("O valor para saque é negativo!");
 * ou
 * throw new Exception("O saldo é insuficiente!");
 * ao ocorrer, ele lança para quem chamou, e quem chamou foi a classe Banco
 * e a Banco como não tem try catch mas sim "throws" ao lado do nome da classe
 * lança para quem a chamou, e quem chamou foi o método main da classe Main
 * e nesse sim ocorrer o try catch tratando essa exceção e trazendo consigo
 * uma das mensagem que estavam no trhow new Exception("etc...")
 * 
 */

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();

        try {
            banco.realizarOperacao();
        } catch (Exception ex) {
        	/* Perceba que esse ex.getMessage() trás consigo um dos
        	 * throw new... da clase ContaBancaria
        	 */
            System.out.println("Ocorreu um Erro: " + ex.getMessage());
        }
    }
}
