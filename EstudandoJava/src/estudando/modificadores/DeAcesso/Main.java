package estudando.modificadores.DeAcesso;

/* OS MODIFICADORES DE ACESSO s�o utilizados para restringir o acesso de elementos
 * de uma classe, como atributos e m�todos.
 * 
 * - PRIVATE: se voc� tem atributos ou m�todos como private, significa que somente
 * aquela classe os enxerga, voc� s� consegue manipular eles dentro da pr�pria classe
 * onde eles foram criados. Qualquer classe externa N�O CONSEGUE enxergar estes atributos, 
 * ou seja ningu�m fora dela pode acessar eles diretamente, mas podem serem acessados 
 * indiretamente com encapsulamento.
 * 
 * 
 * - PUBLIC: indica que o atributo ou m�todo que estiver como public, pode ser enxergado por
 * qualquer outra classe. Desde claro que voc� importe o pacote em que ela estiver, criando 
 * uma instancia daquela classe e assim tendo acesso aos m�todos p�blicos.
 * 
 * DICA: Apesar de n�o ser regra, atributos s�o declados como private e m�todos como public, 
 * o que faz sentido, j� que o ideal � que objtos colaborem atrav�s de troca de mensagens(
 * chamadas de m�todos), e n�o atrav�s da manipula��o direta dos atributos
 * 
 * DICA 2: Quase sempre classes s�o declaradas como public, a classe public tem que ter o mesmo
 * nome do arquivo java, podem tamb�m existir classes dentro de outra classe, e o nome disso � 
 * inner classes
 * 
 * 
 * - PROTECTED: indica que os atributos e m�todos que foram declarados como protected poderam
 * serem acessados somente pela classe que o herdar
 * 
 * 
 * - PACKAGE(Sem especificar um modificador)
 * 
 */
public class Main {

	public static void main(String[] args) {

	}
	
}



