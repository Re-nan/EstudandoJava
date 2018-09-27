package estudando.ExpressoesLambda2;

/* Para ser uma interface funcional, deve:
 * ser uma interface e ter apenas 1 método
 */

@FunctionalInterface // Annotation para o java verificar se essa interface é funcional
public interface Calculator {

	public void calculate(int x);
	
}
