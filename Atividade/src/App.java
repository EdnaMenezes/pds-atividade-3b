public class App {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa para cada estudante
        Pessoa[] pessoas = {
            new Pessoa("Maria Edna Menezes Fernandes", 19)
        };

        // Exibindo as informações dos estudantes
        for (Pessoa pessoa : pessoas) {
            pessoa.exibirInformacoes();
        }
    }
}
