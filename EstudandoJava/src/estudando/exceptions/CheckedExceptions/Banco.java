package estudando.exceptions.CheckedExceptionsPart1;

public class Banco {

    /* Quando você usa um método que lança uma exceção, você tem 2 opções:
     * 1º 
     * Você trata essa exceção pondo ela dentro de um bloco try catch:
     * Tenta fazer tudo o que está no try, e caso der algum erro o catch é
     * quem será responsavel por tratar este erro. Ex. com uma msg no catch
     * try {
     *      conta.sacar(-100);
     *      System.out.println("Saque realizado com sucesso!");
     * } catch (Exception ex) {
     *      System.out.println("Ocorreu um erro no saque: " + ex.getMessage());
     * }
     * System.out.println("Saldo: " + conta.getSaldo());
     * 
     * 2º 
     * Você pode lançar exceção PARA QUEM CHAMOU O MÉTODO, e para fazer isso
     * você não precisa por um try catch, você apenas adciona uma clausula
     * throws ao lado da chamada do método de que o está chamando 
     * 
     * public void realizarOperacao() throws Exception{
     *    ContaBancaria conta = new ContaBancaria(1000);
     *    conta.sacar(-100);
     *    System.out.println("Saque realizado com sucesso!");
     * System.out.println("Saldo: " + conta.getSaldo());
     *
     * E quem o está chamando é que vai usar um try catch
     */
        
    public void realizarOperacao() throws Exception{
        
        ContaBancaria conta = new ContaBancaria(1000);
            conta.sacar(-100);
            System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo: " + conta.getSaldo());

    }
}
