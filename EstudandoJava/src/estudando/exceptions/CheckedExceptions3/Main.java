package estudando.exceptions.CheckedExceptions3;

public class Main {
	public static void main(String args[]) {
		
		Conta conta = new Conta();
		conta.depositar(500);
		
		try{
			conta.sacar(-10);
		} catch (SaldoInsuficienteException e) { //Valor maior que o saldo
			System.out.println("Ocorreu uma exceção1: " + e.getSaldoAtual() + " | " + e.getMessage());
		}catch (IllegalArgumentException e) { //Valor negativo
			System.out.println("Ocorreu uma exceção2: " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Um outro erro qualquer: " + e.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}

}
