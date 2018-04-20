package estudando.modificadores.DeAcesso;

/* OS MODIFICADORES DE ACESSO são utilizados para restringir o acesso de elementos
 * de uma classe, como atributos e métodos.
 * 
 * - PRIVATE: se você tem atributos ou métodos como private, significa que somente
 * aquela classe os enxerga, você só consegue manipular eles dentro da própria classe
 * onde eles foram criados. Qualquer classe externa NÃO CONSEGUE enxergar estes atributos, 
 * ou seja ninguém fora dela pode acessar eles diretamente, mas podem serem acessados 
 * indiretamente com encapsulamento.
 * 
 * 
 * - PUBLIC: indica que o atributo ou método que estiver como public, pode ser enxergado por
 * qualquer outra classe. Desde claro que você importe o pacote em que ela estiver, criando 
 * uma instancia daquela classe e assim tendo acesso aos métodos públicos.
 * 
 * DICA: Apesar de não ser regra, atributos são declados como private e métodos como public, 
 * o que faz sentido, já que o ideal é que objtos colaborem através de troca de mensagens(
 * chamadas de métodos), e não através da manipulação direta dos atributos
 * 
 * DICA 2: Quase sempre classes são declaradas como public, a classe public tem que ter o mesmo
 * nome do arquivo java, podem também existir classes dentro de outra classe, e o nome disso é 
 * inner classes
 * 
 * 
 * - PROTECTED: indica que os atributos e métodos que foram declarados como protected poderam
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



