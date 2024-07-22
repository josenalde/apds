package capitulo5.exercicios.exercicio4;

public class Jogavel extends Personagem implements Controle{
    private int nivel;

    public Jogavel (Jogo jogo, String nome, int vitalidade, int nivel){
        super(jogo, nome, vitalidade);
        setNivel(nivel);
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 5){
            this.nivel = nivel;
        }
    }
    
    @Override
    public void aplicarGolpeEspecial(Personagem adversario){
        adversario.setVitalidade(adversario.getVitalidade() - (10 * nivel));
    }
    
    @Override
    public void botaoA(Personagem personagem){
        aplicarGolpeNormal(personagem);
    }
    
    @Override
    public void botaoB(Personagem personagem){
        aplicarGolpeEspecial(personagem);
    }
    
}
