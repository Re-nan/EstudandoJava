package estudando.colecoes.Arrays;

/* Arrays s�o utilizados para agrupar dados do mesmo tipo, todos os elementos
 * que v�o dentro de um Array DEVEM serem do MESMO tipo
 * 
 * N�o posso criar arrays com valores negativos
 * int[] array = new int[-5]
 * 
 * Arrays podem conter tamanho Zero, mas ele seria in�til, n�o?
 * int[] array = new int[0]
 * 
 * 
 * Suas DESVANTAGENS, depois de criado n�o � poss�vel modificar o tamanho do
 * array, ou seja se voc� criar um de tamanho 5, ele s� poder� conter 5 valores
 * e nada mais
 * 
 * � dif�cil encontrar elementos dentro de um array quando o indice n�o � conhecido
 * neste caso tem que sempre varrer o array at� encontrar o indice esperado, isso
 * exige performance dependendo do tamanho do array
 * 
 * Ao remover elementos do array, sobram buracos no array, afinal ele n�o n�o pode
 * ser redimensionado
 * 
 */
public class Main {
	public static void main(String[] args) {
		
		/* Existem v�rias formas de se criar um Array */
		
		/* Criando um array com as [] no tipo */
		int[] a1;
		a1 = new int[5];
		
		/* Tamb�m pode ser criado assim com as [] no nome da var */
		int a2[];
		a2 = new int[5];
		
		/* Tamb�m pode ser criado tudo na mesma linha */
		int[] a3 = new int[5];
		
		/* Tamb�m pode ser criado j� com valores j� definindo seu tamanho */
		int[] a4 = {1, 2, 3, 4, 5};
		
		/* Tamb�m pode ser criado de uma forma bem chata */
		int[] a5 = new int[] {1, 2, 3, 4, 5};
		
		/* Lembrando que voc� est� criando uma referencia(um ponteiro) a1
		 * na mem�ria stack que aponta pra um obj que ocupa um espa�o na
		 * mem�ria heap, esse obj tem espa�o para 5 valores com index de 
		 * 0 a 4, se n�o for especificado os valores durante a sua cria��o
		 * o array � criado no heap com valores padr�es dependendo do tipo
		 * que ele foi criado, se for String cria o array no heap com todos
		 * os espa�os com valores null(afinal String � um tipo referencia, 
		 * e n�o primitivo) se for int ou double, cria o array no heap com
		 * todos os espa�os com valores 0
		 */
		
		/* Criando um for cl�ssico */
		for (int i = 0; i < a1.length; i++) {
			System.out.println("for " + a1[i]);
		}
		
		/* Criando um foreach(conhecido tamb�m como enhanced-for) que l� se:
		 * para cada elemento int em a1 fa�a tal coisa...
		 */
		for(int elemento : a2){
			System.out.println("foreach " + elemento); //exibe tudo 0, afinal est� vazio
		}
		
		
		
		
		/* Al�m de tipos primitivos como int, double, char e etc... arrays podem
		 * guardar tamb�m tipos Referencia como String, ou alguma classe especifica
		 * que voc� criar ex. Pessoa, Animal, e etc...
		 * Cadeira[] cadeiras = new Cadeira[5]
		 */
		
		
		System.out.println();
		 
		/* Posso ter um array de Objects que aceita diversas referencias, afinal
		 * todas herdam de Object
		 * 
		 * para atribuir cada tipo em uma variavel voc� tem que fazer cast explicito
		 * int n = a6[1];
		 */
		Object[] a6 = new Object[5];
		a6[0] = "RENAN";
		a6[1] = new Integer(19);
		a6[2] = 'R';
		a6[3] = 10; //Oq acontece aqui � que o java ta empacotando um tipo primitivo pra um tipo referencia
		a6[4] = new int[3]; //Um indice recebendo um array de 3 indices
		
		
		
		
		
		
		
	}

}
