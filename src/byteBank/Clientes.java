package byteBank;

public class Clientes {
	private String nome;
	private String CPF;
	private String profissao;
	
	String getNome() {
		return nome;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	String getCPF() {
		return CPF;
	}
	void setCPF(String cPF) {
		CPF = cPF;
	}
	String getProfissao() {
		return profissao;
	}
	void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
