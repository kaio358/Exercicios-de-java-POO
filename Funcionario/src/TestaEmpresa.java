
public class TestaEmpresa {
    public static void main (String [] args){
        Vendedor kaio = new Vendedor ("Kaio",123456,234567,10000);
        System.out.println(kaio.vendedorValorDaComissão());
        Gerente kaka = new Gerente("Kaka",345678,456789,10000);
        System.out.println(kaka.gerenteValorDaComessão());
    }
}
