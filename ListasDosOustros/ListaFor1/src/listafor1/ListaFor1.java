
package listafor1;

import java.io.IOException;

public class ListaFor1 {

    public static void main(String[] args) throws IOException {
 for (int cont = 1;cont <=5;cont++){
      Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:http://www.google.com");
 }       
    }
    
}
