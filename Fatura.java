import javax.swing.JOptionPane;

public class Fatura{
    float valor;
    int pontuacao;

    public Fatura(){} //construtor padrão

    public Fatura(float v, int i){ //construtor com parametros
        valor = v;
        pontuacao = i;
    }
    
    public Fatura somaCom(int pont){
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + pont;
        aux.valor = this.valor;
        return aux;
    }
    public Fatura somaCom(int pont, float v){
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + pont;
        aux.valor = this.valor + v;
        return aux;
    }
    public Fatura somaCom(Fatura f){
        Fatura aux = new Fatura();
        aux.pontuacao = this.pontuacao + f.pontuacao;
        aux.valor = this.valor + f.valor;
        return aux;
    }

    public void print(){
        JOptionPane.showMessageDialog(null, "Valor: " + valor + "\npontuacao: " + pontuacao);
    }

}