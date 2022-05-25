package banco.dio;


import java.util.ArrayList;

public class Banco {

    protected static final String BANK = "BANCO MILIONÁRIO";
    protected static final double NUMERO_BANK = 44;

    private String nomeBanco;
    private double codigo;
    private ArrayList<Conta> contas;

    public Banco(){
        this.nomeBanco = BANK;
        this.codigo = NUMERO_BANK;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }
    public double getCodigo() {
        return this.codigo;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
}