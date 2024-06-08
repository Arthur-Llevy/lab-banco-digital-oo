import java.util.List;

public interface IBanco {
    String getNome();

	void setNome(String nome);

	List<Conta> getContas();

	void setContas(List<Conta> contas);
}
