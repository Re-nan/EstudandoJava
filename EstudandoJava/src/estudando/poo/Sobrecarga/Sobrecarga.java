package estudando.poo.Sobrecarga;

/* SOBRECARGA � o nome dado para criar m�todos com o mesmo nome, por�m assinatura diferente
 * Parar existir a sobrecarga os m�todos DEVEM ter o mesmo nome, por�m parametros DIFERENTES 
 * 
 * Voc� n�o pode mudar s� o tipo de retorno ou o c�digo de dentro, o que importa � mudar a ordem
 * dos parametros ou a quantidade independente de tipo e manter o mesmo nome do m�todo, isto � a 
 * sobrecarga!
 */

public class Sobrecarga {

	int somar(int x, int y) {
		System.out.println("int somar(int x, int y)");
		return x+y;
	}
	
	int somar(int x, int y, int z) {
		System.out.println("int somar(int x, int y, int z)");
		return x+y+z;
	}
	
	double somar(double x, double y) {
		return x+y;
	}
	
	
	//Funciona mesmo mudando s� a ordem, o que importa � A ORDEM dos parametros
	String exibirNomeIdade(String nome, int idade) {
		return nome + " " + idade;
	}
	
	//Funciona mesmo mudando s� a ordem, o que importa � A ORDEM dos parametros
	String exibirNomeIdade(int idade, String nome) {
		return nome + " " + idade;
	}
}
