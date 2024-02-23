public class Caes {
    private String nome;
    private int idade;
    private String raca;
    private boolean temDono;

    public Caes(String nome, String raca, int idade, boolean temDono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.temDono = temDono;
    }

    public void mostraInformacoes() {
        System.out.println("Essas são as informa");
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Idade: " + this.idade);
        System.out.println("Tem dono?: " + (this.temDono ? "Tem" : "Não tem"));
    }

    public void latir() {
        System.out.println("Au Au AU!!!");
    }

}
