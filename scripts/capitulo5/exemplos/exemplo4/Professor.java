import java.util.ArrayList;
import java.util.List;

public class Professor {

    private String nome;
    private String titulacao;
    private List<Turma> listaTurmas;

    public Professor() {
        listaTurmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
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
