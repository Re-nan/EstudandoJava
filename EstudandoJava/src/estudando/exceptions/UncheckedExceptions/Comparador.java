package estudando.exceptions.UncheckedExceptions;

/* UncheckExceptions não são exceções do tipo que você trata com try catch, 
 * mas sim aquelas que você corrige no código
 */

public class Comparador {
    
	//exemplo que trata no metodo
	//metodo que compara se a referencia de obj1 é a mesma que de obj2
    public static boolean comparar(Object obj1, Object obj2){
        
        //tratando no codigo
        if(obj1 == null || obj2 == null){
            return false;
        }
        return obj1.equals(obj2);
    }
    
  //exemplo que deixa o try catch trata
    public static boolean comparar2(Object obj1, Object obj2){
        
        return obj1.equals(obj2);
    
    }
    
    
}