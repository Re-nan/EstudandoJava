package estudando.poo.Polimorfismo2;

public class Preparador {

	/* Veja como � interessante voc� referenciar um determinado obj
	 * para um mais gen�rico, pois se eu passasse LeiteQuente ao inv�s
	 * de Bebida, eu s� conseguiria prepararBebida do tipo LeiteQuente
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