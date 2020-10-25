public class Gerente extends Funcionário {
    private double valorComissão;
    public Gerente(String nome, int cpf, int rg, float totalDeVendas) {
        super(nome, cpf, rg, totalDeVendas);
    }

    public double getValorComissão() {
        return valorComissão;
    }

    public void setValorComissão(double valorComissão) {
        this.valorComissão = valorComissão;
    }
    
    public double gerenteValorDaComessão(){
        this.valorComissão =(this.getTotalDeVendas()*0.075);
        return valorComissão;
    }
    
}