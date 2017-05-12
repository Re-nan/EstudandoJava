package estudando.heranca;

public class Main {
    public static void main(String[] args){
    	
        System.out.println("--- Genérico ---");
        Veiculo veiculo = new Veiculo();
        veiculo.buzinar();
        veiculo.imprimirDados();
        
        System.out.println("");
        
        System.out.println("--- Carro ---");
        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Eco Sport");
        carro.setAno(2010);
        carro.setNumeroPortas(4);
        carro.buzinar();
        carro.imprimirDados();
        
        
    }
}