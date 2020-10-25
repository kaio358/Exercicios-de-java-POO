public class ContaBancaria {
    int agencia,numeroDaConta,opção;
    float saldo,valor;
    String status;
    void mostraDados (){
        if (saldo >=0){
            System.out.println("Você está positivo =D");
        }else{
            System.out.println("Você está devendo, por favor "
                    + "regularize o seu débito com o banco");
        }   
    }
    void depositar(float valor){
        saldo = saldo+valor;
    }
    void sacar (float valor){
        if (saldo >valor){
            saldo = saldo-valor;
        }else{
            System.out.println("ERRO,Acesso negado");
        }
        
    }
}
