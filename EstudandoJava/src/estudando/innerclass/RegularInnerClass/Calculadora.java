package estudando.innerclass.RegularInnerClass;

public class Calculadora {

	private double valor1;
	private double valor2;
	private double resultado;

	public double getValor1() {
		return valor1;
	}
	
	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}
	
	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public double somar() {
		Calculadora.Soma s = new Calculadora.Soma(); // ou Soma s = new Soma();
		s.executar();
		return resultado;
	}
	
	
	
	/* REGULAR INNER CLASS
	 * é uma classe como outra qualquer e pode acessar os atributos de sua OuterClass
	 * Calculadora no caso
	 */
	private class Soma {
		
		public void executar() {
			resultado = valor1 + valor2;
		}
	}
	
	
}
