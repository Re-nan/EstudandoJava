package estudando.exceptions.TryCatchFinally;

/* Try Catch Finally
 * Imagine que ao chamar a operação de saque você precise mostrar
 * o saldo que sobrou após o saque(o saque dando certo sim ou não)
 * sendo assim o finally pode ficar responsável por isso, pois
 * o finally sempre é executado independente de cair no catch ou não 
 */

public class Main {
	public static void main(String[] args) /*throws Exception*/ {
		
		ContaBancaria conta = new ContaBancaria(1000);
		
		try{
			
			conta.sacar(-300);
			System.out.println("Saque realizado com sucesso!");			
		
		}catch (ValorNegativoException e) {
			
			System.out.println("Valor negativo!");		
		
		}catch (SaldoInsuficienteException e) {
			
			System.out.println("Saldo Insuficiente!");		
		
		}finally {
			
			System.out.println("Saldo: " + conta.getSaldo());
			
		}
		
		/* BONUS = Vamos supor que ao invés de tratar a exceção com catch
		 * o seu main remova o catch e lance exceção para a JVM usando throws
		 * ao lado do método main, e mantendo os blocos try e finally, percebe
		 * que antes de lançar a exceção pra JVM pelo throws ele executa primeiro
		 * o finally garantindo a execução de um bloco de código antes de 'crashar'
		 * a aplicação
		 */
	}

}
