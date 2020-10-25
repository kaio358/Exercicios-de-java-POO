
package listawhile1;
import java.util.Scanner;
public class ListaWhile1 {

    public static void main(String[] args) {
       int valor,valor2,intervalo;
       float totalA=0,totalB=0;
     Scanner inserir = new Scanner(System.in);
        System.out.println("Informe Dois valores");
        valor = inserir.nextInt();
        valor2 = inserir.nextInt();
        if ((valor>0)&&(valor2>0)){
              while((totalA<valor+valor2)&&(totalB<valor+valor2)){
                 totalA = (int) Math.pow(2,((valor-valor2)/2))  +valor2+valor;
                 System.out.println("A) ");
                 System.out.println(totalA);
                 if((valor-valor2)%2==1){
                     intervalo = (valor-valor2)%2;
                   while(intervalo<valor-valor2){
                     intervalo =  (intervalo+2)*intervalo;
                     totalB= valor+valor2+intervalo;
                   }
                     System.out.println("B)");
                     System.out.println(totalB);
                 }
              }
        }
    }
    
}
