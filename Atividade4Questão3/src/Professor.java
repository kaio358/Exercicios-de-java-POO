import java.util.Arrays;
import java.util.Scanner;
public class Professor extends Turma {
    Scanner inserirValor = new Scanner(System.in);
    private float media;
    private Aluno notaDoAluno;
    public Professor(int tamanho) {
        super(tamanho);
    }
    private float notaDoAluno(){
        System.out.println(Arrays.toString(this.notaDoAluno.getEntrega()));
        this.notaDoAluno.nota = inserirValor.nextFloat();
        this.media = (this.nota +this.notaDoAluno.nota)/2;
        return this.media;
    }
    private int presença (){
        System.out.println("Informe as faltas ");
        this.faltas = inserirValor.nextInt();
        this.faltas = 200 -this.faltas;
        return this.faltas;
    }
    public void passouOuNão (){
        if ((this.media >=6)&&(this.faltas>150)){
            System.out.println("Passou!!");
        }else{
            System.out.println("Não passou");
        }
    }
    public float getMedia() {
        return media;
    }
    
}
