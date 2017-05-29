package estudando.exception.CheckedExceptionsPart2;

public class Banco {
    
    /* Eu n�o preciso lan�ar todas as exception ao lado do m�todo, eu posso
     * lan�ar uma e tratar no corpo do m�todo e a outra lan�ar para quem chama
     * tratar e assim vai.. um jogando pro outro at� que algu�m trate, se for
     * jogando at� chegar no m�todo main obrigando o main a lan�ar a Exception,
     * quando o main lan�a a Exception, ele lan�a pra JVM obrigando o java a
     * encerrar sua aplica��o
     
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
            
        }catch(ValorNegativoException ex){//Fa�o catch da exce��o de um tipo(ValorNegativoExceptions) 
            throw new BancoException("Erro de saque: Valor negativo!", ex); //e relan�o a exce��o de outro tipo(BancoException)
            /* Esse obj ex do catch � do tipo ValorNegativoException e ele � passado abaixo no construtor da exce��o BancoException
             * levando em si a exce��o original que � do tipo BancoException
             */
            
        }catch(SaldoInsuficienteException ex){
        	/* Dentro da classe BancoException um dos construtores possuem 2 parametros, 
        	 * o primeiro � uma "String" e o segundo � um "Throwable", esse construtor 
        	 * foi herdado da classe Exception
        	 * 
        	 * Throwable � a interface que a classe Exception implementa
        	 * OU SEJA todas as Exce��es, at� as que voc� cria, s�o um Throwable 
        	 */
            throw new BancoException("Erro de saque: saldo insuficiente!", ex);            
        }
    }
     
     
}
