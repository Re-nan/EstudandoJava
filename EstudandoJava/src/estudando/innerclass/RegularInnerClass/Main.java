package estudando.innerclass.RegularInnerClass;

/* INNER CLASS
 * São classes declaradas dentro de outras classes
 * A classe de fora é chamada de Outer Class e a classe de dentro Inner Class
 * Ao compilar, o java gera dois arquivos class, um com a classe de fora, e outro
 * com a classe de fora junto com a de dentro ex.
 * MyOuterClass.class
 * MyOuterClass$MyInnerClass.class
 * 
 * Uma Instancia de uma Inner Class não pode existir sem estar associada a uma instancia
 * de uma Outer Class. Normalmente é a Outer class que instancia sua Inner Class. Usamos
 * uma Inner Class quando não queremos que esta classe seja exposta ao mundo exterior e
 * sim seja vista somente pela sua Outer Class
 */

/* As inner classes podem serem divididas em 4 tipos
 * 
 * Regular Inner Class
 * - São declaradas como membro de uma classe, elas possuem acesso aos membros da classe
 * do qual ela está inserida, uma Inner Class enxergar os atributos de sua Outer Class
 * - Você consegue acessar os atributos da OuterClass
 * 
 * Method-local Inner Class
 * - É declarada dentro de um método, apenas o método enxerga a inner class, só pode
 * ser acessada dentro do método onde foi criada.
 * - A inner class pode acessar var locais que foram declaradas dentro do método em que
 * ela foi criada, desde que, essa var seja final(não pode ser alterada) se vc omitir a
 * a palavra final na criação da var, o código vai compilar normal mas se vc tentar alterar
 * o valor o compilador vai reclamar, resumindo: vc não pode mexer no valor de uma var
 * que você usa dentro de uma inner class
 * 
 * Anonymous Inner Class
 * - São classes que não possuem nome, pois são sempre subclasses de uma classe ou 
 * implementação de uma interface, vc só vai encontrar classes anônimas se você estiver
 * fazendo a implementação de uma interface que já existe ou se vc estiver declarando a 
 * classe anônima como uma subclasse de uma classe existente
 * - Ao realizar um desses dois procedimentos, geralmente é para sobreescrever o método
 * de uma classe mãe ou implementar o método de uma interface
 * - Ao se deparar com uma classe anônima a sua leitura deve ser a de que você está criando
 * uma classeAnonima que é uma subclasse da classe do Tipo onde está sendo criando a Anonima
 * e essa classeAnonima está sobrevendo o método X da classe do Tipo, para ser usado dentro
 * da classe Principal que você está
 * 
 * Static Inner Class
 * - Não é realmente uma inner class pq não tem um relacionamento com a outer class, mas ela
 * tem alguns elementos de inner class, ela é apenas uma classe declarada dentro de outra 
 * classe e só. Para criala basta criar a classe dentro de outra classe usando a palavra static
 * - Se você tiver um atributo na OuterClass ele não poderá ser acessado na StaticInnerClass
 * - Uma static inner class famosa é a Map.Entry cujos objs são retornados quando o método
 * entrySet() é invocado, em que Map faria o papel de uma outer class e Entry o de uma inner
 * class estática
 */

public class Main {

	public static void main(String[] args) {
	
		Calculadora c = new Calculadora();
		c.setValor1(20);
		c.setValor2(30);
		
		double result = c.somar();
		System.out.println(result);

		//Calculadora.Soma Erro porque Soma é uma classe private dentro de Calculadora
	
	}
	
}
