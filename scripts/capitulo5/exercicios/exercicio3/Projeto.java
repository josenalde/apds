package capitulo5.exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private float valor;
    private List<Alocacao>listaAlocacoes;

    public Projeto(){
        listaAlocacoes=new ArrayList();
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<Alocacao> getListaAlocacoes() {
        return listaAlocacoes;
    }

    public void setListaAlocacoes(List<Alocacao> listaAlocacoes) {
        this.listaAlocacoes = listaAlocacoes;
    }
    
    public void adicionarAlocacao(Alocacao alocacao){
        listaAlocacoes.add(alocacao);
    }
    
    public void removerAlocacao(Alocacao alocacao){
        listaAlocacoes.remove(alocacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
