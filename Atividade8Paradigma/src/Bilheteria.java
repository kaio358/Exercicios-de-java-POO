import java.util.Scanner;
public class Bilheteria {
 public static void main (String[]args){
     Scanner informar = new Scanner(System.in);
     float cadastrar = 0;
     float total =0;
     int escolher = 0;
     System.out.println("Informe o valor do Ingresso");
     cadastrar = informar.nextFloat();
     MeiaEntrada ingresso1 = new MeiaEntrada (cadastrar);
     IngressoNormal ingresso2 = new IngressoNormal(cadastrar);
     IngressoVip ingresso3 = new IngressoVip (cadastrar);
     do{
     System.out.println("Escolha as opções a seguir :");
     System.out.println("1 para meia entrada");
     System.out.println("2 para ingresso normal");
     System.out.println("3 para ingresso vip");
     System.out.println("4 imprimir todos os bilhetes");
     escolher = informar.nextInt();
     switch (escolher){
         case 1 :
              total = total+ingresso1.getValor();
             System.out.println("Continuar comprando ? Caso deseja "
                     + "sair digite 4");
             System.out.println("Caso contrario digite outro numero da lista");
             escolher = informar.nextInt();
         break ;
         case 2 :
             System.out.println(ingresso2.getValor(null));
             total = total+cadastrar;
             System.out.println("Continuar comprando ? Caso deseja "
                     + "sair digite 4");
             System.out.println("Caso contrario digite outro numero da lista");
             escolher = informar.nextInt();
         break;
         case 3 :
             total = total +ingresso3.getValor();
             System.out.println("Continuar comprando ? Caso deseja"
                     + " sair digite 4");
             System.out.println("Caso contrario digite outro numero da lista");
             escolher = informar.nextInt();
         break ;
     }
     }while(escolher < 4);
     System.out.println("Total :"+total);
 }   
}