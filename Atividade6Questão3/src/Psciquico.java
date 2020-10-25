public class Psciquico extends Pokemon  {
    private int psychic;
    
    public Psciquico(String nome, String dono, int idade, int tamanhoDaVida) {
        super(nome, dono, idade, tamanhoDaVida);
    }

    @Override
    public void envoluir() {
 
    }

    @Override
    public int atacar(int takeDown,int growl) {
        this.takeDown = takeDown;
        this.psychic = 55;
        if (growl == 2){
            this.growl = (int) (takeDown - (takeDown *0.20));
        }
        return takeDown;
    }
    
    
}