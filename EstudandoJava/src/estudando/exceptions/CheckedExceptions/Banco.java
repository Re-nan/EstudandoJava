package estudando.exceptions.CheckedExceptions;

public class Banco {

    /* Quando voc� usa um m�todo que lan�a uma exce��o, voc� tem 2 op��es:
     * 1� 
     * Voc� trata essa exce��o pondo ela dentro de um bloco try catch:
     * Tenta fazer tudo o que est� no try, e caso der algum erro o catch �
     * quem ser� responsavel por tratar este erro. Ex. com uma msg no catch
     * try {
     *      conta.sacar(-100);
     *      System.out.println("Saque realizado com sucesso!");
     * } catch (Exception ex) {
     *      System.out.println("Ocorreu um erro no saque: " + ex.getMessage());
     * }
     * System.out.println("Saldo: " + conta.getSaldo());
     * 
     * 2� 
     * Voc� pode lan�ar exce��o PARA QUEM CHAMOU O M�TODO, e para fazer isso
     * voc� n�o precisa por um try catch, voc� apenas adciona uma clausula
     * throws ao lado da chamada do m�todo de que o est� chamando 
     * 
     * public void realizarOperacao() throws Exception{
     *    ContaBancaria conta = new ContaBancaria(1000);
     *    conta.sacar(-100);
     *    System.out.println("Saque realizado com sucesso!");
     * System.out.println("Saldo: " + conta.getSaldo());
     *
     * E quem o est� chamando � que vai usar um try catch
     */
        
    public void realizarOperacao() throws Exception{
        
        ContaBancaria conta = new ContaBancaria(1000);
            conta.sacar(-100);
            System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo: " + conta.getSaldo());

    }
}
