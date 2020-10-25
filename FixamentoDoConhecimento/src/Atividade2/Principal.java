
package Atividade2;

public class Principal {
public static void main (String[]args){
Porta x = new Porta();
x.abre();
x.fecha();
x.pinta("Vermelho");
x.pinta("Azul");
x.dimensãoX = 55;
x.dimensãoY = 175;
x.dimensãoZ = 10;
System.out.println(x.estaAberta());
}


}
