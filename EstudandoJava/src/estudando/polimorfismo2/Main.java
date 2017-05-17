package estudando.polimorfismo2;

public class Main {

    public static void main(String[] args) {

        LeiteQuente leite = new LeiteQuente();
        Preparador preparador = new Preparador();
        preparador.prepararBebida(leite);

        System.out.println("");
        
        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);
        
    }
}