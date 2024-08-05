package capitulo5.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private String dificuldade;
    private List<Personagem> listaPersonagens;

    public Jogo (String dificuldade){
        setDificuldade(dificuldade);
        listaPersonagens = new ArrayList();
    }
    
    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public List<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    public void setListaPersonagens(List<Personagem> listaPersonagens) {
        this.listaPersonagens = listaPersonagens;
    }
    
    public void adicionar(Personagem personagem){
        listaPersonagens.add(personagem);
    }
    
    public void remover(Personagem personagem){
        listaPersonagens.remove(personagem);
    }
    
}
