public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Porsche", "VK45.01(p)", 1941);
        Carro carro2 = new Carro("Volkswagen", "Fusca", 1970);
    
        System.out.println("Carro 1:");
        carro1.mostrarInformacoes();
        System.out.println("\nCarro 2:");
        carro2.mostrarInformacoes();

        System.out.println("Alterando os atributos do Carro 1");
        carro1.modelo = "Voksvagen Typ 1";
        carro1.ano = 1950;
        
        System.out.println("Informações do Carro 1 após a modificação");
        carro1.mostrarInformacoes();
        
        carro1.ligarCarro();
        carro2.ligarCarro();
    }
}
class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void ligarCarro() {
        System.out.println("O " + marca + " " + modelo + " foi ligado.");
    }
}
