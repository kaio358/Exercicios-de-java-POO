import java.util.Scanner;
public class Principal {
   public static void main (String []args){
       ContaBancaria x = new ContaBancaria();
       Scanner inserir = new Scanner(System.in);
       System.out.println("Informe o valor do saldo da conta ");
       x.saldo = inserir.nextInt();
       
       System.out.println("Escolha : ");
       System.out.println(" 1 - Mostrar dados ");
       System.out.println(" 2 - Depositar");
       System.out.println(" 3 - Sacar ");
       x.opção = inserir.nextInt();
       switch(x.opção){
           case 1 :
             x.mostraDados();
             System.out.println("Saldo atual : "+x.saldo);
               break;
           case 2 :
             System.out.println("Informe o valor que será depositado :");
             x.valor=inserir.nextFloat();
             x.depositar(x.valor);
             System.out.println("Saldo atual : "+x.saldo);
               break;
           case 3 :
               System.out.println("Informe o valor que será retirado :");
               x.valor = inserir.nextFloat();
               x.sacar(x.valor);
               System.out.println("Saldo atual : "+x.saldo);
               break;
       } 
   } 
}