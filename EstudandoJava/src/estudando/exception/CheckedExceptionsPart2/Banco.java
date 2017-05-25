package estudando.exception.CheckedExceptionsPart2;

public class Banco {
    
    /* Eu não preciso lançar todas as exception ao lado do método, eu posso
     * lançar uma e tratar no corpo do método e a outra lançar para quem chama
     * tratar e assim vai.. um jogando pro outro até que alguém trate, se for
     * jogando até chegar no método main obrigando o main a lançar a Exception,
     * quando o main lança a Exception, ele lança pra JVM obrigando o java a
     * encerrar sua aplicação
     
    public void realizarOperacao() throws SaldoInsuficienteException, ValorNegativoExceptions{
        ContaBancaria conta = new ContaBancaria(1000);
            //conta.sacar(-100);
            conta.sacar(9999);
            System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo: " + conta.getSaldo());

    }
    */
    
     public void realizarOperacao() throws BancoException{
        ContaBancaria conta = new ContaBancaria(500);
        try{
            conta.sacar(-900);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo: " + conta.getSaldo());
            
        }catch(ValorNegativoException ex){//Faço catch da exceção de um tipo(ValorNegativoExceptions) 
            throw  new BancoException("Erro de saque: Valor negativo!", ex); //e relanço a exceção de outro tipo(BancoException)
            
        }catch(SaldoInsuficienteException ex){
        	/* Dentro da classe BancoException um dos construtores possuem 2 parametros, 
        	 * o primeiro é uma "String" e o segundo é um "Throwable", esse construtor 
        	 * foi herdado da classe Exception
        	 * 
        	 * Throwable é a interface que a classe Exception implementa
        	 * OU SEJA todas as Exceções, até as que você cria, são um Throwable 
        	 * 
        	 * O ex é o parametro do tipo Throwable e nele está sendo passado o obj ex
        	 * que nele contém as informações da exceção podendo usar um ex.getMessage()
        	 * para capturar está mensagem de "Erro de saque:..."
        	 */
            throw  new BancoException("Erro de saque: saldo insuficiente!", ex);            
        }
    }
     
     
}
