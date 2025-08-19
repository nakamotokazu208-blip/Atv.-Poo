public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Pessoa1";
        aluno1.matricula = 0123456;
        aluno1.notaAv1 = 7.5;
        aluno1.notaAv2 = 8.0;

        System.out.println("Dados do Aluno 1");
        aluno1.mostrarDados();
        double media1 = aluno1.calcularMedia();
        System.out.println("Média do aluno: " + String.format("%.2f", media1));
        System.out.println("Situação: " + aluno1.verificarAprovacao());

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pessoa2";
        aluno2.matricula = 8303356;
        aluno2.notaAv1 = 4.8;
        aluno2.notaAv2 = 7.2;
    
        System.out.println("Dados do Aluno 2");
        aluno2.mostrarDados();
        double media2 = aluno2.calcularMedia();
        System.out.println("Média do aluno: " + String.format("%.2f", media2));
        System.out.println("Situação: " + aluno2.verificarAprovacao());
    }
}
    class Aluno {
        String nome;
        int matricula;
        double notaAv1;
        double notaAv2;

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nota AV1: " + this.notaAv1);
        System.out.println("Nota AV2: " + this.notaAv2);
    }

    public double calcularMedia() {
        return (this.notaAv1 + this.notaAv2) / 2;
    }

    public String verificarAprovacao() {
        double media = this.calcularMedia();

        if (media >= 7.0) {
            return "Aprovado!";
        } else if (media >= 4.0) {
            return "Em prova final.";
        } else {
            return "Reprovado.";
        }
    }
}