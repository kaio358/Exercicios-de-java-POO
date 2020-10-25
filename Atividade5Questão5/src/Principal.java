public class Principal {
    public static void main (String []args){
        Camarote c = new Camarote(100);
        System.out.println(c.imprimirValorDoCamarote());
        Vip v = new Vip(100);
        System.out.println(v.novoValor());
        Normal n = new Normal(100);
        System.out.println(n.imprimirValorDoIngresso());
    } 


}