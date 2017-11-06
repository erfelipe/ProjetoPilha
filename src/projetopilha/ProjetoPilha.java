package projetopilha;

public class ProjetoPilha {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.insere("Fulano de Tal");
        System.out.println(pilha);
        pilha.insere("Alberto");
        System.out.println(pilha);
        pilha.insere("Adriana");
        System.out.println(pilha);

        String teste = pilha.excluir();
        System.out.println("Excluído: " + teste);
        System.out.println(pilha);

        pilha.excluir();
        System.out.println(pilha);

        pilha.excluir();
        System.out.println(pilha);

        pilha.excluir();
        System.out.println(pilha);
    }

}
