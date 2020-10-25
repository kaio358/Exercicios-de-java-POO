import java.util.Scanner;
public class Principal {
    public static void main (String [] args){
        int codigoRa;
        String nick;
        Scanner informar = new Scanner(System.in);
       
        System.out.println("Informe o nome do aluno");
        String nome = informar.nextLine();
        System.out.println("Informe a idade");
        int idade = informar.nextInt();
        System.out.println("Informar o ra");
        int ra = informar.nextInt();
        Aluno estudante1 = new Aluno (nome,idade,ra);
        Turma x = new Turma(1);
        x.adicionarAluno(estudante1);
        System.out.println("Informe o Ra do aluno que está a procura ");
        codigoRa = informar.nextInt();
        System.out.println("Informe o novo nome a ser adotado ");
        String novoNome = informar.nextLine();
        nick = informar.nextLine();
        x.atualizarAluno(codigoRa,nome,nick);
        System.out.println("Informe ra do aluno que será apagado");
        ra = informar.nextInt();
        x.apagarAluno(ra);
        x.exibirAluno(estudante1);
    }
}