import entities.Cliente;
import entities.exception.ClienteException;

public class Programa {
    public static void main(String[] args) throws ClienteException {

        Cliente c1 = new Cliente("Jairo", "Figueiredo", "12345678", 500.0);

       try {
           c1.depositar(-500.0);
           c1.comprar(300.0);
           c1.contrairDivida(3000.0);
           System.out.println("Contraindo a dívida");
           System.out.printf("Divida atual: R$ %.2f%n", c1.getDivida());

           System.out.println("");
           System.out.printf("Saldo atual: R$ %.2f%n", c1.getSaldoEmConta());
           System.out.printf("Limite atual: R$ %.2f%n", c1.getLimite());
           System.out.printf("Saldo + limite atual: R$ %.2f%n", (c1.getSaldoEmConta() + c1.getLimite()));

           System.out.println("");
           System.out.println("Pagando a dívida");
           c1.pagarDivida(3000.0);
           System.out.printf("Divida atual: R$ %.2f%n", c1.getDivida());
       }catch (ClienteException e){
           System.err.println(e);
       }
       finally {
           System.out.println("Programa finalizado.");
       }
    }
}
