package estudando.Polimorfismo2;

public class Refrigerante extends Bebida{
    
    public Refrigerante(){
        super("Refrigerante", false);
    }

    @Override
    public void preparar() {
        System.out.println("pegando o copo");
        System.out.println("Colando gelo no copo");
        System.out.println("Colando o refrigerante");
    }
    
    
}
