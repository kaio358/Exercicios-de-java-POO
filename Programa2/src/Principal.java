import java.util.Scanner;
public class Principal {
public static void main (String [] args){
    Porta nova = new Porta();
    Scanner informar = new Scanner(System.in);
    nova.abre();
    nova.fecha();
    System.out.println("Informe a dimensão x");
    nova.dimensãox = informar.nextFloat();
    System.out.println("Informe a dimensão y");
    nova.dimensãoy = informar.nextFloat();
    System.out.println("Informe a dimensão z");
    nova.dimensãoz = informar.nextFloat();
    nova.booleanestaAberta();
}    
}