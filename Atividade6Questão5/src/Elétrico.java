public class Elétrico extends Pokemon  {
    private int thunderShock;
    public Elétrico(String nome, String dono, int idade, int tamanhoDaVida) {
        super(nome, dono, idade, tamanhoDaVida);
    }

    @Override
    public void envoluir() {
        
    }

    @Override
    public int atacar(int takeDown,int growl) {
        if (growl == 2){
            this.growl = (int) (takeDown - (takeDown *0.20));
        }
        return takeDown;
    }
    @Override
    protected int vida(int life) {
        return this.getLife();
    }
}