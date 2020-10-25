
package listafor2;


public class ListaFor2 {

    public static void main(String[] args) {
        System.out.println("A)\n");
       for (int cont = 1;cont <=6;cont ++ ){
           System.out.println("");
           for (int contador = 1;contador <=15;contador ++){
             System.out.print("-");  
           }
       }
        System.out.println("");
        System.out.println("\nB)\n");
        for (int cont = 0;cont <6;cont++){
            System.out.println("");
            for (int contador = 0;contador <15;contador++){
if (((cont==contador)&&(cont!=0))||(((cont == 0)&&(contador==11))||((cont ==1)
        &&(contador==10))||((cont==2)&&(contador==9))||((cont==3)&&(contador==8))
        ||((cont==4)&&(contador==7)) )){
                    System.out.print(" ");
                }else{
                    System.out.print("-"); 
                }
               
            }
        }
        System.out.println("");
        System.out.println("\nC)");
        for (int cont = 0;cont<3;cont++){
            System.out.println("");
                for(int contador = 0;contador <45;contador++){
                   if (((cont==0)&&(contador<30))||((cont == 1)&&(contador<15))
                           ||((cont == 1)&&(contador >29))||((cont == 2)
                           &&(contador<29)&&(contador >15))){
                       System.out.print("-");
                   }else{
                       System.out.print(" ");
                   }
                }
        }
        System.out.println("");
        System.out.println("\n D) ");
        for (int cont = 0;cont < 7; cont++){
            System.out.println("");
            for (int contador = 0;contador<15;contador ++){
                if(((cont == 2)&&((contador > 2)&&(contador <6)))||((cont == 2)
                        &&((contador > 8 )&&(contador < 12)))||((cont ==3)
                        &&((contador >5)&&(contador < 9)))||((cont == 4)&&
                        ((contador > 2)&&(contador <6)))||((cont == 4)
                        &&((contador > 8 )&&(contador < 12)))){
                    System.out.print(" ");
                }else{
                    System.out.print("-");
                }
            }
        }
    }
    
}
