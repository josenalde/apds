package capitulo5.exercicios.exercicio4;

public abstract class Personagem {
    private String nome;
    private int vitalidade;
    private Jogo jogo;

    public Personagem(Jogo jogo, String nome, int vitalidade){
        setJogo(jogo);
        setNome(nome);
        setVitalidade(vitalidade);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        if (vitalidade >= 0 && vitalidade <=100){
            this.vitalidade = vitalidade;    
        }
    }
    
    public void aplicarGolpeNormal (Personagem adversario){
        adversario.setVitalidade(adversario.getVitalidade() - 10);
    }
    
    public abstract void aplicarGolpeEspecial(Personagem adversario);    

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
