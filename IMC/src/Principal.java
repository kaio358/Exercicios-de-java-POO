import java.util.Scanner;
public class Principal {
    public static void main (String []args ){
         
        
        Scanner informar = new Scanner(System.in);
        Paciente x = new Paciente (); 
        System.out.println("Informe o peso em quilos");
        x.pesoEmQuilos = informar.nextDouble();
        System.out.println("Informe a altura em metros");
        x.alturaEmMetros = informar.nextDouble();
        x.calcularIMC();
        x.diaginostico();
        System.out.println(x.faixaDeValores);
        
        Paciente x1 = new Paciente ();
        System.out.println("Informe o peso em quilos");
        x1.pesoEmQuilos = informar.nextDouble();
        System.out.println("Informe a altura em metros");
        x1.alturaEmMetros = informar.nextDouble();
        x1.calcularIMC();
        x1.diaginostico();
        System.out.println(x1.faixaDeValores);
        
        Paciente x2 = new Paciente ();
        System.out.println("Informe o peso em quilos");
        x2.pesoEmQuilos = informar.nextDouble();
        System.out.println("Informe a altura em metros");
        x2.alturaEmMetros = informar.nextDouble();
        x2.calcularIMC();
        x2.diaginostico();
        System.out.println(x2.faixaDeValores);
    }
}
