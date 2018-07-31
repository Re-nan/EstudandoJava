package estudando.classes.ClasseObject;

import java.util.Arrays;

public class Aluno extends Pessoa {

	String curso;
	int[] notas = {1,2,3};
	
	/* o toString da classe Arrays é utilizado para mostrar o conteúdo de um array
	 * 
	 */ 
	//@Override
	/*public String toString() {
		return "Aluno [nome=" + nome + ", curso=" + curso + ", notas=" + Arrays.toString(notas)
				+ "]";
	}*/
	
	


	// Método que recebe um obj qualquer e verifica se ele é nulo
	public boolean isNull(Object obj) {
		if(obj != null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Aluno [nome= " + nome + ", curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}




	




	

}
