package banco.dio;

public abstract class Conta implements IConta{
	
		
	

    private static final int AGENCIA_PADRAO = 1;
    private static final int SALDO_PADRAO = 0;
	private static final double IMPOSTO = 10;
    private static int SEQUENCIAL = 00;

    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected double imposto;
    protected Cliente cliente;
    

 
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = ++SEQUENCIAL;
        this.saldo = SALDO_PADRAO;
        this.cliente = cliente;
        this.imposto = IMPOSTO;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor; 
    }
 
    @Override
    public boolean sacar(double valor) {
		
    	if(this.saldo >= valor) {
            this.saldo = saldo - valor;
       
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void transferir(IConta contaDestino, double valor) {
    	
			this.saldo -= valor + IMPOSTO;
			contaDestino.depositar(valor);
			
			
	}
    
    protected void imprimeExtrato() {
    	
        System.out.println(String.format("Titular: %s %s.", cliente.getNome(), cliente.getSobrenome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        
        
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }

	public static int getAgenciaPadrao() {
		return AGENCIA_PADRAO;
	}

	public static int getSaldoPadrao() {
		return SALDO_PADRAO;
	}

	public double getImposto() {
		return imposto;
	}
    
	
    

}