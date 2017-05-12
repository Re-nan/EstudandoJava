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

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Número de portas: " + getNumeroPortas());
    }
    

}