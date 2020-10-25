
package listawhile3;

import java.util.Scanner;
public class ListaWhile3 {

    public static void main(String[] args) {
       int totalMasculino,totalFeminino,sexo,tempoDeVida,continuar = 0,feminino=0,masculino=0,
               mortoOuVivo,contadorDeMortoFeminino=0,contadorDeVivoFeminino = 0,
               contadorDeMortoMasculino=0,contadorDeVivoMasculino = 0,
               contadorDeTempo=0;
       Scanner bebe = new Scanner (System.in);
        while (continuar == 0){
        System.out.println("Informe o sexo (masculino 1 e Feminino 2)");
        sexo = bebe.nextInt();
        System.out.println("Informe o se morreu (1) ou está vivo(0) ");
        mortoOuVivo = bebe.nextInt();
        if (sexo == 1){
            if(mortoOuVivo == 1){
                System.out.println("Informe o tempo de vida em meses:");
                tempoDeVida = bebe.nextInt();
                if (tempoDeVida<=24){
                    contadorDeTempo++;
                }
                  contadorDeMortoMasculino++;    
                masculino++;
            }else{
                masculino++;
                contadorDeVivoMasculino++;
            }
        }else{
           if(mortoOuVivo == 1){
                System.out.println("Informe o tempo de vida em meses :");
                tempoDeVida = bebe.nextInt();
                if (tempoDeVida<=24){
                    contadorDeTempo++;
                }
                contadorDeMortoFeminino++;   
                feminino++;
            }else{
               feminino++;
                contadorDeVivoFeminino++;
            } 
        }
        System.out.println("Deseja continuar digite 0 para sair qualquer tecla");
        continuar = bebe.nextInt();
        }
        totalMasculino =((contadorDeMortoMasculino)/(masculino+feminino)*100);
        System.out.println("A porcentagem de criança do sexo masculino mortas :"
                +totalMasculino);
        totalFeminino =((contadorDeMortoFeminino)/(masculino+feminino)*100);
        System.out.println("A porcentagem de criança do sexo feminino mortas :"
                +totalFeminino);
        System.out.println("Numro total de crinaças morreram antes ou igual"
                + " nos meses 24(meses) "+contadorDeTempo);
    }
    
}
