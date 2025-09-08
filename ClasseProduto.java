public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.setPreco(preco);
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }
}

public class Principal {
    public static void main(String args[]) {
        Produto produto1 = new Produto("Caderno", 15.50);
        System.out.println("Produto: " + produto1.getNome() + ", Preço: R$" + produto1.getPreco());

        Produto produto2 = new Produto("Caneta", -2.00);
        System.out.println("Produto: " + produto2.getNome() + ", Preço: R$" + produto2.getPreco());
    }
}
