public class Carro {
    private String modelo,cor,marca,chassi;
    private int ano,velocidadeMaxima,velocidadeAtual,númeroDePortas;
    private int númeroDeMarcha = 1;
    private float tamanhoDoTanque;
    Carro (){
        this.ano = 2000;
        this.cor = "Amarelo";
        this.marca = "Ford";
    }
    Carro (String modelo,int ano){
        
    }
    Carro(String modelo,String cor,int ano,String marca,int velocidadeMaxima,
            int númeroDeportas,int númeroDeMarcha,float tamanhoDoTanque){
        
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getModlo (String modelo){
        return this.modelo;
    }
    public void setCor (String cor){
        this.cor = cor;
    }
    public String getCor (String cor){
        return this.cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca (String marca){
        return this.marca;
    }
    public void setChassi (String chassi){
        this.chassi = chassi;
    }
    public String getChassi (String chassi){
        return this.chassi;
    }
    public void setAno (int ano){
        this.ano = ano;
    }
    public int getAno (int ano){
        return this.ano;
    }
    public void setVelocidadeMaxima (int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public int getVelocidadeMaxima (int velocidadeMaxima){
        return this.velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNúmeroDePortas() {
        return númeroDePortas;
    }

    public void setNúmeroDePortas(int númeroDePortas) {
        this.númeroDePortas = númeroDePortas;
    }

    public int getNúmeroDeMarcha() {
        return númeroDeMarcha;
    }

    public void setNúmeroDeMarcha(int númeroDeMarcha) {
        this.númeroDeMarcha = númeroDeMarcha;
    }

    public float getTamanhoDoTanque() {
        return tamanhoDoTanque;
    }

    public void setTamanhoDoTanque(float tamanhoDoTanque) {
        this.tamanhoDoTanque = tamanhoDoTanque;
    }
    void ligar(){
        System.out.println("switched on");
    }   
    void desligar(){
        System.out.println("off");
    }
    void buzinar (){
        System.out.println("Fum Fum");
    }
    void acelerar (){
        velocidadeAtual = velocidadeAtual+10;
    }
    void freiar (){
        velocidadeAtual = velocidadeAtual-10;
    }
    void trocaMarcha(){
       if (númeroDeMarcha<=5){
           númeroDeMarcha = númeroDeMarcha +1; 
       }        
    }
    void reduçãoDeMarcha (){
        if (númeroDeMarcha>=1){
           númeroDeMarcha = númeroDeMarcha -1; 
       }
    }
}