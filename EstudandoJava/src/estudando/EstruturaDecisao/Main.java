package estudando.EstruturaDecisao;

public class Main {
    public static void main(String[] args){
        
        int x = 10;
        int y = 20;
        
        //IF TERN�RIO
        String EhMaiorOuMenor = x > y? "MARIO":"MENOR"; // O : � como se fosse o se n�o...
        System.out.println("EhMaiorOuMenor = " + EhMaiorOuMenor); //EhMaiorOuMenor vale MENOR
        
        if(x > 10){
            System.out.println(x + " � maior que 10");
        }else if(x < 10){
            System.out.println(x + " � menor que 10");
        }else{
            System.out.println("x � " + 10);
        }
        
        switch(x){
            case 10:
                System.out.println("x � 10");
                break;
            case 20:
                System.out.println("x � 20");
                break;
            default:
                System.out.println("x N�o � 10 e nem 20");
                break; //no ultimo case sendo default ou n�o, o break � opcional
        }
        
        int z = 20;
        
        switch(z){
            case 10:
                System.out.println("z � 10");
            case 20:
                System.out.println("z � 20"); //Exibe daqui pra baixo s� para quando achar um break;
            case 30:
                System.out.println("z � 30");
                break;
            case 40:
                System.out.println("z � 40");
            default:
                System.out.println("z N�o � 10 e nem 20");
                break; 
        }
        
        //SWITCH COM STRING
        String nome = "RENAN";
        switch(nome){
            case "FULANO":
                System.out.println("O nome � FULANO");
                break;
            case "BELTRANO":
                System.out.println("O nome � BELTRANO");
                break;
            case "RENAN":
                System.out.println("O nome � RENAN");
                break;
            default:
                System.out.println("N�o � nenhum nome");
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
