package capitulo5.exercicios.desafio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List <Assinatura> pacote;
    private Streaming aluguel;

    public Cliente(String nome){
        setNome(nome);
        pacote = new ArrayList();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List <Assinatura> getPacote() {
        return pacote;
    }

    public void setPacote(List <Assinatura> pacote) {
        this.pacote = pacote;
    }

    public Streaming getAluguel() {
        return aluguel;
    }

    public void setAluguel(Streaming aluguel) {
        this.aluguel = aluguel;
    }
    
    public void adicionarAssinatura(Assinatura a){
        pacote.add(a);
    }
    
    public void removerAssinatura(Assinatura a){
        pacote.remove(a);
    }
    
    public float pagar(){
        float valor = 0;
        Iterator<Assinatura> iterator = pacote.iterator();
        while (iterator.hasNext()){
            valor = valor + iterator.next().calcularCustoMensal();
        }
        valor += aluguel.calcularCustoMensal();
        if (pacote.size() >= 2){
            valor = valor - Assinatura.calcularDesconto(valor, pacote.size()-1);
        }
        return valor;
    }
    
}
