public class Mamifero extends Animal {
    private String alimento;
    
    public Mamifero(String alimento
            ,String nome, String cor, String ambiente, double comprimento,
            double velocidadeMedia, int numeroDePatas) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, numeroDePatas);
    }

 
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    @Override
    public String toString(){
    return String.format("%s %s %s %s %lf %lf %d "+this.getAlimento(),
            this.getNome(),this.getCor(),this.getAmbiente(),
            this.getComprimento(),this.getVelocidadeMedia(),
            this.getNumeroDePatas());
}
}
