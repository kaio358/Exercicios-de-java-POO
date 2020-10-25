
package Atividade3;
import Atividade2.Porta;
import Atividade1.Pessoa;
public class Casa {
    String cor;
    Porta portaDeEntrada;
    Porta portaDosFundos;
    Porta portaLateral;
    Pessoa proprietario;
    public Casa (){
      portaDeEntrada = new Porta();
      portaDosFundos = new Porta();
      portaLateral = new Porta();
    }
    void pinta(String s){
        this.cor = s;
    }
    int quantasPortasEstãoAbertas(){
        
        if ((this.portaDeEntrada.estaAberta()==true)&&(
            this.portaDosFundos.estaAberta() ==true)
           &&(this.portaLateral.estaAberta()== true)){
          return 3;
        }
        if (((this.portaDeEntrada.estaAberta()==true)&&(
            this.portaDosFundos.estaAberta() ==true)
           &&(this.portaLateral.estaAberta()== false))||(
            (this.portaDeEntrada.estaAberta()==true)&&(
            this.portaDosFundos.estaAberta() ==false)
           &&(this.portaLateral.estaAberta()== true))||
           (this.portaDeEntrada.estaAberta()==false)&&(
            this.portaDosFundos.estaAberta() ==true)
           &&(this.portaLateral.estaAberta()== true)){
          return 2;
        }
        if ((this.portaDeEntrada.estaAberta()==true)&&(
            this.portaDosFundos.estaAberta() ==false)
           &&(this.portaLateral.estaAberta()== false)){
            return 1;
        }
        return 0;
    } 
}

