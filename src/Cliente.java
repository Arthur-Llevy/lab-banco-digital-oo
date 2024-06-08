
public class Cliente implements ICliente {

	private String nome;

	@Override
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
