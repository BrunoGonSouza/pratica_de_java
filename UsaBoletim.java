import javax.swing.JOptionPane;

public class UsaBoletim {
    public static void main(String[] args) {
        Boletim poo, tda;

        poo = new Boletim(8.5, 9.5);
        tda = new Boletim(5.4, 3.6);

        poo.calculaMedia();
        tda.calculaMedia();

        poo.imprimeBoletim();
        tda.imprimeBoletim();

        // JOptionPane.showMessageDialog(null, "Conceito Poo: " + poo.verificaConceito());

        // JOptionPane.showMessageDialog(null, "Conceito Tda: " + tda.verificaConceito());
    }
}
