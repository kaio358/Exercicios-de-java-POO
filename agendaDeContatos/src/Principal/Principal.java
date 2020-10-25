/**
 * 
 */
package Principal;

import java.util.ArrayList;
import java.util.Scanner;

import agendaDeContatos.Agenda;
import agendaDeContatos.Contato;

public class Principal {


	 private static Agenda agenda = new Agenda();

	public static void main(String[] args) {
	     contatosProntos();
	        exibirMenu();

	    }

	    //menu...
	    private static void exibirMenu() {
	        System.out.println("=".repeat(10) + "Menu" + "=".repeat(10));
	        System.out.println("1. Adicionar Contatos: ");
	        System.out.println("2. Remover Contato: ");
	        System.out.println("3. Listar Contatos: ");
	        System.out.println("4. Buscar Contato por nome: ");
	        System.out.println("=".repeat(24));
	        Scanner sc = new Scanner(System.in);
	        int opcao;
	        do {
	            System.out.println("Escolha uma opcao: ");
	            opcao = Integer.parseInt(sc.next());
	            switch (opcao) {
	                case 1:
	                    adicionarContato();
	                    break;
	                case 2:
	                    removerContato();
	                    break;
	                case 3:
	                    listarContatos();
	                   
	                    break;
	                case 4:
	                    buscarContatoPorNome();
	                    break;
	            }
	        } while (opcao != 0);
	    }

	    //adiciona todos os contatos...
	    private static void adicionarContato() {
	        System.out.println("1. Adicionar Contatos: ");
	        System.out.println("Digite o nome do Contato: ");
	        Scanner sc = new Scanner(System.in);
	        String nome = sc.nextLine();
	        System.out.println("Digite o telefone do Contato: ");
	        String telefone = sc.nextLine();
	        System.out.println("Digite o email do Contato: ");
	        String email = sc.nextLine();

	        Contato contato = new Contato(nome, telefone, email);

	        agenda.adicionar(contato);

	        System.out.println("Contato Cadastrado!\n");

	    }

	    //Lista todos os contatos....
	    private static void listarContatos() {
	        System.out.println("3. Listar Contatos: ");
	        ArrayList<Contato> contatos = agenda.listarTodos();
	        for (Contato contato : contatos) {
	            System.out.println(contato);
	        }
	    }

	    //contatos prontos...
	    private static void contatosProntos() {

	        agenda.adicionar(new Contato("João Pedro", "6798658798", "joao@gmail.com"));
	        agenda.adicionar(new Contato("Marisa Farah", "679899998", "marisa@gmail.com"));
	        agenda.adicionar(new Contato("Luis Cuevas", "6798658798", "luis@gmail.com"));
	        
      
	    }

	    //remover o contato...
	    private static void removerContato() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("2. Remover Contato: ");
	        listarContatos();
	        System.out.println("Insira o Id a ser removido: ");
	        int id = Integer.parseInt(sc.nextLine());
	        Contato contato = agenda.listarPorId(id);
	        if (contato != null) {
	            agenda.remover(contato);
	            System.out.println(contato);
	        }
	    }

	    //buscar contatos por nome...
	    private static void buscarContatoPorNome() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("4. Buscar Contato por nome: ");
	        System.out.println("Digite o nome a ser buscado: ");
	        String nome = sc.nextLine();
	        ArrayList<Contato> listaPorNome = agenda.buscarPorNome(nome);
	        for (Contato contato : listaPorNome) {
	            System.out.println(contato);
	        }
	    }




	}
		
	

