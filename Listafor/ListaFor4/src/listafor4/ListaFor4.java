
package listafor4;
public class ListaFor4 {

    public static void main(String[] args) {
        
        
        for (int multiploPor2 = 0;multiploPor2 <= 100;multiploPor2+=2){
            System.out.println("O valor do multiplo por 2 : "+multiploPor2);
        }
        System.out.println("");
        for (int multiploPor3 = 0;multiploPor3 <= 100;multiploPor3+=3){
            System.out.println("O valor do multiplo por 3 : "+multiploPor3);
        }
        System.out.println("");
        for (int multiploPor5 = 0;multiploPor5 <=100;multiploPor5+=5){
            System.out.println("O valor do multiplo por 5 : "+multiploPor5);
        }
        System.out.println("");
        System.out.println("Por 2 : "+100/2+" Por 3 : "+100/3+" Por 5 : "+100/5);
    }
    
}