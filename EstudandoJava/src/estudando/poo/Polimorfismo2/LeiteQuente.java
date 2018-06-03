package estudando.poo.Polimorfismo2;

public class LeiteQuente extends Bebida{
    
	/* Como ela herda de Bebida você tem que passar um construtor para ela
	 * 
	 * A classe bebida não possui um construtor implicito(aquele vazio),
	 * então é necessário chmar o contrutor explicitamente usando o super
	 * e passando seus devidos parametros
	 */
    public LeiteQuente(){
        super("Leite Quente",true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando um copo");
        System.out.println("Colocando o leite no copo");
    }
    
    
}

