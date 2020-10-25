
package listafor5;

public class ListaFor5 {

    public static void main(String[] args) {
        for (int contadora =233;contadora<=456; contadora+=5){
            if((contadora >=300)&&(contadora<=400)){
                contadora = contadora -2;
                System.out.println(contadora);
            }else{
                System.out.println(contadora);
            }
            
        }
    }
    
}
