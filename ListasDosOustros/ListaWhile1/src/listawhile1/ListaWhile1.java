
package listawhile1;
import java.util.Scanner;
public class ListaWhile1 {

    public static void main(String[] args) {
       int vA,vB,i;
       float tA=0,tB=0;
     Scanner inserir = new Scanner(System.in);
        System.out.println("Informe Dois valores");
        vA = inserir.nextInt();
        vB = inserir.nextInt();
        if ((vA>0)&&(vB>0)){
              while((tA<vA+vB)&&(tB<vA+vB)){
                 tA = (int) Math.pow(2,((vA-vB)/2)) +vB+vA;
                 System.out.println("A) ");
                 System.out.println(tA);
                 if((vA-vB)%2==1){
                     i = (vA-vB)%2;
                   while(i<vA-vB){
                     i =  (i+2)*i;
                     tB= vA+vB+i;
                   }
                     System.out.println("B)");
                     System.out.println(tB);
                 }
              }
        }
    }
    
}
