public class Peixe extends Animal {
   private String caracteristica;

    public Peixe(String caracteristica,String nome, String cor, String ambiente,
    double comprimento, double velocidadeMedia, int numeroDePatas) {
        super(nome, cor, ambiente, comprimento, velocidadeMedia, numeroDePatas);
    }

    
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
   @Override
    public String toString(){
    return String.format("%s %s %s %s %lf %lf %d "+this.getCaracteristica(),
            this.getNome(), this.getCor(),this.getAmbiente(),this.getComprimento(),
            this.getVelocidadeMedia(),this.getNumeroDePatas());
   }
   
}
