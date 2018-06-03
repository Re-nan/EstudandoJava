package estudando.poo.Polimorfismo2;

/* A estrutura basica deste polimorfismo foi criar uma classe Bebida com o
 * metodo preparar() vazio e genérico, e sobrescrever este método nas
 * respectivas bebidas em suas respectas classes LeiteQuente e refrigerante
 * onde em cada classe(tipo de bebida) o preparar() funciona de forma diferente
 * um do outro, e depois criar uma classe Preparador com um metodo prepararBebida()
 * que fica responsavel por invocar o metodo preparar() que foi sobreescrito nas
 * suas respectivas classes, 
 * 
 * PERCEBA que em nenhum momento você precisa mexer na logica do preparador, pois
 * ela é genérica, ela só fica responsávael por invocar, a lógica mesmo de como
 * prepara a respectiva bebida, fica nas próprias bebidas em si como LeiteQuente
 * e Refrigerante, muito show! 
 */

public class Main {

    public static void main(String[] args) {

    	Preparador preparador = new Preparador();
        
    	LeiteQuente leite = new LeiteQuente();
        preparador.prepararBebida(leite);

        System.out.println("");
        
        Refrigerante refrigerante = new Refrigerante();
        preparador.prepararBebida(refrigerante);
        
    }
}