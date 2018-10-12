package estudando.innerclass.RegularInnerClass;

/* INNER CLASS
 * S�o classes declaradas dentro de outras classes
 * A classe de fora � chamada de Outer Class e a classe de dentro Inner Class
 * Ao compilar, o java gera dois arquivos class, um com a classe de fora, e outro
 * com a classe de fora junto com a de dentro ex.
 * MyOuterClass.class
 * MyOuterClass$MyInnerClass.class
 * 
 * Uma Instancia de uma Inner Class n�o pode existir sem estar associada a uma instancia
 * de uma Outer Class. Normalmente � a Outer class que instancia sua Inner Class. Usamos
 * uma Inner Class quando n�o queremos que esta classe seja exposta ao mundo exterior e
 * sim seja vista somente pela sua Outer Class
 */

/* As inner classes podem serem divididas em 4 tipos
 * 
 * Regular Inner Class
 * - S�o declaradas como membro de uma classe, elas possuem acesso aos membros da classe
 * do qual ela est� inserida, uma Inner Class enxergar os atributos de sua Outer Class
 * - Voc� consegue acessar os atributos da OuterClass
 * 
 * Method-local Inner Class
 * - � declarada dentro de um m�todo, apenas o m�todo enxerga a inner class, s� pode
 * ser acessada dentro do m�todo onde foi criada.
 * - A inner class pode acessar var locais que foram declaradas dentro do m�todo em que
 * ela foi criada, desde que, essa var seja final(n�o pode ser alterada) se vc omitir a
 * a palavra final na cria��o da var, o c�digo vai compilar normal mas se vc tentar alterar
 * o valor o compilador vai reclamar, resumindo: vc n�o pode mexer no valor de uma var
 * que voc� usa dentro de uma inner class
 * 
 * Anonymous Inner Class
 * - S�o classes que n�o possuem nome, pois s�o sempre subclasses de uma classe ou 
 * implementa��o de uma interface, vc s� vai encontrar classes an�nimas se voc� estiver
 * fazendo a implementa��o de uma interface que j� existe ou se vc estiver declarando a 
 * classe an�nima como uma subclasse de uma classe existente
 * - Ao realizar um desses dois procedimentos, geralmente � para sobrescrever o m�todo
 * de uma classe m�e ou implementar o m�todo de uma interface
 * - Ao se deparar com uma classe an�nima a sua leitura deve ser a de que voc� est� criando
 * uma classeAnonima que � uma subclasse da classe do Tipo onde est� sendo criando a Anonima
 * e essa classeAnonima est� sobrevendo o m�todo X da classe do Tipo, para ser usado dentro
 * da classe Principal que voc� est�
 * 
 * Static Inner Class
 * - N�o � realmente uma inner class pq n�o tem um relacionamento com a outer class, mas ela
 * tem alguns elementos de inner class, ela � apenas uma classe declarada dentro de outra 
 * classe e s�. Para criala basta criar a classe dentro de outra classe usando a palavra static
 * - Se voc� tiver um atributo na OuterClass ele n�o poder� ser acessado na StaticInnerClass
 * - Uma static inner class famosa � a Map.Entry cujos objs s�o retornados quando o m�todo
 * entrySet() � invocado, em que Map faria o papel de uma outer class e Entry o de uma inner
 * class est�tica
 */

public class Main {

	public static void main(String[] args) {
	
		Calculadora c = new Calculadora();
		c.setValor1(20);
		c.setValor2(30);
		
		double result = c.somar();
		System.out.println(result);

		//Calculadora.Soma Erro porque Soma � uma classe private dentro de Calculadora
	
	}
	
}
