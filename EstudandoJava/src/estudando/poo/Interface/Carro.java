package estudando.poo.Interface;

/* Por extender outra interface, ela est� herdando todos os atributos e m�todos
 * da interface Automovel
 */

/* Se uma classe implements uma interface, ent�o ela � do tipo da interface
 * Ou seja Carro � um Automovel
 * 
 * Assim como uma SubClasse � do tipo da Superclasse tamb�m
 */
public interface Carro extends Automovel{
    
    void abrirPorta();
}
