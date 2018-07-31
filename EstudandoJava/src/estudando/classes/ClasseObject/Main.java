package estudando.classes.ClasseObject;

/* Toda classe em Java herda de apenas uma classe, que tamb�m pode ser
 * chamada de SUPERCLASSE. Se voc� n�o herdar sua classe de nenhuma
 * outra, o java automaticamente faz ela herdar de Object
 * 
 * Object � a superclasse(classe m�e) de todas as classes do java, ent�o
 * independete de voc� herdar uma ou v�rias classes, essas classes todas 
 * herdam de Object e a sua herda Object por tabela
 */

public class Main {

	public static void main(String[] args) {
		
		/* Um tipo Object pode apontar para qualquer "tipo classe" na mem�ria,
		 * seja String, Integer, Boolean ou classes Pessoa, Animal, Curso e etc
		 * 
		 * Se voc� atribuir um tipo primitivo para um Object o Java na verdade
		 * est� fazendo autoboxing daquele tipo, veja:
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
		a1.curso = "An�lise e Desenvolvimento de Sistemas";
		
		
		Aluno a2 = new Aluno();
		a2.nome = "Renan";
		a1.curso = "T�cnico em Inform�tica";

		/* Se um obj superclasse recebe/aponta pra um tipo filha ent�o esse obj s� 
		 * pode enxergar/usar os mesmos atributos que eles tem em comum
		 */
		
		// Isso
		Object obj;
		obj = a1;
		// � o mesmo que isso
		obj = new Aluno();
		//obj ponto alguma coisa(obj.) s� enxergam o que possuem em comum
		
		// Isso
		Pessoa p1;
		p1 = a1;
		// � o mesmo que isso
		p1 = new Aluno();
		
		//a1. Perceba que a1 herda de Pessoa portando enxerga tudo de Aluno como de Pessoa
		//p1.  J� Pessoa s� enxerga o que ele tem em comum com Aluno, ou seja o nome
		
		
		
		//Hierarquia Object > Pessoa > Aluno
		if(new Aluno() instanceof Pessoa) {
			System.out.println("Verdadeiro, pois Aluno herda de Pessoa");
		}
		
		if(new Pessoa() instanceof Aluno) {
			System.out.println("Falso, pois Pessoa � superclasse de Aluno"); //Nem exibe
		}
		
		if(new Aluno() instanceof Object) {
			System.out.println("Verdadeiro, pois qualquer classe � uma instancia de Object por tabela");
		}
		
		System.out.println();
		
		
		/* toString()
		 * As classes podem sobrescrever este m�todo para mostrarem
		 * uma mensagem que as representem
		 * o m�todo System.out.prinltn(), por exemplo, usa este m�todo
		 * Sempre que voc� passa um obj para dentro do println() ele vai
		 * chamar o toString do obj
		 */
		System.out.println(a1); //Aluno [nome= RENAN, curso=T�cnico em Inform�tica, notas=[1, 2, 3]]
		
		
		/* equals()
		 * � a forma que o java tem de comparar objetos pelo seu conte�do
		 * ao inv�s de comparar as refer�ncias(como acontece ao usarmos
		 * "==") Lembrando que o == compara se o endere�o de mem�ria dos
		 * obj s�o os mesmos
		 */
		System.out.println(a1.nome.equals(a2.nome)); //false
		System.out.println(a1.nome.equalsIgnoreCase(a2.nome)); //true pq ignora se � mai�scula ou min�scula
		
		
		System.out.println();
		
		/* hashCode()
		 * O java cria v�rios baldes, um que s� aceita objs com hash, 5,
		 * outro que s� com 10 e outro que s� aceita objs com hash 15
		 * 
		 * ao tirar o hash de um obj ele ve o numero e atribui ao balde
		 * do numero sorteado, em um balde eu posso ter mais de um obj
		 * com o mesmo hash
		 * 
		 * Eu posso ter v�rios objs com o mesmo hash, o que diferencia
		 * � que ai entra o m�todo equals encontra o elemento que voc�
		 * est� comparando dentro daquele balde
		 * 
		 * Resumindo: ele chama o hashCode() primeiro para identificar 
		 * o local que ta e depois o equals
		 * 
		 * a regra �, se voc� for implementar o hashCode para criar sua 
		 * pr�ria l�gica de hash, voc� deve implementar o equals tamb�m
		 * e vice e versa, se implementou o equals na sua classe, ent�o
		 * implemente o hashCode tamb�m, essa � a boa pr�tica, mas se
		 * quiser pode usar o hashCode e equals como j� s�o por padr�o
		 */
		
		
		

	}

}
