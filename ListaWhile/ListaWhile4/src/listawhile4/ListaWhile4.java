
package listawhile4;
import java.util.Scanner;
public class ListaWhile4 {

    public static void main(String[] args) {
        int valor = 3;
        Scanner adivinha = new Scanner (System.in);
        while ((valor <100)&&(valor>0)){
            System.out.println("Escolha o seu numero : ");
            valor = adivinha.nextInt();
            if (valor>=80){
                System.out.println("Congelante");
            }
            if ((valor>=65)&&(valor<=79)){
                System.out.println("Muito Frio");
            }
            if ((valor>=45)&&(valor<=64)){
                System.out.println("Frio");
            }
            if ((valor>=30)&&(valor<=44)){
                System.out.println("Friozinho");
            }
            if ((valor>=20)&&(valor<=29)){
                System.out.println("Começando a esquentar");
            }
            if ((valor>=8)&&(valor<=19)){
                System.out.println("Tá quente!");
            }
            if ((valor>=1)&&(valor<=7)){
                System.out.println("Muito quente!");
            }
            if (valor==0){
                System.out.println("Acertou");
            }
        }
    }
    
}
