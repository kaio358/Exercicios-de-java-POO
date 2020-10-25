public class Contato {
private int id;
private String nome;
private String telefone;
private String email;
private int quantidadeDeContato;
Contato (){
    quantidadeDeContato++;
    this.id = quantidadeDeContato;
    this.nome = null;
    this.email = null;
    this.telefone = null;
}
public Contato(String nome){
        this(); 
        this.nome = nome;
        quantidadeDeContato = quantidadeDeContato + 1;        
    }
public Contato(String nome, String email) {
        this();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
@Override
public String toString(){
 return "id: "+this.id+"nome: "+this.nome+"telefone: "+this.telefone+
         "email: "+this.email;
}

public boolean equals(Contato obj){
    if (obj instanceof Contato){
        return true;
    }else{
        return false;
    }
}

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getEmail() {
        return email;
    }

    
   
    public void setEmail(String email) {
        this.email = email;
    }
}
