Atividade POO / Lista 4 questão 2

public class Carro {
    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getAno() {
        return this.ano;
    }
}

public class Principal {
    public static void main(String args[]) {
        Carro meuCarro = new Carro("Mazda", 2007);

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Ano: " + meuCarro.getAno());
    }
}
