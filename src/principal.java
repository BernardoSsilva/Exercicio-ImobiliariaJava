import imobiliaria.controleDados;

public class principal {
    public static void main(String[] args) {
        // instanciando um objeto
        controleDados lote = new controleDados();
        // controle dados se tornou como uma função
        lote.recebeDados();
        System.out.println(" ");
        lote.mostraDados();
    }
}
