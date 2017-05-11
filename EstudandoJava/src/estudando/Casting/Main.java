package estudando.Casting;

/** Ordem Dos Castings
 * byte => short => int => long => float => double
 * 
 * Impl�cito = O java faz pra voc�
 * Expl�cito = Voc� precisa dizer
 * 
 * todo n�mero sem v�rvula � um int pro java
 * todo n�mero com v�rgula � um double pro java
 */

/**
 * N�O EXISTE CASTING para TEXTOS
 * DICA: N�o existe casting de Char para String, pois String n�o � um tipo
 * primitivo, ent�o n�o posso jogar um char dentro de uma String
 * 
 * Mas  se o char tiver um valor numerico como "char ccc = 65" (que na tabela
 * ASCII representa o 'A'), ent�o a var char pode ser atribuida dentro de uma
 * var do tipo int
 * Ex.
 * char ccc = 65;
 * int iii = ccc;
 * FUNCIONA, agora iiii vale 65
 * 
 * Ent�o a ordem fica: char cabe dentro de int, e int cabe dentro de long, e long de float e etc...
 * char => int => long => float => double
 */

public class Main {
    public static void main(String[] args) {
        
        /* Aqui n�o ocorre o casting, pois para o Java 10 � do tipo int
         * de inteiro pra inteiro n�o existe casting
         */
        int i = 10; 
        
        /**
         * Ocorre o casting impl�cito, o JAVA converte o 10 automaticamente para
         * long, pois qualquer int cabe em um long
         */ 
        long l1 = 10;
        
        /**
         * Atribuindo um long a um long
         */
        long l2 = 10L;
        
        /**
         * Ocorre o casting impl�cito, o JAVA converte o 10 int 
         * automaticamente para double, pois qualquer int cabe em um double
         * Exibe 10.0
         */
        double d1 = 10;
        
        /**
         * Ocorre o casting impl�cito, o JAVA converte o 40 int 
         * automaticamente para float, pois o valor 40 cabe em um float, se
         * fosse um valor muito maior, ent�o n�o caberia
         * Exibe 40.0
         */
        float f1 = 40;
        
        /**
         * Da erro, pois um double � mais abrangente que � um float
         */
        //float f2  = 40.0;
        
        //Para armazenar um double e um floaT precisa de um cast expl�cito
        float f2 = 40.0F; //ou float f2 = (float)40.0;
        
        
        /** O short n�o possi um qualificador como o long(L) e float(F) ent�o
         * Como eu identifico um n�mero como sendo um short? Basta que eu atribua
         * ele a uma variavel short. NESSE caso ele n�o considera o 100 como um
         * numero inteiro mas sim como um short
         */
        short s1 = 100;
        
        /** Da erro pois o numero � muito grande pro tamanho de um short
         * Ai nesse caso o java entende que o n�mero 100000 � um int, e nesse 
         * caso voc� tem que fazer o cast expl�cito e assumir as perdas por�m
         * esse n�mero vai dar -31072, TOME CUIDADO ao fazer cast, lembre-se 
         * da quant m�x que um tipo pode receber
         * 
         */
        //short s2 = 100000; //Exibe -31072
        
        // Da um numero negativo todo errado -31072 de 100000
        short s2 = (short)100000;
        
        /**
         * Mesmo caso, um byte s� aceita um n�mero que seja at� 127, j� 128 ele 
         * exibie -128, TOME CUIDADO ap fazer cast expl�cito
         */
        byte b1 = 127; //Exibe 127
        byte b2 = (byte)128; //Exibe -128
        
        System.out.println(b2);
    }
}

