public class Psciquico extends Pokemon  {
    private int psychic = 55;
    
    public Psciquico(String nome, String dono, int idade, int tamanhoDaVida) {
        super(nome, dono, idade, tamanhoDaVida);
    }

    @Override
    public void envoluir() {
 
    }

    @Override
    public int atacar(int takeDown,int growl) {
        this.takeDown = takeDown;
      
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