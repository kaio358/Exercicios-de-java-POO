public class Fogo extends Pokemon  {
    
    public Fogo(String nome, String dono, int idade, int tamanhoDaVida) {
        super(nome, dono, idade, tamanhoDaVida);
    }

    @Override
    public void envoluir() {
        
    }

    @Override
    public int atacar(int takeDown,int growl) {
        return takeDown;
    }
    
}
