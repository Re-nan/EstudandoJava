package estudando.PassagemParametroValorReferencia;

/* Recebe qualquer valor e troca por 20 */

public class Operacao {

	/* Quando você trabalha com uma var que veio de parametro você está sempre trabalhando
	 * com uma cópia do valor dela e nunca com a variavel original
	 */
	
	/* é como se o "void trocar(int n)" o "(int n)" recebesse o x do main ficando "int n = x" */  
	void trocar(int n) { 
		n = 20;
	}

	/* é como se o "void alterarValor1(Valor valor)" o "(Valor valor)" recebesse o valor1 do main ficando 
	 * "void alterarValor1(Valor valor = valor1)", perceba que valor recebe uma cópia de valor1, passando 
	 * ambas a apontarem pro mesmo endereço de memória, por isso o valor é alterado
	 */  
	void alterarValor1(Valor valor) {
		valor.v = 20;
	}

	/* é como se o "void alterarValor2(Valor valor)" o "(Valor valor)" recebesse o valor2 do main ficando 
	 * "(void alterarValor2(Valor valor = valor2)", perceba que valor recebe uma cópia de valor2, só que 
	 * dentro do método a var valor passa aa pontar para umnovo endereço de memória, portando quem recebe
	 * o valor 20 é valor e não valor2
	 */
	void alterarValor2(Valor valor) {   
		valor = new Valor();
		valor.v = 20;
	}
}