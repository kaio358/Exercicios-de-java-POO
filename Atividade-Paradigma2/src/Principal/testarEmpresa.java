/**
 * 
 */
package Principal;
import entidades.Gerente;
import entidades.Vendedor;


public abstract class testarEmpresa {

	
	public static void main(String[] args) {
		Vendedor v= new Vendedor();
		Gerente g= new Gerente();
		
		v.setNome("Maria");
		v.setCpf("4674683415");
		v.setRg("490177");
		v.setTotalVenda(300f);
		
		System.out.println(v+ "comisão: "+v.calcularComissao());
		
		
		
		
		g.setNome("Marisa");
		g.setCpf("5014213415");
		g.setRg("437178");
		g.setTotalVenda(20f);
	    g.calcularComisaoGerente();
	    
	    System.out.println(g+ "comisão: "+g.calcularComisaoGerente());
	    
		
		
	
		
		

	}

}
