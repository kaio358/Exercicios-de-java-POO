package entidades;

public class Gerente extends Funcionario{
private double comissaoGerente;
	
	

	public Gerente() {
		super();
		this.comissaoGerente=0.7;
		
		
	}
	public double calcularComisaoGerente() {
		return  (this.getTotalVenda()*this.comissaoGerente);
		 
		
	}
	


	public double getValorComissao() {
		return comissaoGerente;
	}

	public void setValorComissao(float f) {
		this.comissaoGerente = f;
	}
	@Override
	public String toString() {
		return "Gerente [ TotalVenda= " + getTotalVenda() + ", Nome= "
				+ getNome() + ", Rg= " + getRg() + ", Cpf= " + getCpf() + ", ";
	}
	
	

	
	}
	
	



