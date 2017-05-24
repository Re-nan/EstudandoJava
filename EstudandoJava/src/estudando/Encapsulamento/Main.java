package estudando.Encapsulamento;

public class Main {
    public static void main(String[] args){
        
        ContaBancaria conta = new ContaBancaria();
        conta.setNumConta(33445566);
        conta.setAtiva(true);
        conta.setSaldo(1000);
        
        conta.depositar(1000);
        System.out.println(conta.getSaldo());
    }
}