package capitulo5.exemplos.exemplo2;

import capitulo5.exemplos.exemplo1.Professor;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Colecao {

    public static void main(String[] args) {
        List<Professor> listaProfessores = new LinkedList();
        for (int i = 0; i < 10; i++) {
            Professor prof = new Professor();
            System.out.println("Entre com o nome do professor: ");
            String n = new java.util.Scanner(System.in).next();
            prof.setNome(n);
            listaProfessores.add(prof);
        }
        Iterator<Professor> iterator = listaProfessores.iterator();
        while (iterator.hasNext()) {
            Professor professor = iterator.next();
            System.out.println("Nome: " + professor.getNome());
        }
    }
}
