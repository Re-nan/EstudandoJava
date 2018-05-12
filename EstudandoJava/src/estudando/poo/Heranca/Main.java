package estudando.poo.Heranca;

/* HERANÇA é um mecanismo que permite que uma classe possa herdar o comportamento de outra
 * classe, ao mesmo tempo em que novos comportamentos podem ser estabelecidos. A ideia é agrupar
 * coisas comuns para poder reaproveitar código
 * 
 * A SUB CLASSE herda o comportamento da SUPER CLASSE
 * Herenaça é uma relação que chamamos de "É UM" (Ex. Cachorro e Gato É UM Animal logo Chacorro
 * e Gato herdam de Animal)
 * 
 * Toda classe java pode herdar somente uma classe, independente de você definir ou não uma 
 * classe para herdar, o Java herda automaticamento de Object, direta ou indiretamente
 * 
 * OVERRIDING quando uma classe herda de outra ela pode sobrescrever/redefinir os métodos da 
 * classe que ela herdou, VANTAGEM: na super classe pode ter um código genérico, e na sub classe
 * pode sobreescrever para um códgigo específico
 * 
 * Se a classe mãe tem o metodo telefonar() e a classe filha tem o método telefonar(int nr)
 * então não há sobreescrita, para ser considerado sobreescrita os métodos precisam terem a mesma
 * assinatura(tipo de retorno, nome do metodo, mesma qtd e tipo dos parametros)
 * 
 * SUPER o método que foi sobreescrito/redefinido pode acessar o método original através da palavra
 * super, Ex dentro do método que deu override usar super.NomeDoMetodo 
 */
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