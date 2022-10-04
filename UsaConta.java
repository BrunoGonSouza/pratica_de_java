import java.util.Scanner;

public class UsaConta {
    public static void main(String[] args) {
        Conta c1, c2;
        double valor;

        String numero;
        
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite o número da conta");
        numero = leia.nextLine();

        System.out.println("Digite o saldo da conta");
        valor = leia.nextDouble();

        c1 = new Conta(numero, valor);
        c2 = new Conta("123", 1000.5);

        c1.sacarValor(1500);
        c2.sacarValor(500);
        c2.imprimeDados();

        System.out.println("Maior saldo: " + c1.maiorSaldo(c2));
    }
}
