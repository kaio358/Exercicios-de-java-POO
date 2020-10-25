public abstract class Pokemon {
    protected String nome;
    protected String dono;
    protected int idade;
    protected int tamanhoDaVida;
    protected int takeDown;
    protected int growl;
    private int life;
    public Pokemon (String nome,String dono,int idade,int tamanhoDaVida){
        this.nome = nome;
        this.dono = dono;
        this.idade = idade;
        this.tamanhoDaVida = tamanhoDaVida;
    }

    protected abstract void envoluir();
    protected abstract int atacar(int takeDown,int growl);
    public final void morrer(){
        System.out.println(this.nome+" Esta Morto");
    }
    protected abstract int vida(int life);

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}