package estudando.poo.Interface2;

public interface Automovel {

    public void virarParaEsquerda();

    void virarParaDireita();

    public void acelerar();

    public void frear();

    /* Para n�o ter que programar o mesmo metodo identico na classe Ferrari e
     * Porche, o Java te permite criar um metodo default dentro da interface
     * onde ser� gen�rico o uso dele para qualquer um que o herde, n�o � 
     * necess�rio implementar ele nas classes Ferrari e Porsche, pois eles
     * j� est� sendo implementado na interface
     */
    default void derrapar() {
        acelerar();
        acelerar();
        frear();
    }
    
    /* STATIC em interface = tamb�m implementam o metodo na propria interface
     * por�m � um metodo que n�o ser� de instancia, mas sim de Interface, afinal
     * ele � static, funciona como um metodo static em qualquer classe
     */

    static int getVelocidadeMaxima(){
        return 300;
    }
    
    
}