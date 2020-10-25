
package listawhile4;
import java.util.Scanner;
public class ListaWhile4 {

    public static void main(String[] args) {
        int v = 7;
        Scanner adivinha = new Scanner (System.in);
        while ((v <100)&&(v>0)){
            System.out.println("Escolha o seu numero : ");
            v = adivinha.nextInt();
            if (v>=80){
                System.out.println("Congelante");
            }
            if ((v>=65)&&(v<=79)){
                System.out.println("Muito Frio");
            }
            if ((v>=45)&&(v<=64)){
                System.out.println("Frio");
            }
            if ((v>=30)&&(v<=44)){
                System.out.println("Friozinho");
            }
            if ((v>=20)&&(v<=29)){
                System.out.println("Começando a esquentar");
            }
            if ((v>=8)&&(v<=19)){
                System.out.println("Tá quente!");
            }
            if ((v>=1)&&(v<=7)){
                System.out.println("Muito quente!");
            }
            if (v==0){
                System.out.println("Acertou");
            }
        }
    }
    
}
