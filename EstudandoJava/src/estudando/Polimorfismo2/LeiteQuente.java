package estudando.Polimorfismo2;

public class LeiteQuente extends Bebida{
    
	/* Como ela herda de Bebida voc� tem que passar um construtor para ela
	 * 
	 * A classe bebida n�o possui um construtor implicito(aquele vazio),
	 * ent�o � necess�rio chmar o contrutor explicitamente usando o super
	 * e passando seus devidos parametros
	 */
    public LeiteQuente(){
        super("Leite Quente",true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando um copo");
        System.out.println("Colando o leite no copo");
    }
    
    
}

