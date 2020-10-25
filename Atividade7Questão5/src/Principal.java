import java.util.Scanner;
public class Principal {
public static void main (String []args){
    int numero1 = 0,numero2= 0;
    int escolher;
    CalculadoraCientifica a = new CalculadoraCientifica();
    Calculadora b = new Calculadora(0,0);
    Scanner informar = new Scanner (System.in);
    System.out.println("Escolha que tipo de Calculo será feito");
    System.out.println("Tipo            | Codigo ");
    System.out.println("Soma Binaria    |   1    ");
    System.out.println("Soma de real    |   2    ");
    System.out.println("Soma de inteiros|   3    ");
    System.out.println("Expoente        |   4    ");
    System.out.println("Seno            |   5    ");
    System.out.println("Cosseno         |   6    ");
    escolher = informar.nextInt();
    switch (escolher){
        case 1:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        numero2 = informar.nextInt();
        b.somaBin(numero1, numero2);
            System.out.println(b.somaBin(numero1, numero2));
        break ;
        case 2:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        numero2 = informar.nextInt();
        b.somaDub(numero1, numero2);
        System.out.println(b.somaDub(numero1, numero2));
        break ;
        case 3:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        numero2 = informar.nextInt();
        b.somaInt(numero1, numero2);
        System.out.println(b.somaInt(numero1, numero2));
        break ;
        case 4:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        numero2 = informar.nextInt();
        a.expo(numero1,numero2);
        System.out.println(a.expo(numero1,numero2));
        break ;
        case 5:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        
        a.seno(numero1);
        System.out.println(a.seno(numero1));
        break ;
        case 6:
        System.out.println("Informe os valores");
        numero1 = informar.nextInt();
        
        a.cosseno(numero1);
        System.out.println(a.cosseno(numero1));
        break ;
    }
}    
}
