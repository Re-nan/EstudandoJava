package estudando.poo.Heranca;

public class Moto extends Veiculo{
    
    void empinar(){
        System.out.println("Empinandooo Uhuuuu");
    }

    @Override
    public void imprimirDados() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
    }
    
}