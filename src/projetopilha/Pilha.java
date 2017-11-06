package projetopilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    private List<String> nomes = new LinkedList<>();

    public void insere(String s) {
        nomes.add(s);
    }

    public String excluir() {
        if (!vazia()) {
            return nomes.remove(nomes.size() - 1);
        } else {
            return "Pilha vazia.";
        }
    }

    public boolean vazia() {
        return nomes.isEmpty();
    }

    @Override
    public String toString() {
        return nomes.toString();
    }

}

