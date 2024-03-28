package view;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.adicionarContato(new Contato("Jo�o", "123456789", "joao@example.com"));
        agenda.adicionarContato(new Contato("Maria", "987654321", "maria@example.com"));

        Contato c = agenda.buscarContato("Jo�o");
        if (c != null) {
            System.out.println("Contato encontrado: " + c.getNome());
        } else {
            System.out.println("Contato n�o encontrado.");
        }

    }
}
