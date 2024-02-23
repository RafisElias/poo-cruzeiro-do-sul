public class Pessoa {
    private int idade;
    private String nome;
    private String cpf;
    private String raca;

    public Pessoa(String nome, int idade, String cpf, String raca) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void showDados() {
        System.out.printf("Nome: %s\nIdade: %d\nCPF: %s\nRaça: %s\n", this.nome, this.idade, this.cpf, this.raca);
    }

    public void andar() {
        System.out.println("Andando....");
    }

    public void trabalhar() {
        System.out.println("Trabalhando....");
    }
}
