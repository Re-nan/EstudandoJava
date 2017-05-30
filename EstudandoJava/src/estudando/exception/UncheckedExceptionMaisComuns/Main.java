package estudando.exception.UncheckedExceptionMaisComuns;

/* Vamos estudar Exceptions comuns no JAVA NULLPOINTEREXCEPTION = � culpa sua,
 * voc� tem que tratar seu c�digo, n�o fa�a try catch Isso ocorre quando voc�
 * tem uma referencia(um obj), mas que n�o est� apontando para nenhum endere�o
 * na mem�ria OU SEJA n�o est� fazendo o "new Classe()" DICA: Comece a procurar
 * pelos pontos '.' da sua refencia(do seuo bj) e veja o porque seu m�todo e o
 * m�todo que ele est� chamando e o retorno deste m�todo. Vale tamb�m caso seu
 * obj chama m�todos de tipo classe herdados de outra
 */

public class Main {
    public static void main(String[] args) {

        ContatoPF c1 = new ContatoPF();
        ContatoPJ c2 = new ContatoPJ();

        c1.setNome("RENAN");
        c1.setCpf("999.999.999-99");
        c1.getEndereco().setRua("Rua do Vale do Sil�cio");//
        c1.getEndereco().setNumero("256");
        c1.getEndereco().setCidade("S�o Paulo");
        c1.getEndereco().setEstado("SP");
        
        /* Essa nomeclatura porque o getEndereco() retorna um obj do tipo Endereco
         * e sendo assim voc� pode ter acesso aos m�todos que est�o na classe Endereco
         * como setRua, getRua, setNumero, getNumero, setCidade e etc...
         * 
         * mas isso s� funciona se durante esse processo ocorrer a instancia��o de
         * Endere�o para dai sim o obj Endereco poder EXISTIR do contario getEndreco
         * retornaria null e assim n�o poseria ser atribuido os setRua, setNumero...
         * porque teria estourado um NullPointerException
         */
        
        /* 1� Solu��o para NullPointerException, criando um novo obj em mem�ria e
         * passando a referencia desse obj recem criado dentro de setEndereco,
         * isso faz com que a var endere�o na classe Contato passe a apontar 
         * para um endere�o v�lido em mem�ria 
         * Ex.
         * c1.setEndereco(new Endereco());
         * Esse new Endereco() como parametro cria um novo endere�o em mem�ria
         * para o parametro endereco que est� na assinatura do m�todo
         * setEndereco(Endereco endereco)
         * 
         * isso vai fazer com que a variavel(this.endereco) de dentro do m�todo 
         * "public void setEndereco(Endereco endereco)"
         * 
         * que est� como
         * "this.endereco = endereco"
         * 
         * receba o mesmo endere�o de memoria que a variavel endereco que est�
         * na assinatura do m�todo
         * this.endereco = new Endereco()
         * 
         * Sendo assim passando a apontar para um endere�o de mem�ria v�lido
         */
        
        /* 2� Solu��o para NullPointerException 
         * Ir na classe Contato e inicializar est� variavel diretamente na
         * descricao dos atributos da classe, quando algu�m instancia um obj
         * de Contato automaticamente instancia tamb�m de Endereco
         * 
         * Ex.
         * public abstract class Contato {
		 * 		private String nome;
		 *		private Endereco endereco = new Endereco();
		 */
		 
        /* 3� Solu��o para NullPointerException lazyloadin
         * Fazer um Lazy Load que � o mecanismo utilizado pelos frameworks de 
         * persist�ncia para carregar informa��es sobre demanda. Esse mecanismo
         * torna as entidades mais leves, pois suas associa��es s�o carregadas
         * apenas no momento em que o m�todo que disponibiliza o dado
         * associativo � chamado.
         * Ex.
         *  Ir no m�todo getEndereco() vereficiar se a var do tipo classe
         *  endere�o � nulo, e se for, referenciar o obj
		 * Ou inicializar dentro do m�todo getEndereco() com um if que verifica
		 * se o atributo endereco do tipo Endereco na classe Contato � null, se
		 * for.. cria a instancia ali mesmo
		 * Ex.
		 * public String getEndereco() {
		 *		if (endereco == null) {
		 *			endereco = new Endereco();
		 *   	}
		 * 		return endereco;
		 * }
         */ 
         
        /* 4� Solu��o para NullPointerException
         * Criar um Construtor vazio na classe Contato e incializar o endere�o
         * ali dentro
         * 
            public Contato() {
                endereco = new Endereco();
            }
         *
         */
        
        
        
        
        /* Aqui criei uma agenda para PF e outra para PJ , mas poderia
         * ter contatos de PF e PJ na mesma agenda, sem precisar criar
         * instancia para outra agenda
         */
        Agenda agendaPessoaFisica = new Agenda();
        agendaPessoaFisica.setContato1(c1);
        agendaPessoaFisica.imprimirNomes(agendaPessoaFisica);
        agendaPessoaFisica.imprimirCNPJ(agendaPessoaFisica);
        
        
        c2.setNome("RENAN PJ");
        c2.setCnpj("22.222.222/2222-22");
        
        Agenda agendaPessoaJuridica = new Agenda();
        agendaPessoaJuridica.setContato1(c2);
        agendaPessoaJuridica.imprimirNomes(agendaPessoaJuridica);
        agendaPessoaJuridica.imprimirCNPJ(agendaPessoaJuridica);
        

    }
}
