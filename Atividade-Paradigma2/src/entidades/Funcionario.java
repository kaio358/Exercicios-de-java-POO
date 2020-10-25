package entidades;

public class Funcionario {
	private String nome;
	private String rg;
	private String cpf;
	private float totalVenda;
	
	
	public Funcionario() {
		this.nome="marisa";
		this.rg="9998";
		this.cpf="39390984";
		this.totalVenda=12;
		
	}
	
	
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", Total de vendas=" + totalVenda + "]";
	}
	
     public float getTotalVenda() {
		return totalVenda;
	}
     public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

}



