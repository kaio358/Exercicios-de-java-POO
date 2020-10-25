
public class Vendedor extends Funcionário {
    private double valorComissão;
    public Vendedor(String nome, int cpf, int rg, float totalDeVendas) {
        super(nome, cpf, rg, totalDeVendas);
    }

    public double getValorComissão() {
        return valorComissão;
    }

    public void setValorComissão(float valorComissão) {
        this.valorComissão = valorComissão;
    }
    public double vendedorValorDaComissão(){
        this.valorComissão =(this.getTotalDeVendas()*0.05);
        return valorComissão;
    }
    
}
