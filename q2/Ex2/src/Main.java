import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("Antonia",666,"66-6",666.66, LocalDate.now());

        System.out.println("Saque: "+ conta.sacar(50));
        System.out.println("Deposito: " + conta.depositar(99));
        System.out.println("Rendimento Mensal: " + conta.Rendimento());


    }


    }
