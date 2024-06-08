import java.util.List;

public class Banco implements IBanco {

	private String nome;
	private List<Conta> contas;

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public List<Conta> getContas() {
		return contas;
	}

	@Override
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
