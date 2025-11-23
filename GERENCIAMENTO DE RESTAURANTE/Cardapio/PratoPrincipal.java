public class PratoPrincipal extends ItemCardapio {

    public PratoPrincipal(String nome, double precoBase) {
        super(nome, precoBase);
    }
  
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
