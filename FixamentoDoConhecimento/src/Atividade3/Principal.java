
package Atividade3;

public class Principal {
public static void main (String[]args){
    Casa x = new Casa();
    x.cor="verde";
    x.portaDeEntrada.abre();
    x.portaDosFundos.fecha();
    x.portaLateral.abre();
    System.out.println(x.quantasPortasEstãoAbertas());
}
    
}
