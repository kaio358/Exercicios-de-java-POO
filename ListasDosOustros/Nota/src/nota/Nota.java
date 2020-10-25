
package nota;
import java.util.Scanner;
public class Nota {

    public static void main(String[] args) {
        Scanner informar = new Scanner (System.in);
        double[] nota = new double [3];
        double media = 0;
        int armazenamento = 0;
        
        for (int i = 0;i <4;i++){
            
            System.out.println("Informe a nota do aluno "+1+i);
            nota [i] = informar.nextDouble();
            armazenamento = (int) (armazenamento +nota[i]);
        }
        media = armazenamento/4;
        System.out.println("A media da classe : "+media);
    }
    
}
