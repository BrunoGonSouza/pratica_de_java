public class Conta {
    String numero;
    double saldo;

    public Conta(String n, double v){
        numero = n;
        saldo = v;
    }
    public void imprimeDados(){
        System.out.println("Número: " + numero + "\nSaldo: " + saldo);
    }
    public void sacarValor(double valor){
        if (saldo >= valor){
            saldo = saldo - valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public double maiorSaldo(Conta c){
        if (this.saldo > c.saldo){
            return this.saldo; //o objeto que chama o metodo possui o maior saldo
        } 
        else{
            return c.saldo;
        }
    }
}
