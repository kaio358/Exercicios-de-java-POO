public class Camarote extends Vip {
    private int assento;
    public Camarote(int novoValor) {
        super(novoValor);
    }
    public void localização (int assento){
        this.assento = assento;
        System.out.println(this.assento);
    }
    public float imprimirValorDoCamarote (){
        return this.novoValor()+300;
    }
    
}