package Atividade1;



import Atividade1.Pessoa;
import java.util.Scanner;
public class Principal {
public static void main (String [] args){
    Pessoa x = new Pessoa();
    Scanner informar = new Scanner (System.in);
    System.out.println("Informe o nome ");
    x.nome = informar.nextLine();
    System.out.println("Informar a idade ");
    x.idade = informar.nextInt();
    x.fazAniversario();
    x.fazAniversario();
}    
}
