package estudando.polimorfismo2;

public class LeiteQuente extends Bebida{
    
    public LeiteQuente(){
        super("Leite Quente",true);
    }

    @Override
    public void preparar() {
        System.out.println("Pegando um copo");
        System.out.println("Colando o leite no copo");
    }
    
    
}

