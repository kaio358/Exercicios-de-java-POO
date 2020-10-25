public class Funcionário {
    private String nome;
    private int cpf;
    private int rg;
    private float totalDeVendas;
    public Funcionário (String nome, int cpf, int rg,float totalDeVendas){
        this.nome = nome;
        this.cpf= cpf;
        this.rg = rg;
        this.totalDeVendas = totalDeVendas;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getCpf() {
        return cpf;
    }

  
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

  
    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }


    public float getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(float totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }
    
}