package estudando.poo.Sobrecarga;

/* SOBRECARGA é o nome dado para criar métodos com o mesmo nome, porém assinatura diferente
 * Parar existir a sobrecarga os métodos DEVEM ter o mesmo nome, porém parametros DIFERENTES 
 * 
 * Você não pode mudar só o tipo de retorno ou o código de dentro, o que importa é mudar a ordem
 * dos parametros ou a quantidade independente de tipo e manter o mesmo nome do método, isto é a 
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
	
	
	//Funciona mesmo mudando só a ordem, o que importa é A ORDEM dos parametros
	String exibirNomeIdade(String nome, int idade) {
		return nome + " " + idade;
	}
	
	//Funciona mesmo mudando só a ordem, o que importa é A ORDEM dos parametros
	String exibirNomeIdade(int idade, String nome) {
		return nome + " " + idade;
	}
}
