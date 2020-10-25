/**
 * 
 */
package agendaDeContatos;

import java.util.ArrayList;

public class Agenda {
	
	 //atributos...
    private ArrayList<Contato> contatos;

    //contrutor...
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    //metodos...    
    public void adicionar(Contato contato) {
        contatos.add(contato);
        
    }

    public void remover(Contato contato) {
        if (contato != null) {
            contatos.remove(contato);
        }
    }

    public ArrayList<Contato> listarTodos() {
        return this.contatos;
    }

    public ArrayList buscarPorNome(String nome) {
        ArrayList<Contato> listaPorNomes = new ArrayList<>();
        for (Contato contatoDaLista: contatos) {
            if (contatoDaLista.getNome().startsWith(nome)) {
                listaPorNomes.add(contatoDaLista);
            }
        }
        return listaPorNomes;
    }

    public Contato listarPorId(int id) {
        for (Contato c : contatos) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Agenda{" + "contatos=" + contatos + '}';
    }

    
}
