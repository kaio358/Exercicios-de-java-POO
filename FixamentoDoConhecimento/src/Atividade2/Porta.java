
package Atividade2;


public class Porta {
String cor;
int aberta = 0;
float dimensãoX,dimensãoY,dimensãoZ;
public void  abre(){
    aberta++;
}
public void fecha(){
    aberta--;
}
public void pinta(String s){
    this.cor = s;
}
public boolean estaAberta(){
    if(aberta==1){
        return true;
    }else{
        return false;
    }
}
    
}
