package estudando.heranca;

public class Carro extends Veiculo{
    
    private int numeroPortas;

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void buzinar() {
        System.out.println(getMarca() + " " + getModelo()+ " buzinando");
    }

    /* N�o existe heran�a de construtores, o que existe � que cada classe tem seu contrutor
     * e na hora de construir o obj de uma classe voc� tem que ir invocando construtores de
     * superclasse at� voc� chamar o construtor de toda a hierarquia das classes que compoem
     * aquela estrutura que voc� est� tentando instanciar 
     */
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("N�mero de portas: " + getNumeroPortas());
    }
    

}