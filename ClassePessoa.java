atividade POO / Lista 4 questão 1

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Principal {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Ana", 25);
        
        Pessoa p2 = new Pessoa("Carlos", 30);

        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
    }
}
