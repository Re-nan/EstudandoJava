package estudando.poo.Interface3;

public class Gerente extends Funcionario implements Autenticavel {

	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	
	@Override
	public boolean autenticar(String senha) {
		if(this.senha != senha) {
			return false;
		}
		
		return true;
	}
	
}
