public class Aluno {
private String nome;
private int idade,ra;
    public Aluno (String nome, int idade, int ra){
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
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