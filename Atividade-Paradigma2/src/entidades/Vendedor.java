/**
 * 
 */
package entidades;


public class Vendedor extends Funcionario {
    private double comisao;
	
	
	public Vendedor() {
		super();
		this.comisao= 0.05;
		
	}
	public double calcularComissao() {
		return this.getTotalVenda()*this.comisao;
		
	}

	public double getValorComisao() {
		return comisao;
	}

	public void setValorComisao(double valorComisao) {
		this.comisao = valorComisao;
	}
	@Override
	public String toString() {
		return "Vendedor [ TotalVenda= " + getTotalVenda() + ", Nome= "
				+ getNome() + ", Rg= " + getRg() + ", Cpf= " + getCpf() + ", ";
	}
	
	
	

}


