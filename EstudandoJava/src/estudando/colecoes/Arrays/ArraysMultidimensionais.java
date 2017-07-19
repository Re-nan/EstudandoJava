package estudando.colecoes.Arrays;

/* Array podem ter mais de uma dimensão, podem serem multidimensionais
 * a qtd que você abre e fecha [] é o que diz ao java a qtd de dimensões
 */
public class ArraysMultidimensionais {

	public static void main(String[] args) {

		/* Array unidimensional */
		int[] array = new int[5];
		
		/* Array bidimensional, pode ser visto como uma tabela/matriz 
		 * No caso de 3 linhas e 5 colunhas */
		int[][] array2 = new int[3][5];
		
		array2[2][3] = 10;
		
		for(int i = 0; i < array2.length; i++){
			for(int j = 0; j < array2[0].length; j++){
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		

		
		

	}

}
