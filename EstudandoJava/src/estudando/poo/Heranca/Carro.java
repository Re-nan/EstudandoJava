package estudando.poo.Heranca;

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

    /* Não existe herança de construtores, o que existe é que cada classe tem seu contrutor
     * e na hora de construir o obj de uma classe você tem que ir invocando construtores de
     * superclasse até você chamar o construtor de toda a hierarquia das classes que compoem
     * aquela estrutura que você está tentando instanciar 
     */
    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Número de portas: " + getNumeroPortas());
    }
    

}