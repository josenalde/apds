package capitulo5.exercicios.exercicio4;

public class NaoJogavel extends Personagem {

    private boolean aliado;

    public NaoJogavel(Jogo jogo, String nome, int vitalidade, boolean aliado) {
        super(jogo, nome, vitalidade);
        setAliado(aliado);
    }

    public boolean isAliado() {
        return aliado;
    }

    public void setAliado(boolean aliado) {
        this.aliado = aliado;
    }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        int dano = 20;

        if (getJogo().getDificuldade().equals("Médio")) {
            dano = 30;
        }
        if (getJogo().getDificuldade().equals("Difícil")) {
            dano = 40;
        }
        adversario.setVitalidade(adversario.getVitalidade() - (dano));
        
    }

}
