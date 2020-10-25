public class IngressoVip extends Ingresso {
 float valorAdicional = 0;

    public IngressoVip(float novoValor) {
        super(novoValor);
    }
 @Override
 float getValor (){
     return valor+this.valorAdicional;
 }
 
}