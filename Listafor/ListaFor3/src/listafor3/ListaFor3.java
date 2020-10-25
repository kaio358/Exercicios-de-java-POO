
package listafor3;

import java.util.Scanner;

public class ListaFor3 {

    public static void main(String[] args) {
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira um valor abaixo de 100");
        n= teclado.nextInt();
        for(int i = 0;i < 4;i++){
            if (n <=100){
            System.out.println(n+" X 3 = "+n*3);
            n= n*3;
            }
        }
    }
   
}
