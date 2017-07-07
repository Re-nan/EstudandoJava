package estudando.exception.StackTrace1;

public class Automovel {
	
	private static final int VELOCIDADE_MAXIMA = 180;
	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws AcimaVelocidadeMaximaException{
		
		if(velocidadeAtual + velocidade > VELOCIDADE_MAXIMA){
			throw new AcimaVelocidadeMaximaException("Excedeu a velocidade máxima");
		}
		
		velocidadeAtual += velocidade;
	}

}
