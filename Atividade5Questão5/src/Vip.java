
public class Vip extends Ingresso {
    public Vip(int novoValor) {
        super(novoValor);
    }
    public int novoValor(){
        return this.imprimirValor()+100;
    }
}
