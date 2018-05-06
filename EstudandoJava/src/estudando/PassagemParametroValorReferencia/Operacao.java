package estudando.PassagemParametroValorReferencia;

/* Recebe qualquer valor e troca por 20 */

public class Operacao {

	/* Quando voc� trabalha com uma var que veio de parametro voc� est� sempre trabalhando
	 * com uma c�pia do valor dela e nunca com a variavel original
	 */
	
	/* � como se o "void trocar(int n)" o "(int n)" recebesse o x do main ficando "int n = x" */  
	void trocar(int n) { 
		n = 20;
	}

	/* � como se o "void alterarValor1(Valor valor)" o "(Valor valor)" recebesse o valor1 do main ficando 
	 * "void alterarValor1(Valor valor = valor1)", perceba que valor recebe uma c�pia de valor1, passando 
	 * ambas a apontarem pro mesmo endere�o de mem�ria, por isso o valor � alterado
	 */  
	void alterarValor1(Valor valor) {
		valor.v = 20;
	}

	/* � como se o "void alterarValor2(Valor valor)" o "(Valor valor)" recebesse o valor2 do main ficando 
	 * "(void alterarValor2(Valor valor = valor2)", perceba que valor recebe uma c�pia de valor2, s� que 
	 * dentro do m�todo a var valor passa aa pontar para umnovo endere�o de mem�ria, portando quem recebe
	 * o valor 20 � valor e n�o valor2
	 */
	void alterarValor2(Valor valor) {   
		valor = new Valor();
		valor.v = 20;
	}
}