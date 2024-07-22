package capitulo5.exemplos.exemplo6;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private String cpf;
    private String nome;
    private Funcionario supervisor;
    private List<Funcionario> listaSupervisionados;

    public Funcionario() {
        listaSupervisionados = new ArrayList();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }

    public List<Funcionario> getSupervisionados() {
        return listaSupervisionados;
    }

    public void setSupervisionados(List<Funcionario> supervisionados) {
        this.listaSupervisionados = supervisionados;
    }

    public void adicionarSupervisionado(Funcionario supervisionado) {
        listaSupervisionados.add(supervisionado);
    }

    public void removerSupervisionado(Funcionario supervisionado) {
        listaSupervisionados.remove(supervisionado);
    }
}
