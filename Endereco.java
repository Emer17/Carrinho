class Endereco{
	private String endereco;
	private String cidade;
	private String estado;
	private String pais;
	private int cep;
	
	void setEndereco(String endereco){
		this.endereco=endereco;
	}
	String getEndereco(){
		return endereco;
	}
	
	void setCidade(String cidade){
		this.cidade=cidade;
	}
	String getCidade(){
		return cidade;
	}
	
	void setEstado(String estado){
		this.estado=estado;
	}
	String getEstado(){
		return estado;
	}
	
	void setPais(String pais){
		this.pais=pais;
	}
	String getPais(){
		return pais;
	}
	
	void setCep(int cep){
		this.cep=cep;
	}
	int getCep(){
		return cep;
	}
}
