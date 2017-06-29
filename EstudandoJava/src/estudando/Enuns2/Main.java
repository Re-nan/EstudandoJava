package estudando.Enuns2;

/* Enuns possuem diversos métodos estáticos
 */
public class Main {
	public static void main(String[] args) {

		/* Quando você cria uma var de um tipo enum, significa que esta var só
		 * pode receber valores que fazem parte daquele enum
		 */
		DiaDaSemana hoje = DiaDaSemana.SEXTA;
		
		
		
		DiaDaSemanaPrioridade hojeTexto = DiaDaSemanaPrioridade.SABADO;
		//ou
		//DiaDaSemanaPrioridade hojeTexto = Main.DiaDaSemanaPrioridade.DOMINGO;
		System.out.println(hojeTexto); //exibe SABADO
		
		int hojeNum = DiaDaSemanaPrioridade.SABADO.getNum();
		System.out.println(hojeNum); //exibe 7
		
		
		
		/* Vamos supor que tenho uma string "Terça" e quero converter ela para
		 * um tipo enum DiaDaSemanaPrioridade.TERCA 
		 */
		String dia = "TERCA"; //a String precia ser exatamante igual ao valor do enum
		DiaDaSemanaPrioridade s1 = DiaDaSemanaPrioridade.valueOf(dia);
		System.out.println(s1 + " " + s1.getNum()); //exibe TERCA 3
		
		
		//Acessando enum externo(em arquivo separado)
		System.out.println(Sexo.MASCULINO); //exibe MASCULINO
		
		

	}

	/* Se definir o enum como public, você pode acessar ela de forma, mas dai teria que
	 * acessar ele como nome da classe . nome do enum . valor 
	 * Ex. Main.DiaDaSemana.TERCA
	 * 
	 * Se definir o enum como private, ele fica visivel sómente a classe Main
	 * 
	 * Se o enum estiver apenas em um arquivo a parte eu chamo ele somente por
	 * nome do enum . valor
	 * Ex. Sexo.MASCULINO
	 */
	
	
	
	
	//enum simples
	public enum DiaDaSemana {
		DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
	}
	
	
	
	//enum com prioridade
	public enum DiaDaSemanaPrioridade {
		DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
		
		private int num;
		
		private DiaDaSemanaPrioridade(int num){
			this.num = num;
		}
		
		private int getNum(){
			return num;
		}
		
	}

}
