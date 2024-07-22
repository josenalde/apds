import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private int quantidadeCreditos;
    private List<Turma> listaTurmas;

    public Disciplina() {
        listaTurmas = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCreditos() {
        return quantidadeCreditos;
    }

    public void setQuantidadeCreditos(int quantidadeCreditos) {
        this.quantidadeCreditos = quantidadeCreditos;
    }

    public List<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(List<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public void adicionarTurma(Turma turma) {
        listaTurmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        listaTurmas.remove(turma);
    }
}
