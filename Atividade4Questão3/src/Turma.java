public class Turma extends EscolaOnline {
    private String disciplina;
    private Aluno lista[];
    private int tamanhoDaTurma;
    private int capacidade;
    public Turma (int tamanho){
        this.lista = new Aluno[tamanho];
        this.tamanhoDaTurma = 0;
        this.capacidade = tamanho;
    }
    
    protected void cadastrarNoDiario (Aluno novoAluno){
        if(this.cadastrarDisciplina(disciplina)!= null){
           if (tamanhoDaTurma<capacidade){
            this.lista[tamanhoDaTurma] = novoAluno;
            tamanhoDaTurma++;
           }else{
            System.out.println("Turma lotada ");
           } 
        }else{
            System.out.println("Desculpa sem disciplina para ser cadastrado");
        }
        
    }
    protected String cadastrarDisciplina (String disciplina){
       this.disciplina = disciplina;
       return disciplina;
    }    
    protected void retirarNoDiario(int ra){
      for (int i = 0;i<tamanhoDaTurma; i++){
          if (this.lista[i].registroAcademico == ra ){
              this.lista[i].nome = null;
              this.lista[i].idade = 0;
              this.lista[i].sexo = null;
              this.lista[i].nota = 0;
              this.lista[i].registroAcademico = 0;
              this.lista[i].nota = 0;
          }
      }  
    }
   protected Aluno buscarAluno(int codigoRa){
        for (int i = 0;i<tamanhoDaTurma;i++){
            if(this.lista[i].registroAcademico== codigoRa){
               return this.lista[i];
            }
        }
        return null ;
    }
}
