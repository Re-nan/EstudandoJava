package estudando.poo.Encapsulamento;

/* - Os Get e Set protegem os atributos de serem acessados externamente, podem serem
 * acessados apenas pelos seus get e set
 * 
 * - Evitam mudança de código em diversos lugares(Ex. mudarnome do atributo, você pode
 * mudar em um lugar só na classe mesmo, e não em todos que chamam esse atributo
 * 
 * - Você não precisa ter get e set para tudo, apenas para o que se vai usar
 */

public class ContaBancaria {
	
    private int numConta;
    private boolean ativa;
    private double saldo;
    
    public void sacar(double valor){
        if(valor < 0){
            return;
        }
        
        saldo -= valor;
    }
    
    public void depositar(double valor){
        if(valor < 0){
            return;
        }
        
        saldo += valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
      
    
}
