package banco.dio;

public class Main extends Banco{
    public static void main(String[] args) {

        Cliente rock = new Cliente();
        rock.setNome("ROCK");
        rock.setSobrenome("BALBOA");

        Conta cc = new ContaCorrente(rock);
        Conta cp = new ContaPoupanca(rock);

        cc.depositar(750);
        cc.transferir(cp, 300);
        cp.depositar(100);
        
        System.out.println(String.format("*************\t %s \t*************", BANK  ));
        System.out.println(" ");
        cc.imprimirExtrato();
        cp.imprimirExtrato();
       
        
    }
}