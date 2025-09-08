Atv. POO ATV4 - Crie a classe Pessoa

public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumero() {
        return this.numero;
    }
}

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco; 

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Endereço: " + this.endereco.getRua() + ", " + this.endereco.getNumero());
    }
}

public class Principal {
    public static void main(String args[]) {
        Endereco end1 = new Endereco("Rua das Fulano", 123);
        Endereco end2 = new Endereco("Avenida Fulano1", 456);

        Pessoa p1 = new Pessoa("Dan", 28, end1);
        Pessoa p2 = new Pessoa("Duck", 99, end2);

        p1.mostrarDados();
        System.out.println("---");
        p2.mostrarDados();
    }
}
