package estudando.classes.ClasseObject;

import java.util.Arrays;

public class Aluno extends Pessoa {

	String curso;
	int[] notas = {1,2,3};
	
	/* o toString da classe Arrays � utilizado para mostrar o conte�do de um array
	 * 
	 */ 
	//@Override
	/*public String toString() {
		return "Aluno [nome=" + nome + ", curso=" + curso + ", notas=" + Arrays.toString(notas)
				+ "]";
	}*/
	
	


	// M�todo que recebe um obj qualquer e verifica se ele � nulo
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
