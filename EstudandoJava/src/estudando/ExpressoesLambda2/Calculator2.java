package estudando.ExpressoesLambda2;

/* Para ser uma interface funcional, deve:
 * ser uma interface e ter apenas 1 m�todo
 */

@FunctionalInterface // Annotation para o java verificar se essa interface � funcional
public interface Calculator2 {

	public int calculate(int x);
	
}
