package estudando.exceptions.CheckedExceptions2;

/* CheckedExceptions2
 * Posso dividir as exce��es do meu m�todo em classes do tipo Exceptions assim
 * podendo reutilizar mais de uma vez caso necess�rio, e f�cil manuten��o
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
             
            System.out.println("Voc� tentou sacar " + ex.getValor() + ", mas voc� s� tem um saldo de " + ex.getSaldo());
        } catch (ValorNegativoExceptions ex) {
            System.out.println("Voc� tentou sacar um valor negativo de " + ex.getValor());
        }
        */
        
        
        
        /* Aqui uma exce��o chama a outra, BancoException � uma exce��o mais 
         * gen�rica, ela quem chama as outras
         */
        try {
            banco.realizarOperacao();
        } catch (BancoException ex) {
        	
        	//retorna a mensagem da exce��o capturada/lan�ada
            System.out.println("Ocorreu um erro: " + ex.getMessage());
            
            //retorna o caminho de quem causou a exce��o
            System.out.println("A classeExce��o chamada foi: " + ex.getCause());
        }
    }
}

