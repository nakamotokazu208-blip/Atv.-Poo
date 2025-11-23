public class Bebida extends ItemCardapio {
    private boolean temAlcool;
    private static final double TAXA_ALCOOL = 0.15; 

    public Bebida(String nome, double precoBase, boolean temAlcool) {
        super(nome, precoBase);
        this.temAlcool = temAlcool;
    }

    public double calcularPrecoFinal() {
        double preco = getPrecoBase();
        if (temAlcool) {
            return preco * (1 + TAXA_ALCOOL);
        }
        return preco;
    }
}
