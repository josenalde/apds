package capitulo5.exercicios.exercicio2;

public class Vantagem extends Clube {

    private float milhas;

    public Vantagem(String nome, float milhas) {
        super(nome);
        this.milhas = milhas;
    }

    public float getMilhas() {
        return milhas;
    }

    public void setMilhas(float milhas) {
        this.milhas = milhas;
    }

    @Override
    public float calcularPontos() {
        return milhas * 1.5f;
    }
}
