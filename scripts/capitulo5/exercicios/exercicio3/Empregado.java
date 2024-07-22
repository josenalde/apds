package capitulo5.exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

    private String nome;
    private float salario;
    private List<Alocacao> listaAlocacoes;
    private List<Telefone> listaTelefones;

    public Empregado() {
        listaAlocacoes = new ArrayList();
        listaTelefones = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public List<Alocacao> getListaAlocacoes() {
        return listaAlocacoes;
    }

    public void setListaAlocacoes(List<Alocacao> listaAlocacoes) {
        this.listaAlocacoes = listaAlocacoes;
    }

    public void adicionarAlocacao(Alocacao alocacao) {
        listaAlocacoes.add(alocacao);
    }

    public void removerAlocacao(Alocacao alocacao) {
        listaAlocacoes.remove(alocacao);
    }
    
    public void adicionarTelefone(Telefone telefone) {
        listaTelefones.add(telefone);
    }

    public void removerTelefone(Telefone telefone) {
        listaTelefones.remove(telefone);
    }

    public List<Telefone> getListaTelefones() {
        return listaTelefones;
    }

    public void setListaTelefones(List<Telefone> listaTelefones) {
        this.listaTelefones = listaTelefones;
    }

}
