
public class Principal {
public static void main (String []args){
    
    
    System.out.println("A tabela indica os pokemons e o tipo deles");
   
    System.out.println("Tipo     |  Nome do pokemon    ");
    System.out.println("Ar       |   Pidgey            ");
    System.out.println("Agua     |   Squirtle          ");
    System.out.println("Terra    |   Geodude           ");
    System.out.println("Fogo     |   Charmander        ");
    System.out.println("Eletrico |   Pikachu           ");
    System.out.println("Psciquico|   Kadraba          ");

   
    Ar a1 = new Ar("Pidegey","Player 1",15,0);
    a1.atacar(10,2);
    Agua b1 = new Agua("Squirtle","Player 1",15,0);
    b1.atacar(8, 2);
    Terra c1 = new Terra("Geodude","Player 1",15,0);
    c1.atacar(8, 2);      
    Fogo d1 = new Fogo("Charmander","Player 1",15,0);
    d1.atacar(8, 2);      
    Elétrico e1 = new Elétrico("Pikachu","Player 1",15,0);
    e1.atacar(8,2);
    Psciquico f1 = new Psciquico ("Kadraba","Player 1",15,0);
    f1.atacar(8,2);            
    System.out.println("");
    a1.morrer();
    b1.morrer();
    c1.morrer();
    d1.morrer();
    e1.morrer();
    f1.morrer();
}     
}