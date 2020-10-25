public class Normal extends Ingresso {
    
    public Normal(int novoValor) {
        super(novoValor);
    }
    public void imprimirValorDoIngresso(){
        System.out.println(this.imprimirValor()/2);
    }
}