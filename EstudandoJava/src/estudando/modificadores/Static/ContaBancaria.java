package estudando.modificadores.Static;

/* A palavra chave static � adicionando para todos os membros de uma classe que n�o queremos
 * que sejam acessados pelas instancias(objs da classe) mas sim diretamente pela classe
 * 
 * Um atributo ou um m�todo com o modificador static passa a pertencer A CLASSE! portando os
 * valores dos atributos est�ticos s�o compartilhados por todas as int�ncias da classe, ent�o
 * pra cada instancia de ContaBancaria o valor desse atributo banco ser� compartilhado entre 
 * todas elas, pois ele pertence a classe ContaBancaria e n�o a um obj espec�fico
 * 
 * M�todos estaticos s� podem acessar atributos ou outros m�todos que tamb�m sejam est�ticos,
 * afinal a classe n�o depende que tenham intancias da classe para poder usar os m�todos estaticos
 */

public class ContaBancaria {
	
	private static String banco = "Javabank";
	
	public static String getBanco() {
		return banco;
	}
	
	
}
