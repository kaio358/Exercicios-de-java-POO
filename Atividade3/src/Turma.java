
public class Turma {
   private Aluno lista [];
   private int tamanhoAtual;
   private int capacidade;
   public Turma(int tamanho){
       this.lista = new Aluno[tamanho];
       this.tamanhoAtual = 0;
       this.capacidade = tamanho;
   }
   public void adicionarAluno(Aluno novoAluno){
       if (this.tamanhoAtual<capacidade){
           this.lista[tamanhoAtual]=novoAluno;
           tamanhoAtual++;
       }
       else{
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
    public void exibirAluno (Aluno a){
        System.out.println(a.getNome());
        System.out.println(a.getIdade());
        System.out.println(a.getRa());
    }
    public Aluno buscarAluno(int codigoRa){
        for (int i = 0;i<tamanhoAtual;i++){
            if(this.lista[i].getRa() == codigoRa){
               return lista[i];
            }
        }
        return null ;
    }
    public void atualizarAluno(int ra, String novoNome,String nick){
         if(this.buscarAluno(ra)!=null){
            for (int i = 0;i<tamanhoAtual;i++){
            if(this.lista[i].getNome().equals(novoNome)){
            this.lista[i].setNome(nick);
            this.exibirAluno(this.buscarAluno(ra));
            }    
            }
            }
         }
           
    public void apagarAluno(int ra){
        for (int i = 0;i<tamanhoAtual;i++){
            if(this.lista[i].getRa() == ra){
                this.lista[i].setNome(null);
                this.lista[i].setRa(-1);
            }
        }
    }
}
