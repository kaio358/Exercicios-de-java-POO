public class Turma {
   private Aluno lista [];
   private int tamanhoAtual;
   private int capacidade;
   public void turma(int tamanho){
       this.lista = new Aluno[tamanho];
       this.tamanhoAtual = 0;
       this.capacidade = tamanho;
   }
   public void adicionarAluno(Aluno novoAluno){
       if (this.tamanhoAtual<this.capacidade){
           this.lista[tamanhoAtual]=novoAluno;
           tamanhoAtual++;
       } else{
           System.out.println("Turma lotada ");
       }
       
   }
   public void exibirInformações(){
       for (int i = 0;i<tamanhoAtual;i++){
           System.out.println(this.lista[i].getNome());
           System.out.println(this.lista[i].getIdade());
           System.out.println(this.lista[i].getRa());
       }
   
   }
}
