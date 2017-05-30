package estudando.exception.UncheckedExceptionMaisComuns;

/* Vamos estudar Exceptions comuns no JAVA NULLPOINTEREXCEPTION = é culpa sua,
 * você tem que tratar seu código, não faça try catch Isso ocorre quando você
 * tem uma referencia(um obj), mas que não está apontando para nenhum endereço
 * na memória OU SEJA não está fazendo o "new Classe()" DICA: Comece a procurar
 * pelos pontos '.' da sua refencia(do seuo bj) e veja o porque seu método e o
 * método que ele está chamando e o retorno deste método. Vale também caso seu
 * obj chama métodos de tipo classe herdados de outra
 */

public class Main {
    public static void main(String[] args) {

        ContatoPF c1 = new ContatoPF();
        ContatoPJ c2 = new ContatoPJ();

        c1.setNome("RENAN");
        c1.setCpf("999.999.999-99");
        c1.getEndereco().setRua("Rua do Vale do Silício");//
        c1.getEndereco().setNumero("256");
        c1.getEndereco().setCidade("São Paulo");
        c1.getEndereco().setEstado("SP");
        
        /* Essa nomeclatura porque o getEndereco() retorna um obj do tipo Endereco
         * e sendo assim você pode ter acesso aos métodos que estão na classe Endereco
         * como setRua, getRua, setNumero, getNumero, setCidade e etc...
         * 
         * mas isso só funciona se durante esse processo ocorrer a instanciação de
         * Endereço para dai sim o obj Endereco poder EXISTIR do contario getEndreco
         * retornaria null e assim não poseria ser atribuido os setRua, setNumero...
         * porque teria estourado um NullPointerException
         */
        
        /* 1º Solução para NullPointerException, criando um novo obj em memória e
         * passando a referencia desse obj recem criado dentro de setEndereco,
         * isso faz com que a var endereço na classe Contato passe a apontar 
         * para um endereço válido em memória 
         * Ex.
         * c1.setEndereco(new Endereco());
         * Esse new Endereco() como parametro cria um novo endereço em memória
         * para o parametro endereco que está na assinatura do método
         * setEndereco(Endereco endereco)
         * 
         * isso vai fazer com que a variavel(this.endereco) de dentro do método 
         * "public void setEndereco(Endereco endereco)"
         * 
         * que está como
         * "this.endereco = endereco"
         * 
         * receba o mesmo endereço de memoria que a variavel endereco que está
         * na assinatura do método
         * this.endereco = new Endereco()
         * 
         * Sendo assim passando a apontar para um endereço de memória válido
         */
        
        /* 2º Solução para NullPointerException 
         * Ir na classe Contato e inicializar está variavel diretamente na
         * descricao dos atributos da classe, quando alguém instancia um obj
         * de Contato automaticamente instancia também de Endereco
         * 
         * Ex.
         * public abstract class Contato {
		 * 		private String nome;
		 *		private Endereco endereco = new Endereco();
		 */
		 
        /* 3º Solução para NullPointerException lazyloadin
         * Fazer um Lazy Load que é o mecanismo utilizado pelos frameworks de 
         * persistência para carregar informações sobre demanda. Esse mecanismo
         * torna as entidades mais leves, pois suas associações são carregadas
         * apenas no momento em que o método que disponibiliza o dado
         * associativo é chamado.
         * Ex.
         *  Ir no método getEndereco() vereficiar se a var do tipo classe
         *  endereço é nulo, e se for, referenciar o obj
		 * Ou inicializar dentro do método getEndereco() com um if que verifica
		 * se o atributo endereco do tipo Endereco na classe Contato é null, se
		 * for.. cria a instancia ali mesmo
		 * Ex.
		 * public String getEndereco() {
		 *		if (endereco == null) {
		 *			endereco = new Endereco();
		 *   	}
		 * 		return endereco;
		 * }
         */ 
         
        /* 4º Solução para NullPointerException
         * Criar um Construtor vazio na classe Contato e incializar o endereço
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
