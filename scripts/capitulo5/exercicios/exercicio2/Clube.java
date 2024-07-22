package capitulo5.exercicios.exercicio2;

public abstract class Clube implements Pontuacao{
    private String nome;

    public Clube (String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
