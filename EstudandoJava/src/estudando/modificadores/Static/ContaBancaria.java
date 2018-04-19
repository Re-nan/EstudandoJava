package estudando.modificadores.Static;

/* A palavra chave static é adicionando para todos os membros de uma classe que não queremos
 * que sejam acessados pelas instancias(objs da classe) mas sim diretamente pela classe
 * 
 * Um atributo ou um método com o modificador static passa a pertencer A CLASSE! portando os
 * valores dos atributos estáticos são compartilhados por todas as intâncias da classe, então
 * pra cada instancia de ContaBancaria o valor desse atributo banco será compartilhado entre 
 * todas elas, pois ele pertence a classe ContaBancaria e não a um obj específico
 * 
 * Métodos estaticos só podem acessar atributos ou outros métodos que também sejam estáticos,
 * afinal a classe não depende que tenham intancias da classe para poder usar os métodos estaticos
 */

public class ContaBancaria {
	
	private static String banco = "Javabank";
	
	public static String getBanco() {
		return banco;
	}
	
	
}
