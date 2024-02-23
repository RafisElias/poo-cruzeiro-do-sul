public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafael", 50, "999999999", "pardo");
        pessoa.showDados();
        pessoa.andar();
        pessoa.trabalhar();

        Caes cao = new Caes("Jorge", "caramelo", 5, true);
        cao.mostraInformacoes();
        cao.latir();
    }
}