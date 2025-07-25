package Pessoa;

public class Cliente {
	
	protected String nome;
	protected String id;
	private String DATANASCIMENTO;
	private String EMAIL;
	private String TELEFONE;
	private String RG;
	

	Cliente (String nome, String id, String dataNascimento, String email, String telefone, String rg) {
		this.nome = nome;
		this.id = id;
		setDataNascimento(dataNascimento);
		setEmail(email);
		setTelefone(telefone);
		setRG(rg);
	}
	
	public String getDataNascimento() {
		return DATANASCIMENTO;
	}
	public void setDataNascimento(String dataNascimento) {
		this.DATANASCIMENTO = dataNascimento;
	}
	public String getEmail() {
		return EMAIL;
	}
	public void setEmail(String email) {
		this.EMAIL = email;
	}
	public String getTelefone() {
		return TELEFONE;
	}
	public void setTelefone(String telefone) {
		this.TELEFONE = telefone;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rg) {
		RG = rg;
	}
	
	

}
