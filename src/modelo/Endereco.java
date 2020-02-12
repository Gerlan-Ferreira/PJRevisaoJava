package modelo;


public class Endereco {
	
	private int id_end;
	private String rua;
	private String bairro;
	private String cidade;
	
	
	
	public Endereco() {
		
	}


	public Endereco(int id_end, String rua, String bairro, String cidade) {
		super();
		this.id_end = id_end;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public int getId_end() {
		return id_end;
	}

	public void setId_end(int id) {
		this.id_end = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
