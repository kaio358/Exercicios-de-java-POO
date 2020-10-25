
import java.util.ArrayList;


public class Agenda {
    ArrayList <Contato> lista = new ArrayList<>();
    
    @Override
    public String toString(){
        return "lista : "+this.lista;
    }
    void adicionar(Contato contato){
        lista.add(contato);
    }
    void remover (Contato contato){
            lista.remove(contato);
       
    }
    ArrayList listarTodos(){
        
        for(Contato lista2 : lista){
            return lista;
        }
        return null;
    }
    ArrayList<Contato> listarPorNome (String nome){
        ArrayList <Contato> novo2 = new ArrayList <>() ;
        for (Contato novo3 : lista){
       
        if (novo2.contains(nome)){
        novo2.add(novo3);
        }
 
        }
        return novo2;
        
    }
   
    Contato listarPorId(int id){
        for (Contato entidade : lista){
            if (entidade.getId() == id){
                return entidade;
            }
        }
        
        return null;
    }
}