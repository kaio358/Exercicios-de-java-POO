package agendaDeContatos;
import java.util.Objects;

public class Contato {
	  //atributos...
    private Integer id;
    private String nome;
    private String telefone;
    private String email;
    private static Integer quantidadeContatos = 0;

    //construtor...
    public Contato(String nome, String telefone, String email) {        
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        quantidadeContatos ++;
        this.id = quantidadeContatos;
    }

    //gets e sets...
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    

    //equals...
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contato other = (Contato) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome= " + nome + ", telefone= " + telefone + ", email= " + email + "]";
	}

	
}
    
