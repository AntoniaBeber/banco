import java.time.LocalDate;

//3) Modele um conta.
// Ela deve ter o nome do titular ( String ),
// o número (int ),
// a agência (String),
// o saldo (double)
// data de abertura (LocalDate).
// Além disso, a conta deve fazer as seguintes ações:
// sacar para retirar um valor do saldo;
// depositar a fim de adicionar um valor ao saldo;
// calculaRendimento para devolver o seu ganho mensal.
//Transforme o modelo acima em uma classe Java.
// Teste-a usando uma outra classe que tenha o main.
//A classe Conta deve conter, além dos atributos mencionados anteriormente,
// pelo menos os seguintes métodos:
//saca que recebe um valor como parâmetro e o retira do saldo da conta;
//deposita que recebe um valor como parâmetro e o adiciona ao saldo da conta;
//calculaRendimento que não recebe parâmetro algum e devolve o valor reajustado com um
//rendimento de 1% ao mês.
//
public class Conta {

    private String Titular;
    private int numeroDaConta;
    private String agencia;
    private double saldo;
    private LocalDate dataDeAbertura;
    private double rendimentoMensal = saldo * 0.1;

    public Conta(String titular, int numeroDaConta, String agencia, double saldo, LocalDate dataDeAbertura) {
        this.Titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = dataDeAbertura;
    }

    public double sacar(double valor){
       if (saldo <=0){
           throw new RuntimeException("Não é possivel sacar se o saldo estiver negativo");
    }
      else {
          return saldo - valor;
       }

       }
    public double depositar(double valorDeposito){
    return saldo + valorDeposito;
    }

    public double Rendimento(){
        return saldo + rendimentoMensal;
    }

}

