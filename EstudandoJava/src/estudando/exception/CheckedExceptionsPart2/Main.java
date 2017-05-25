package estudando.exception.CheckedExceptionsPart2;

/* CheckedExceptions part2
 * Posso dividir as exceções do meu método em classes do tipo Exceptions assim
 * podendo reutilizar mais de uma vez caso necessário, e fácil manutenção
 */
public class Main {

    public static void main(String[] args) {
        
        Banco banco = new Banco();
        /*
        try {
            banco.realizarOperacao();
        } catch (SaldoInsuficienteException ex) {
             
             //Por ter uma classe de cada tipo de erro eu consigo manipular o erro
             // como eu quiser e apresentar uma msg mais adequada ao usuario
             
            System.out.println("Você tentou sacar " + ex.getValor() + ", mas você só tem um saldo de " + ex.getSaldo());
        } catch (ValorNegativoExceptions ex) {
            System.out.println("Você tentou sacar um valor negativo de " + ex.getValor());
        }
        */
        
        
        
        /* Aqui uma exceção chama a outra, BancoException é uma exceção mais 
         * genérica, ela quem chama as outras
         */
        try {
            banco.realizarOperacao();
        } catch (BancoException ex) {
        	
        	//retorna a mensagem da exceção capturada/lançada
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            
            //retorna o caminho de quem causou a exceção
            System.out.println("A classeExceção chamada foi: " + ex.getCause());
        }
    }
}

