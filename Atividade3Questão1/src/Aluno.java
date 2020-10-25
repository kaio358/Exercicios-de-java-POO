public class Aluno {
private String nome;
private int idade,ra;
 public void exibirAluno (Aluno a){
        System.out.println(this.getNome());
        System.out.println(this.getIdade());
        System.out.println(this.getRa());
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public int getRa() {
        return ra;
    }

    
    public void setRa(int ra) {
        this.ra = ra;
    }

}
