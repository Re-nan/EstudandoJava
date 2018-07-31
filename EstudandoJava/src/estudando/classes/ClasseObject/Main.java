package estudando.classes.ClasseObject;

/* Toda classe em Java herda de apenas uma classe, que também pode ser
 * chamada de SUPERCLASSE. Se você não herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object é a superclasse(classe mãe) de todas as classes do java, então
 * independete de você herdar uma ou várias classes, essas classes todas 
 * herdam de Object e a sua herda Object por tabela
 */

public class Main {

	public static void main(String[] args) {
		
		/* Um tipo Object pode apontar para qualquer "tipo classe" na memória,
		 * seja String, Integer, Boolean ou classes Pessoa, Animal, Curso e etc
		 * 
		 * Se você atribuir um tipo primitivo para um Object o Java na verdade
		 * está fazendo autoboxing daquele tipo, veja:
		 */
		
		// Object objString = (String) "teste";  ou 
		// Object objString = new String("teste")
		Object objString = "teste"; 
		System.out.println(objString.getClass());
		
		
		// Object objInt = (int)2; ou 
		// Object objInt = new Integer(2); Apesar disso ter sido depreciado no Java 9
		Object objInt = 2; 
		System.out.println(objInt.getClass());
		
		
		// Object objString = (boolean) true;  ou 
		// Object objBoolean = new Boolean(true); Apesar disso ter sido depreciado no Java 9
		Object objBoolean = true;
		System.out.println(objBoolean.getClass());
		
		System.out.println();
		
		
				
		Aluno a1 = new Aluno();
		a1.nome = "RENAN";
		a1.curso = "Análise e Desenvolvimento de Sistemas";
		
		
		Aluno a2 = new Aluno();
		a2.nome = "Renan";
		a1.curso = "Técnico em Informática";

		/* Se um obj superclasse recebe/aponta pra um tipo filha então esse obj só 
		 * pode enxergar/usar os mesmos atributos que eles tem em comum
		 */
		
		// Isso
		Object obj;
		obj = a1;
		// é o mesmo que isso
		obj = new Aluno();
		//obj ponto alguma coisa(obj.) só enxergam o que possuem em comum
		
		// Isso
		Pessoa p1;
		p1 = a1;
		// é o mesmo que isso
		p1 = new Aluno();
		
		//a1. Perceba que a1 herda de Pessoa portando enxerga tudo de Aluno como de Pessoa
		//p1.  Já Pessoa só enxerga o que ele tem em comum com Aluno, ou seja o nome
		
		
		
		//Hierarquia Object > Pessoa > Aluno
		if(new Aluno() instanceof Pessoa) {
			System.out.println("Verdadeiro, pois Aluno herda de Pessoa");
		}
		
		if(new Pessoa() instanceof Aluno) {
			System.out.println("Falso, pois Pessoa é superclasse de Aluno"); //Nem exibe
		}
		
		if(new Aluno() instanceof Object) {
			System.out.println("Verdadeiro, pois qualquer classe é uma instancia de Object por tabela");
		}
		
		System.out.println();
		
		
		/* toString()
		 * As classes podem sobrescrever este método para mostrarem
		 * uma mensagem que as representem
		 * o método System.out.prinltn(), por exemplo, usa este método
		 * Sempre que você passa um obj para dentro do println() ele vai
		 * chamar o toString do obj
		 */
		System.out.println(a1); //Aluno [nome= RENAN, curso=Técnico em Informática, notas=[1, 2, 3]]
		
		
		/* equals()
		 * É a forma que o java tem de comparar objetos pelo seu conteúdo
		 * ao invés de comparar as referências(como acontece ao usarmos
		 * "==") Lembrando que o == compara se o endereço de memória dos
		 * obj são os mesmos
		 */
		System.out.println(a1.nome.equals(a2.nome)); //false
		System.out.println(a1.nome.equalsIgnoreCase(a2.nome)); //true pq ignora se é maiúscula ou minúscula
		
		
		System.out.println();
		
		/* hashCode()
		 * O java cria vários baldes, um que só aceita objs com hash, 5,
		 * outro que só com 10 e outro que só aceita objs com hash 15
		 * 
		 * ao tirar o hash de um obj ele ve o numero e atribui ao balde
		 * do numero sorteado, em um balde eu posso ter mais de um obj
		 * com o mesmo hash
		 * 
		 * Eu posso ter vários objs com o mesmo hash, o que diferencia
		 * é que ai entra o método equals encontra o elemento que você
		 * está comparando dentro daquele balde
		 * 
		 * Resumindo: ele chama o hashCode() primeiro para identificar 
		 * o local que ta e depois o equals
		 * 
		 * a regra é, se você for implementar o hashCode para criar sua 
		 * prória lógica de hash, você deve implementar o equals também
		 * e vice e versa, se implementou o equals na sua classe, então
		 * implemente o hashCode também, essa é a boa prática, mas se
		 * quiser pode usar o hashCode e equals como já são por padrão
		 */
		
		
		

	}

}
