public abstract class Pokemon {
    protected String nome;
    protected String dono;
    protected int idade;
    protected int tamanhoDaVida;
    public Pokemon (String nome,String dono,int idade,int tamanhoDaVida){
        this.nome = nome;
        this.dono = dono;
        this.idade = idade;
        this.tamanhoDaVida = tamanhoDaVida;
    }

    protected abstract void envoluir();
    protected abstract void atacar();
    public final void morrer(){
        System.out.println(this.nome+"Esta Morto");
    }
}