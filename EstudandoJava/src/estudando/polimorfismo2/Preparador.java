package estudando.polimorfismo2;

public class Preparador {

	/* Veja como � insteressante voc� referenciar uma determinado obj
	 * pra um mais gen�rico, pois se eu passasse LeiteQuente ao inv�s
	 * Bebida, eu s� conseguiria prepararBebida do tipo LeiteQuente
	 */
    public void prepararBebida(Bebida bebida) {
        System.out.println("Preparando a bebida " + bebida.getNome());
        
        bebida.preparar();
        
        if(bebida.isAquecer()){
            System.out.println("Aquecendo a bebida " + bebida.getNome());
        }
        
        System.out.println("Bebida preparada com Sucesso!");
    }

}