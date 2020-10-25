
public class Animal {
private String nome;
    private String cor;
    private String ambiente;
    private double comprimento;
    private double velocidadeMedia;
    private int numeroDePatas;
public Animal(String nome,String cor , String ambiente,double comprimento,
        double velocidadeMedia,int numeroDePatas){
    this.nome = nome;
    this.cor = cor;
    this.ambiente = ambiente;
    this.comprimento = comprimento;
    this.velocidadeMedia = velocidadeMedia;
    this.numeroDePatas = numeroDePatas;
}
@Override
public String toString(){
    return String.format("%s %s %s %lf %lf %d "+getNome(), getCor(), getAmbiente(), 
            getComprimento(), getVelocidadeMedia(), getNumeroDePatas());
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }


    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getComprimento() {
        return comprimento;
    }

   
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

 
    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

  
    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

  
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

}