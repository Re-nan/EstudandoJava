package estudando.exception.UncheckedExceptionMaisComuns;

//Classe abstract só serve para ser herdada
public abstract class Contato {

	private String nome;
	private Endereco endereco = new Endereco();
	// 2º solução para não dar nullpointerexception
	// private Endereco endereco = new Endereco();

	/* public String getNome() { if(endereco == null){ endereco = new
	 * Endereco(); } return nome; }
	 */

	public String getNome() {
		if (endereco == null) {
			endereco = new Endereco();
		}
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
