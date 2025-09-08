At. POO Lista 4 - questao 4 Crie a classe livro

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Livro '" + this.titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Livro '" + this.titulo + "' devolvido com sucesso.");
        } else {
            System.out.println("Livro '" + this.titulo + "' já está disponível.");
        }
    }
}

public class Biblioteca {
    private Livro[] livros;
    private int contadorLivros;

    public Biblioteca(int capacidade) {
        this.livros = new Livro[capacidade];
        this.contadorLivros = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (this.contadorLivros < this.livros.length) {
            this.livros[this.contadorLivros] = livro;
            this.contadorLivros++;
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca.");
        } else {
            System.out.println("Biblioteca cheia. Não é possível adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < this.contadorLivros; i++) {
            if (this.livros[i].getTitulo().equals(titulo)) {
                this.livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < this.contadorLivros; i++) {
            if (this.livros[i].getTitulo().equals(titulo)) {
                this.livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro '" + titulo + "' não encontrado.");
    }

    public void mostrarLivros() {
        System.out.println("\n--- Livros na Biblioteca ---");
        if (this.contadorLivros == 0) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (int i = 0; i < this.contadorLivros; i++) {
                System.out.println("Título: " + this.livros[i].getTitulo() + ", Autor: " + this.livros[i].autor + ", Estado: " + (this.livros[i].isDisponivel() ? "Disponível" : "Emprestado"));
            }
        }
        System.out.println("---------------------------\n");
    }
}

public class Principal {
    public static void main(String args[]) {
        Biblioteca minhaBiblioteca = new Biblioteca(5);

        minhaBiblioteca.adicionarLivro(new Livro("Dom Quixote", "Miguel de Cervantes"));
        minhaBiblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        minhaBiblioteca.adicionarLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));

        minhaBiblioteca.mostrarLivros();

        minhaBiblioteca.emprestarLivro("1984");

        minhaBiblioteca.mostrarLivros();

        minhaBiblioteca.devolverLivro("1984");

        minhaBiblioteca.mostrarLivros();
    }
}
