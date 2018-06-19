package estudando.poo.Interface2;

public interface Automovel {

    public void virarParaEsquerda();

    void virarParaDireita();

    public void acelerar();

    public void frear();

    /* Para não ter que programar o mesmo metodo identico na classe Ferrari e
     * Porche, o Java te permite criar um metodo default dentro da interface
     * onde será genérico o uso dele para qualquer um que o herde, não é 
     * necessário implementar ele nas classes Ferrari e Porsche, pois eles
     * já está sendo implementado na interface
     */
    default void derrapar() {
        acelerar();
        acelerar();
        frear();
    }
    
    /* STATIC em interface = também implementam o metodo na propria interface
     * porém é um metodo que não será de instancia, mas sim de Interface, afinal
     * ele é static, funciona como um metodo static em qualquer classe
     */

    static int getVelocidadeMaxima(){
        return 300;
    }
    
    
}