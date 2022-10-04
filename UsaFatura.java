public class UsaFatura {
    public static void main(String[] args) {
        Fatura titular = new Fatura();
        Fatura dep1, dep2, dep3;
        
        titular.pontuacao = 100;
        titular.valor = 1500.5f;

        //utiliza metodos somaCom
        dep1 = titular.somaCom(50);
        dep2 = titular.somaCom(100, 550.5f);
        dep3 = titular.somaCom(dep1);


        // mostra os dados das faturas
        titular.print();
        dep1.print();
        dep2.print();
        dep3.print();
    }
}
