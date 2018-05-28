package estudando.poo.Heranca;

/* HERAN�A � um mecanismo que permite que uma classe possa herdar o comportamento de outra
 * classe, ao mesmo tempo em que novos comportamentos podem ser estabelecidos. A ideia � agrupar
 * coisas comuns para poder reaproveitar c�digo
 * 
 * A SUB CLASSE herda o comportamento da SUPER CLASSE
 * Herena�a � uma rela��o que chamamos de "� UM" (Ex. Cachorro e Gato � UM Animal logo Chacorro
 * e Gato herdam de Animal)
 * 
 * Toda classe java pode herdar somente uma classe, independente de voc� definir ou n�o uma 
 * classe para herdar, o Java herda automaticamento de Object, direta ou indiretamente
 * 
 * OVERRIDING quando uma classe herda de outra ela pode sobrescrever/redefinir os m�todos da 
 * classe que ela herdou, VANTAGEM: na super classe pode ter um c�digo gen�rico, e na sub classe
 * pode sobreescrever para um c�dgigo espec�fico
 * 
 * Se a classe m�e tem o metodo telefonar() e a classe filha tem o m�todo telefonar(int nr)
 * ent�o n�o h� sobreescrita, para ser considerado sobreescrita os m�todos precisam terem a mesma
 * assinatura(tipo de retorno, nome do metodo, mesma qtd e tipo dos parametros)
 * 
 * SUPER o m�todo que foi sobreescrito/redefinido pode acessar o m�todo original atrav�s da palavra
 * super, Ex dentro do m�todo que deu override usar super.NomeDoMetodo 
 */

public class Main {
    public static void main(String[] args){
    	
        System.out.println("--- Gen�rico ---");
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
        
        System.out.println("");
        
        System.out.println("--- Moto ---");
        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setModelo("Fazer");
        moto.setAno(2018);
        moto.buzinar();
        moto.imprimirDados();   
        
    }
}