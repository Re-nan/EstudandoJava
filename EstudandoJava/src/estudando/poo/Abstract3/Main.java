package estudando.Abstract3;

public class Main {
	public static void main(String[] args) {

		Conta c = new ContaCorrente();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.depositar(1000); 
        cc.depositar(1000); 
        cp.depositar(1000);
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        
        System.out.println();

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

}
