package estudando.poo.Polimorfismo2;

public class Preparador {

	/* Veja como é interessante você referenciar um determinado obj
	 * para um mais genérico, pois se eu passasse LeiteQuente ao invés
	 * de Bebida, eu só conseguiria prepararBebida do tipo LeiteQuente
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