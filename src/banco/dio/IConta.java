package banco.dio;

public interface IConta {

    void depositar(double valor);

    boolean sacar (double valor);

    void transferir(IConta contaDestino, double valor); 

    void imprimirExtrato();
}
