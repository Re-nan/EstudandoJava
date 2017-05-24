package estudando.EstruturaDecisao;

public class Main {
    public static void main(String[] args){
        
        int x = 10;
        int y = 20;
        
        //IF TERNÁRIO
        String EhMaiorOuMenor = x > y? "MARIO":"MENOR"; // O : é como se fosse o se não...
        System.out.println("EhMaiorOuMenor = " + EhMaiorOuMenor); //EhMaiorOuMenor vale MENOR
        
        if(x > 10){
            System.out.println(x + " é maior que 10");
        }else if(x < 10){
            System.out.println(x + " é menor que 10");
        }else{
            System.out.println("x é " + 10);
        }
        
        switch(x){
            case 10:
                System.out.println("x é 10");
                break;
            case 20:
                System.out.println("x é 20");
                break;
            default:
                System.out.println("x Não é 10 e nem 20");
                break; //no ultimo case sendo default ou não, o break é opcional
        }
        
        int z = 20;
        
        switch(z){
            case 10:
                System.out.println("z é 10");
            case 20:
                System.out.println("z é 20"); //Exibe daqui pra baixo só para quando achar um break;
            case 30:
                System.out.println("z é 30");
                break;
            case 40:
                System.out.println("z é 40");
            default:
                System.out.println("z Não é 10 e nem 20");
                break; 
        }
        
        //SWITCH COM STRING
        String nome = "RENAN";
        switch(nome){
            case "FULANO":
                System.out.println("O nome é FULANO");
                break;
            case "BELTRANO":
                System.out.println("O nome é BELTRANO");
                break;
            case "RENAN":
                System.out.println("O nome é RENAN");
                break;
            default:
                System.out.println("Não é nenhum nome");
        }
        
      //SWITCH COM CHAR
        char letra = 'A';
        switch(letra){
            case 'A':
                System.out.println("Letra A");
                break;
            case 'B':
                System.out.println("Letra B");
                break;
            case 'C':
                System.out.println("Letra C");
                break;
        }
    }
}
