package estudando.Casting;

/** Ordem Dos Castings
 * byte => short => int => long => float => double
 * 
 * Implícito = O java faz pra você
 * Explícito = Você precisa dizer
 * 
 * todo número sem vírvula é um int pro java
 * todo número com vírgula é um double pro java
 */

/**
 * NÃO EXISTE CASTING para TEXTOS
 * DICA: Não existe casting de Char para String, pois String não é um tipo
 * primitivo, então não posso jogar um char dentro de uma String
 * 
 * Mas  se o char tiver um valor numerico como "char ccc = 65" (que na tabela
 * ASCII representa o 'A'), então a var char pode ser atribuida dentro de uma
 * var do tipo int
 * Ex.
 * char ccc = 65;
 * int iii = ccc;
 * FUNCIONA, agora iiii vale 65
 * 
 * Então a ordem fica: char cabe dentro de int, e int cabe dentro de long, e long de float e etc...
 * char => int => long => float => double
 */

public class Main {
    public static void main(String[] args) {
        
        /* Aqui não ocorre o casting, pois para o Java 10 é do tipo int
         * de inteiro pra inteiro não existe casting
         */
        int i = 10; 
        
        /**
         * Ocorre o casting implícito, o JAVA converte o 10 automaticamente para
         * long, pois qualquer int cabe em um long
         */ 
        long l1 = 10;
        
        /**
         * Atribuindo um long a um long
         */
        long l2 = 10L;
        
        /**
         * Ocorre o casting implícito, o JAVA converte o 10 int 
         * automaticamente para double, pois qualquer int cabe em um double
         * Exibe 10.0
         */
        double d1 = 10;
        
        /**
         * Ocorre o casting implícito, o JAVA converte o 40 int 
         * automaticamente para float, pois o valor 40 cabe em um float, se
         * fosse um valor muito maior, então não caberia
         * Exibe 40.0
         */
        float f1 = 40;
        
        /**
         * Da erro, pois um double é mais abrangente que é um float
         */
        //float f2  = 40.0;
        
        //Para armazenar um double e um floaT precisa de um cast explícito
        float f2 = 40.0F; //ou float f2 = (float)40.0;
        
        
        /** O short não possi um qualificador como o long(L) e float(F) então
         * Como eu identifico um número como sendo um short? Basta que eu atribua
         * ele a uma variavel short. NESSE caso ele não considera o 100 como um
         * numero inteiro mas sim como um short
         */
        short s1 = 100;
        
        /** Da erro pois o numero é muito grande pro tamanho de um short
         * Ai nesse caso o java entende que o número 100000 é um int, e nesse 
         * caso você tem que fazer o cast explícito e assumir as perdas porém
         * esse número vai dar -31072, TOME CUIDADO ao fazer cast, lembre-se 
         * da quant máx que um tipo pode receber
         * 
         */
        //short s2 = 100000; //Exibe -31072
        
        // Da um numero negativo todo errado -31072 de 100000
        short s2 = (short)100000;
        
        /**
         * Mesmo caso, um byte só aceita um número que seja até 127, já 128 ele 
         * exibie -128, TOME CUIDADO ap fazer cast explícito
         */
        byte b1 = 127; //Exibe 127
        byte b2 = (byte)128; //Exibe -128
        
        System.out.println(b2);
    }
}

