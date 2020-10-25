import java.util.ArrayList;
import java.util.Scanner;
public class AgendaContatos {
     private static Agenda agenda;
     
    
    
    public static void main (String []args){
   
    }
    private static void exibirMenu(){
    int escolha;
    
    do {
     Scanner informar = new Scanner(System.in);
     System.out.println(" Menu ");
     System.out.println("1. adicionar contato ");
     System.out.println("2. remover contato");
     System.out.println("3. lista de contatos");
     System.out.println("4. buscar nome de contato");
     System.out.println("Digite 5 para sair");
     escolha = informar.nextInt();
     switch(escolha){
         case 1 :
             adicionarContato(informar);
         break;
         case 2:
             removerContato(informar);
         break;
         case 3 :
             listarContato(informar);
         break;
         case 4 :
             buscarPorNome(informar);
         break; 
     }
    }while(escolha == 5);
    }
    private static void adicionarContato(Scanner informar){
        int identificação;
        String nomeDaPessoa,correioEletronico,numeroDoTelefone;
            Contato novo = new Contato(); 
             System.out.println("Informe o ID");
             identificação = informar.nextInt();
             novo.setId(identificação);
             System.out.println("Informe o nome");
             nomeDaPessoa = informar.nextLine();
             novo.setNome(nomeDaPessoa);
             System.out.println("Informe o telefone");
             numeroDoTelefone = informar.nextLine();
             novo.setTelefone(numeroDoTelefone);
             System.out.println("Informe o Email");
             correioEletronico = informar.nextLine();
             novo.setTelefone(numeroDoTelefone);
             System.out.println("Contato cadastrado");
             agenda.adicionar(novo);
    }
    private static void removerContato(Scanner informar){
        System.out.println(agenda.listarTodos());
        
        System.out.println("Insira o id a ser removido");
        int identificação = informar.nextInt();
        Contato novo = agenda.listarPorId(identificação);
        agenda.remover(novo);
    }
    private static void listarContato(Scanner informar){
        System.out.println(agenda.listarTodos());
        
    }
    private static void buscarPorNome(Scanner informar){
       System.out.println("Informe o nome ");
       String nomeDoSerVivo = informar.nextLine();
        System.out.println(agenda.listarPorNome(nomeDoSerVivo));
    }
}