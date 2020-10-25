public class Porta {
 int aberta ;
float dimensãox,dimensãoy,dimensãoz;
String cor;
void abre (){
    aberta++;
}
void fecha(){
    aberta--;
}
void pinta (String s){
    System.out.println(cor);
}
void booleanestaAberta(){
if (aberta == 0){
    System.out.println("Fechado");
}else{
    System.out.println("Aberto");
}
}
}
