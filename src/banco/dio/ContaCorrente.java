package banco.dio;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato da Conta Corrente ---");
        System.out.println("");
        imprimeExtrato();  
        System.out.println(String.format("Imposto (transferência): %.2f",this.imposto));
    }
    
}
