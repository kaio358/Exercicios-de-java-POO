import java.util.Scanner;
public class Aluno extends EscolaOnline {
    private String entrega[];
    Scanner informar = new Scanner(System.in);

    public Aluno (String nome,int registroAcademico,String sexo,int idade
            ,int nota){
    this.nome =nome;
    this.registroAcademico = registroAcademico;
    this.sexo = sexo;
    this.idade = idade;
    this.nota = nota;
    }
    public String[] entregaDeTrabalho (int contadora,int laçoDeRepetição){
    do{
        System.out.println("Insira o seu trabalho");
        trabalho = informar.nextLine();
        this.getEntrega()[contadora] = this.trabalho;
        contadora++;
        System.out.println("Continuar ? ");
        laçoDeRepetição = informar.nextInt();
    }while(laçoDeRepetição == 1);
    return getEntrega();
    }

    public String[] getEntrega() {
        return entrega;
    }

  
    public void setEntrega(String[] entrega) {
        this.entrega = entrega;
    }

  
}