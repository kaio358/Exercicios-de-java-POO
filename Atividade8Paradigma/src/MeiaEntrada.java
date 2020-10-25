public class MeiaEntrada extends Ingresso{
    
    public MeiaEntrada(float novoValor) {
        super(novoValor);
    }
    @Override
    float getValor (){
     return valor/2;
    }
}