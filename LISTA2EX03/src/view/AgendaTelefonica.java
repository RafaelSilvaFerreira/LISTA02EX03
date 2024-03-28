package view;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        Contato contato = null;
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                contato = c;
                break;
            }
        }
        if (contato != null) {
            contatos.remove(contato);
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

}
