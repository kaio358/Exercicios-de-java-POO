
package listafor2;


public class ListaFor2 {

    public static void main(String[] args) {
        System.out.println("A)\n");
       for (int i = 1;i<=6;i ++ ){
           System.out.println("");
           for (int j = 1;j <=15;j ++){
             System.out.print("-");  
           }
       }
        System.out.println("");
        System.out.println("\nB)\n");
        for (int i = 0;i <6;i++){
            System.out.println("");
            for (int j = 0;j <15;j++){
if (((i==j)&&(i!=0))||(((i == 0)&&(j==11))||((i ==1)
        &&(j==10))||((i==2)&&(j==9))||((i==3)&&(j==8))
        ||((i==4)&&(j==7)) )){
                    System.out.print(" ");
                }else{
                    System.out.print("-"); 
                }
               
            }
        }
        System.out.println("");
        System.out.println("\nC)");
        for (int i = 0;i<3;i++){
            System.out.println("");
                for(int j = 0;j <45;j++){
                   if (((i==0)&&(j<30))||((i == 1)&&(j<15))
                           ||((i == 1)&&(j >29))||((i == 2)
                           &&(j<29)&&(j >15))){
                       System.out.print("-");
                   }else{
                       System.out.print(" ");
                   }
                }
        }
        System.out.println("");
        System.out.println("\n D) ");
        for (int i = 0;i < 7; i++){
            System.out.println("");
            for (int j = 0;j<15;j ++){
                if(((i == 2)&&((j > 2)&&(j <6)))||((i == 2)
                        &&((j > 8 )&&(j < 12)))||((i ==3)
                        &&((j>5)&&(j < 9)))||((i == 4)&&
                        ((j > 2)&&(j <6)))||((i == 4)
                        &&((j > 8 )&&(j < 12)))){
                    System.out.print(" ");
                }else{
                    System.out.print("-");
                }
            }
        }
    }
    
}
