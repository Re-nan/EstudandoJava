package estudando.poo.Heranca;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    protected String getMarca() {
        return marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    protected int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }
    
    protected void buzinar(){
        System.out.println("buzinando");
    }
    
    protected void imprimirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
