
package listawhile2;
import java.util.Scanner;
public class ListaWhile2 {

    public static void main(String[] args) {
        int c = 0,i,con = 0,t,cont=1;
        while(c== 0){
            Scanner opção = new Scanner(System.in);
            System.out.println("Informe a idade desejada : ");
            i = opção.nextInt();
            if (i>0){
            con = con+i;
            t = con/cont;
            cont++;
            System.out.println(t);
            System.out.println("Se desja parar só digitar qualquer tecla");
            System.out.println("Para continuar digite 0");
            c = opção.nextInt();
            }
        }
    }
    
}
