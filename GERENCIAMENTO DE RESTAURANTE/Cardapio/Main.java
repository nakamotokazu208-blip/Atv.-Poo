public class Main {

    public static void main(String[] args) {
        PratoPrincipal lasanha = new PratoPrincipal("Lasanha a Bolonhesa", 45.00);
        Bebida agua = new Bebida("Água sem gás", 5.00, false);
        Bebida vinho = new Bebida("Vinho Tinto da Casa", 60.00, true);

        Pedido pedido1 = new Pedido();

        pedido1.adicionarItem(lasanha);      
        pedido1.adicionarItem(agua, 3);     
        pedido1.adicionarItem(vinho);

        System.out.printf("Custo Lasanha (sem taxa): R$ %.2f%n", lasanha.calcularPrecoFinal());
        System.out.printf("Custo Água (sem taxa): R$ %.2f%n", agua.calcularPrecoFinal());
        System.out.printf("Custo Vinho (COM TAXA de 15%%): R$ %.2f%n", vinho.calcularPrecoFinal());

        double totalBruto = pedido1.calcularTotal();
        System.out.printf("\nTotal Bruto do Pedido (antes do desconto): R$ %.2f%n", totalBruto);

        System.out.printf("Preço Base do Vinho (Getter): R$ %.2f%n", vinho.getPrecoBase());

        pedido1.aplicarDesconto(0.10);
        double totalFinal = pedido1.calcularTotal();
        System.out.printf("Total Final do Pedido (com 10%% de desconto): R$ %.2f%n", totalFinal);
    }
}
