
package listawhile2;
import java.util.Scanner;
public class ListaWhile2 {

    public static void main(String[] args) {
        int continuar = 0,idade,conjuntoDeIdade = 0,total,contador=1;
        while(continuar== 0){
            Scanner opção = new Scanner(System.in);
            System.out.println("Informe a idade desejada : ");
            idade = opção.nextInt();
            if (idade>0){
            conjuntoDeIdade = conjuntoDeIdade+idade;
            total = conjuntoDeIdade/contador;
            contador++;
            System.out.println(total);
            System.out.println("Se desja parar só digitar qualquer tecla");
            System.out.println("Para continuar digite 0");
            continuar = opção.nextInt();
            }
        }
    }
    
}
