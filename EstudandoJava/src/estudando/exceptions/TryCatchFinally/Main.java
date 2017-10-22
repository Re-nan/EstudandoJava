package estudando.exceptions.TryCatchFinally;

/* Try Catch Finally
 * Imagine que ao chamar a opera��o de saque voc� precise mostrar
 * o saldo que sobrou ap�s o saque(o saque dando certo sim ou n�o)
 * sendo assim o finally pode ficar respons�vel por isso, pois
 * o finally sempre � executado independente de cair no catch ou n�o 
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
		
		/* BONUS = Vamos supor que ao inv�s de tratar a exce��o com catch
		 * o seu main remova o catch e lance exce��o para a JVM usando throws
		 * ao lado do m�todo main, e mantendo os blocos try e finally, percebe
		 * que antes de lan�ar a exce��o pra JVM pelo throws ele executa primeiro
		 * o finally garantindo a execu��o de um bloco de c�digo antes de 'crashar'
		 * a aplica��o
		 */
	}

}
