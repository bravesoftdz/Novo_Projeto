package br.com.newproject.model;

public class Participante {

	private Long codigo;
	private String nome;
	private String tipo;
	private String razao;
	private String endereco;
	private String complemento;
	private String numero;
	private String bairro;
	private String estado;
	private String cidade;
	private String cep;
	private String cpf_cnpj;
	private String fone;
	private String email;
	private String inscr_muni;
	private String inscr_esta;
	
	public Participante ( Long cod, String nome, String tipo, String razao, String endereco, String complemento, String numero, 
			String bairro, String estado, String cidade, String cep, String cpf_cnpj, String fone, String email, 
			String inscr_muni, String inscr_esta) {
		
		this.codigo = codigo;
		this.nome = nome;
		this.tipo = tipo;
		this.razao = razao;
		this.endereco = endereco;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
		this.cidade = cidade;
		this.cep = cep;
		this.cpf_cnpj = cpf_cnpj;
		this.fone = fone;
		this.email = email;
		this.inscr_muni = inscr_muni;
		this.inscr_esta = inscr_esta;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInscr_muni() {
		return inscr_muni;
	}

	public void setInscr_muni(String inscr_muni) {
		this.inscr_muni = inscr_muni;
	}

	public String getInscr_esta() {
		return inscr_esta;
	}

	public void setInscr_esta(String inscr_esta) {
		this.inscr_esta = inscr_esta;
	}
}
